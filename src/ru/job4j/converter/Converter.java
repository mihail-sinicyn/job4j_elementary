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
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        System.out.println("140 rubles are " + usd + " usd.");
        float expectedDollar = 2.3333333f;
        float outDollar = Converter.rubleToUSD(in);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2.3333333 usd. Test result : " + passedDollar);
    }
}