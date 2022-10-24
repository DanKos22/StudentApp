package ie.atu.week6;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
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
    }
}
