package TemperatureConverter;

public class Celsius implements Convertable {

    private static final double ABSOLUTE_ZERO = -273.15;

    @Override
    public void convertTo(char convertTo, double temperature) {
        switch (convertTo) {
            case 'f':
                System.out.println(temperature + " " + Temperatures.fullName('c') + " equals " +
                        (temperature * 9 / 5 + 32) + " " + Temperatures.fullName('f'));
                break;
            case 'k':
                System.out.println(temperature + " " + Temperatures.fullName('c') + " equals " +
                        (temperature - ABSOLUTE_ZERO) + " " + Temperatures.fullName('k'));
                break;
            case 'c':
                System.out.println(temperature + " " + Temperatures.fullName('c') + " equals " +
                        temperature + " " + Temperatures.fullName('c'));
                break;
        }
    }
}
