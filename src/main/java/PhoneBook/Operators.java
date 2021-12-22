package PhoneBook;

import java.util.Locale;

public enum Operators {
    BEELINE(0),
    MEGAFON(1),
    TELE2(2),
    MTS(3);

    private final int code;

    Operators(int code) {
        this.code = code;
    }

    public static String getOperator(int code){
        for (Operators operator : values()) {
            if(operator.code == code){
                return operator.name().toLowerCase(Locale.ROOT);
            }
        }
        return null;
    }
}
