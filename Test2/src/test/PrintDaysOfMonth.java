package test;

import java.util.Scanner;

public class PrintDaysOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean leapYear;

        System.out.println("Enter a year:");
        int year = input.nextInt();
        input.nextLine();

        if (year % 4 == 0 && year % 100 != 0) {
            leapYear = true;
        }
        else if (year % 400 == 0) {
            leapYear = true;
        }
        else {
            leapYear = false;
        }

        System.out.println("Enter a month:");
        String month = input.nextLine();

        int days = 0;

        switch (month) {
            case "Jan":
                days = 31;
                break;
            case "Feb":
                if (leapYear) {
                    days = 29;
                }
                else {
                    days = 28;
                }
                break;
            case "Mar":
                days = 31;
                break;
            case "Apr":
                days = 30;
                break;
            case "May":
                days = 31;
                break;
            case "June":
                days = 30;
                break;
            case "July":
                days = 31;
                break;
            case "Aug":
                days = 31;
                break;
            case "Sep":
                days = 30;
                break;
            case "Oct":
                days = 31;
                break;
            case "Nov":
                days = 30;
                break;
            case "Dec":
                days = 31;
                break;
            default:
                System.out.println(month + " is not a correct month name!");
                return;
        }
        System.out.println(month + " has " + days + " days.");

    }
}
