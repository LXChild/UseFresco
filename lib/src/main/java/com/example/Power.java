package com.example;

/**
 * Created by LXChild on 9/27/16.
 */
public final class Power {

    public static double power (double base, int exponent) {
        if (base == 0) {
            return 0.0;
        }
        if (exponent == 0){
            return 1.0;
        }
        if (exponent < 0) {
            exponent = -exponent;
            return 1.0 / (base * power(base, --exponent));
        }
        return base * power(base, --exponent);
    }

    public static double power2(double base, int exponent) {
        if (base == 0) {
            return 0;
        }
        if (exponent == 0){
            return 1.0;
        }
        int result = 1;
        int absexponent = exponent < 0 ? -exponent : exponent;
        while (absexponent-- > 0) {
            result *= base;
        }
        return 1.0 / result;
    }

    public static double power3(double base, int exponent) {
        if (base == 0) {
            return 0;
        }
        if (exponent == 0){
            return 1.0;
        }

        if (exponent < 0) {
            exponent = -exponent;
            double result = power3(base, exponent >> 1);
            result *= result;
            if ((exponent & 1) == 1) {
                result *= base;
            }
            return 1.0 / result;
        }

        double result = power3(base, exponent >> 1);
        result *= result;
        if ((exponent & 1) == 1) {
            result *= base;
        }
        return result;
    }
}
