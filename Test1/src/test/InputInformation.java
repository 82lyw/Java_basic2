package test;

import java.util.Scanner;

public class InputInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter your student number:");
        String studentNumber = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("Enter your phone number:");
        input.nextLine();
        String phoneNumber = input.nextLine();

        System.out.println("Enter your QQ:");
        String qq = input.nextLine();

        System.out.println("\n姓名：" + name
                + "\n学号：" + studentNumber
                + "\n年龄：" + age
                + "\n手机号：" + phoneNumber
                + "\nQQ号：" + qq);
    }
}
