package ru.gb.catch_the_drop;

public class Main {


    public static float sum (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }



    public static boolean bool (int a, int b) {
        int all = a + b;
        if (all >= 10 && all <= 20) {
            return true;
        }
        return false;
        }


    public static void BoolNumber (int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        }   else {
            System.out.println("Число отрицательное");
        }
    }


    public static void UserName(String name) {
        System.out.println("Привет, " +name + "!");
    }


    public static void LeapYear (int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }

    public static void main(String[] args) {
        System.out.println (sum(64, 122,135, 642));
        //System.out.println(bool(10,9)); 
        bool (10,9);
        BoolNumber (-10);
        UserName("Федя");
        LeapYear (2020);
    }
}
