package TemperatureConverter;

public class RunConverter {

    public void run() {
        showMenuFrom();
        char from = new ReadInput().readTextInput();
        showMenuTo();
        char to = new ReadInput().readTextInput();
        convertValue(from, to);
    }

    public void showMenuFrom() {
        System.out.println("Please enter a value you want to convert from:\n" +
                "c for Celsius\n" +
                "f for Fahrenheit\n" +
                "k for Kelvin ");
    }

    public void showMenuTo() {
        System.out.println("Please enter a value you want to convert to:\n" +
                "c for Celsius\n" +
                "f for Fahrenheit\n" +
                "k for Kelvin ");
    }

    public void convertValue(char from, char to) {
        System.out.println("Enter a value to convert");
        double value = new ReadInput().readNumber();
        switch (from) {
            case 'c':
                new Celsius().convertTo(to, value);
                break;
            case 'f':
                new Fahrenheit().convertTo(to, value);
                break;
            case 'k':
                new Kelvin().convertTo(to, value);
                break;
        }
    }
}
