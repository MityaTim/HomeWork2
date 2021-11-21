package homework;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Main {

    public static void main(String[] args) {
        detectAndPrintNumberSign(-5);
        detectAndPrintNumberSign(0);
        detectAndPrintNumberSign(7);
        boolean res = checkNumberSign(6);
        printStringNumberOfTimes("Hello", 5);
        System.out.println(year(400));
        System.out.println(year(800));
        System.out.println(year(1200));
        System.out.println(year(1201));
        System.out.println(year(100));
        System.out.println(year(200));
        System.out.println(year(300));
        System.out.println(year(104));
        System.out.println(year(3));
        System.out.println(year(4));
        System.out.println(year(7));
        System.out.println(year(8));
    }

    public static boolean checkSum(int a, int b) {

        int s = a + b;
        if ((s >= 10) && (s <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void detectAndPrintNumberSign(int number) {
        if (number < 0) {
            System.out.println("Отрицательное: " + number);
        } else {
            System.out.println("Положительное: " + number);
        }

    }

    public static boolean checkNumberSign(int a) {

        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printStringNumberOfTimes(String str, int numberOfTimes) {

        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println(str);
        }


    }

    public static boolean year(int year) {
        System.out.println();
        System.out.println("year: " + year);
        if (year % 100 == 0 && year % 400 != 0) {

            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}


