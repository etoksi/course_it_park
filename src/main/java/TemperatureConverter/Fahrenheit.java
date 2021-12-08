package TemperatureConverter;

public class Fahrenheit implements Convertable {

    private static final double ABSOLUTE_ZERO = -459.67;

    @Override
    public void convertTo(char convertTo, double temperature) {
        switch (convertTo) {
            case 'f':
                System.out.println(temperature + " " + Temperatures.fullName('f') + " equals " +
                        temperature + " " + Temperatures.fullName('f'));
                break;
            case 'c':
                System.out.println(temperature + " " + Temperatures.fullName('f') + " equals " +
                        ((temperature - 32) / 9 * 5) + " " + Temperatures.fullName('c'));
                break;
            case 'k':
                System.out.println(temperature + " " + Temperatures.fullName('f') + " equals " +
                        ((temperature - ABSOLUTE_ZERO) * 5 / 9) + " " + Temperatures.fullName('k'));
                break;
        }
    }
}
