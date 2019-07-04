package people;

import java.util.Calendar;

public class People {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();
        Faculty faculty = new Faculty();
        Staff staff = new Staff();

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}

class Staff extends Employee {
    protected String title;

    public String toString() {
        return "Staff";
    }
}

class Faculty extends Employee {
    public static int LECTURER = 1;
    public static int ASSISTANT_PROFESSOR = 2;
    public static int ASSOCIATE_PROFESSOR = 3;
    public static int PROFESSOR = 4;

    protected String officeHours;
    protected int rank;

    public String toString() {
        return "Faculty";
    }
}

class Student extends Person {
    public static int FRESHMAN = 1;
    public static int SOPHOMORE = 2;
    public static int JUNIOR = 3;
    public static int SENIOR = 4;

    protected int status;

    public String toString() {
        return "Student";
    }
}

class Employee extends Person {
    protected String office;
    protected int salary;
    protected Calendar dateHired;

    public String toString() {
        return "Employee";
    }
}

class Person {
    protected String name;
    protected String address;
    protected String phone;
    protected String email;

    public String toString() {
        return "Person";
    }
}