package TemperatureConverter;

public enum Temperatures {
    CELSIUS('c'),
    FAHRENHEIT('f'),
    KELVIN('k');

    private final char shortName;

    Temperatures(char shortName) {
        this.shortName = shortName;
    }

    public static String fullName(char shortName) {
        for (Temperatures temperatures : values()) {
            if (temperatures.shortName == shortName) {
                return temperatures.toString().toLowerCase();
            }
        }
        return Temperatures.CELSIUS.toString().toLowerCase();
    }

    public static boolean containsValue(String input) {
        for (Temperatures temperatures : values()) {
            if (temperatures.shortName == input.charAt(0)) {
                return true;
            }
        }
        return false;
    }
}