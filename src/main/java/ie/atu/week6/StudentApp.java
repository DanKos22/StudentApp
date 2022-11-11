package ie.atu.week6;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Gather information of the first student
        System.out.println("Please enter the name of the first student: ");
        String name = input.nextLine();

        System.out.println("\nPlease enter the email of the first student: ");
        String eMail = input.nextLine();

        System.out.println("\nPlease enter the course of the first student: ");
        String myCourse = input.nextLine();

        // First instance of Student class
        Student first_Student = new Student();
        first_Student.setName(name);
        first_Student.seteMail(eMail);
        first_Student.setMyCourse(myCourse);

        // Information for the second student
        System.out.println("\nPlease enter the name of the second student: ");
        name = input.nextLine();

        System.out.println("\nPlease enter the email of the second student: ");
        eMail = input.nextLine();

        System.out.println("\nPlease enter the course of the second student: ");
        myCourse = input.nextLine();

        // Second instance of Student class
        Student second_Student = new Student(name);
        second_Student.seteMail(eMail);
        second_Student.setMyCourse(myCourse);

        // Information of the third student
        System.out.println("\nPlease enter the name of the third student: ");
        name = input.nextLine();

        System.out.println("\nPlease enter the email of the 3rd student: ");
        eMail = input.nextLine();

        System.out.println("\nPlease enter the course of the 3rd student: ");
        myCourse = input.nextLine();

        // Third object
        Student third_Student = new Student(name, eMail, myCourse);
    }
}
