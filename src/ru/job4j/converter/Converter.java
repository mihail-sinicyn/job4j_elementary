package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static float rubleToUSD(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        float usd = Converter.rubleToUSD(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + usd + " usd.");
    }
}
