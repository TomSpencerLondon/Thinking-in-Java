package com.codurance.everythingisanobject;

public class Exercise11 {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();
        System.out.println("rainbow.colorNumber = " + rainbow.colorNumber);
        System.out.println("rainbow.hue = " + rainbow.hue);
        rainbow.changeColor(64);
        rainbow.changeHue(32);

        System.out.println("Color changed: rainbow.colorNumber = " + rainbow.colorNumber);
        System.out.println("Hue changed: rainbow.hue =  = " + rainbow.hue);
    }

    static class AllTheColorsOfTheRainbow {
        int colorNumber = 0;
        int hue = 0;

        public void changeColor(int colorNumber) {
            this.colorNumber = colorNumber;
        }

        public void changeHue(int hue) {
            this.hue = hue;
        }
    }
}
