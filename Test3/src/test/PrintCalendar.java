package test;

import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter full year (e.g. 2019):");
        int year = input.nextInt();
        printYear(year);
    }

    public static void printYear(int year) {
        System.out.println("            " + year);
        for (int i = 1;i <= 12;i++) {
            printMonth(year,i);
        }

    }

    public static void printMonth(int year,int month) {
        printMonthTitle(year,month);
        printMonthBody(year,month);
    }

    public static void printMonthTitle(int year,int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }
        System.out.println("            " + monthName);
        System.out.print("  ---------------------------------\n");
        System.out.print("  SUN  MON  TUE  WED  THU  FRI  SAT\n");
        System.out.print("  ---------------------------------\n");
    }

    public static void printMonthBody(int year,int month) {
        int startDay = getStartDay(year,month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year,month);
        int i;
        for (i = 0;i < startDay;i++) {
            System.out.print("     ");
        }
        for (i = 1;i <= numberOfDaysInMonth;i++) {
            System.out.printf("%5d",i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.print("\n\n");
    }
    public static int getStartDay(int year,int month) {

        if (month == 1 || month == 2) {
            month +=12 ;
            year -=1;
        }

        int j = year/100;
        int k = year%100;

        int x = (1 + (26*(month + 1))/10 + k + k/4 + j/4 +5*j)%7;

        if (x > 0)
            x = x-1;
        else
            x = 6;

        return x;
    }

    public static int getNumberOfDaysInMonth(int year,int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
