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

        // Second instance of Student class
        Student second_Student = new Student("John");
        System.out.println("Name of the second student is: " + second_Student.getName());

        System.out.println("Please enter the 2nd email: ");
        String eMail2 = input.nextLine();
        second_Student.seteMail(eMail2);
        System.out.println("Email for 2nd student is: " + second_Student.geteMail());

        System.out.println("Please enter the 2nd course: ");
        String myCourse2 = input.nextLine();
        second_Student.setMyCourse(myCourse2);
        System.out.println("Course for the 2nd student: " + second_Student.getMyCourse());

        Student third_Student = new Student("Mike", "G00222444@atu.ie", "Computer science");
        System.out.println("Name of the 3rd student is: " + third_Student.getName());
        System.out.println("Email of the 3rd student is: " + third_Student.geteMail());
        System.out.println("Course of the 3rd student is: " + third_Student.getMyCourse());
    }
}
