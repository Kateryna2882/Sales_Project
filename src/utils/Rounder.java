package utils;

import java.text.DecimalFormat;

public class Rounder {

    public static String round(double value) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(value);
    }
}
