package TemperatureConverter;

public class Kelvin implements Convertable {

    private static final double ABSOLUTE_ZERO_FAHRENHEIT = -459.67;
    private static final double ABSOLUTE_ZERO_CELSIUS = -273.15;


    @Override
    public void convertTo(char convertTo, double temperature) {
        switch (convertTo) {
            case 'c':
                System.out.println(temperature + " " + Temperatures.fullName('k') + " equals " +
                        (temperature + ABSOLUTE_ZERO_CELSIUS) + " " + Temperatures.fullName('c'));
                break;
            case 'f':
                System.out.println(temperature + " " + Temperatures.fullName('k') + " equals " +
                        (temperature * 9 / 5 + ABSOLUTE_ZERO_FAHRENHEIT) + " " + Temperatures.fullName('f'));
                break;
            case 'k':
                System.out.println(temperature + " " + Temperatures.fullName('k') + " equals " +
                        temperature + " " + Temperatures.fullName('k'));
                break;
        }
    }
}