package ie.atu.week6;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        // First instance of Student class
        Student first_Student = new Student();
        first_Student.setName(name);
        System.out.println("Your name is: " + first_Student.getName());

        System.out.println("Please enter your email: ");
        String eMail = input.nextLine();
        first_Student.seteMail(eMail);
        System.out.println("Your email is: " + first_Student.geteMail());

        System.out.println("Please enter your course: ");
        String myCourse = input.nextLine();
        first_Student.setMyCourse(myCourse);
        System.out.println("Your course is: " + first_Student.getMyCourse());

        // Information for the second student
        System.out.println("Please enter the name for the second student: ");
        String name2 = input.nextLine();

        System.out.println("Please enter the 2nd email: ");
        String eMail2 = input.nextLine();

        System.out.println("Please enter the 2nd course: ");
        String myCourse2 = input.nextLine();
        // Second instance of Student class
        Student second_Student = new Student(name2);
        second_Student.seteMail(eMail2);
        second_Student.setMyCourse(myCourse2);
        System.out.println("Name of the second student is: " + second_Student.getName());
        System.out.println("Email of the second student is: " + second_Student.geteMail());
        System.out.println("Course of the second student is: " + second_Student.getMyCourse());

        System.out.println("Please enter the name of the third student: ");
        String name3 = input.nextLine();

        System.out.println("Please enter the email of the 3rd student: ");
        String eMail3 = input.nextLine();

        System.out.println("Please enter the course of the 3rd student: ");
        String myCourse3 = input.nextLine();

        // Third object
        Student third_Student = new Student(name3, eMail3, myCourse3);
        System.out.println("Name of the third student is: " + second_Student.getName());
        System.out.println("Email of the third student is: " + second_Student.geteMail());
        System.out.println("Course of the third student is: " + second_Student.getMyCourse());
    }
}
