
import java.util.*;

public class Calendar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, year;
        System.out.print("Please enter month year:");
        String s = input.nextLine();
        String ss[] = s.split(" ");
        Year y = new Year();

        if (ss.length == 2) {
            year = Integer.parseInt(ss[1]);
            month = Integer.parseInt(ss[0]);
            y.printMonth(year,month);
        }
        else if (ss.length == 1) {
            year = Integer.parseInt(ss[0]);
            y.printMonth(year);
        }
    }
}

class Year {
//    public void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter full year (e.g. 2019):");
//        int year = input.nextInt();
//        printYear(year);
//    }
    public void printYear(int year) {
        System.out.println("            " + year);
        printMonth(year);
    }
    public void printMonth(int year,int month) {
        System.out.println("            " + year);
        printMonthTitle(month);
        System.out.println();
        System.out.println("  ---------------------------------  ");
        System.out.println("  SUN  MON  TUE  WED  THU  FRI  SAT  ");
        System.out.println("  ---------------------------------  ");

        int Month = month;
        int startDay = getStartDay(year,Month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year,Month);
        for (int a = 0;a < startDay;a++) {
            System.out.print("     ");
        }
        int j = 0;
        for (j = 1;j <= numberOfDaysInMonth;j++) {
            System.out.printf("%5d",j);
            if ((j + startDay)%7 == 0) {
                System.out.println();
            }
        }
    }

    public void printMonth(int year) {
        for (int i = 1;i <=12;i++) {
            printMonthTitle(i);
            if (i % 3 == 0) {
                System.out.println();
                for (int j = 0;j < 3;j++) {
                    System.out.print("  ---------------------------------  ");
                }
                System.out.println();
                for (int j = 0;j < 3;j++) {
                    System.out.print("  SUN  MON  TUE  WED  THU  FRI  SAT  ");
                }
                System.out.println();
                for (int j = 0;j < 3;j++) {
                    System.out.print("  ---------------------------------  ");
                }
                System.out.println();
                printMonthBody(year,i-2);
                System.out.println();
            }
        }
    }
    public void printMonthTitle(int month) {
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
        System.out.print("             " + monthName + "                ");
    }
    public void printMonthBody(int year,int month) {
        int Month = month;
        int[][] three = new int[3][2];
        int j = 0;
        for (int i = 0;i < 3;i++) {
            int startDay = getStartDay(year,Month);
            three[i][1] = getNumberOfDaysInMonth(year,Month);
            for (int a = 0;a < startDay;a++) {
                System.out.print("     ");
            }
            for (j = 1;j <= 7 - startDay;j++) {
                System.out.printf("%5d",j);
            }
            three[i][0] = j;
            Month++;
            System.out.print("  ");
        }
        System.out.println();
        for (int i = 0;i < 6;i++) {
            for (int x = 0;x < 7;x++) {
                if (three[0][0] <= three[0][1])
                    System.out.printf("%5d" , three[0][0]++);
                else
                    System.out.print("     ");
            }
            System.out.print("  ");

            for (int x = 0;x < 7;x++) {
                if (three[1][0] <= three[1][1])
                    System.out.printf("%5d" , three[1][0]++);
                else
                    System.out.print("     ");
            }
            System.out.print("  ");

            for (int x = 0;x < 7;x++) {
                if (three[2][0] <= three[2][1])
                    System.out.printf("%5d" , three[2][0]++);
                else
                    System.out.print("       ");
            }
            System.out.println();
        }
    }
    public int getStartDay(int year,int month) {
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
    public int getNumberOfDaysInMonth(int year,int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if (month == 2) return isLeapYear(year) ? 29 : 28;
        return 0;
    }

    public boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}

