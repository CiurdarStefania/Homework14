package ro.fasttracktit.curs14;

public enum CountryType {
    HIGH,
    AVERAGE,
    LOW;

    public static CountryType calculateType(long density) {
        if (density >= 1000) {
            return HIGH;
        } else if (density < 200) {
            return LOW;

        } else {
            return AVERAGE;
        }
    }
}

