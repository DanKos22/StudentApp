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

        Student second_Student = new Student();
        System.out.println("Please enter the name for second student: ");
        String name2 = input.nextLine();
        second_Student.setName(name2);
        System.out.println("You entered: " + second_Student.getName());

        System.out.println("Please enter the 2nd email: ");
        String eMail2 = input.nextLine();
        second_Student.seteMail(eMail2);
        System.out.println("You entered: " + second_Student.geteMail());

        System.out.println("Please enter the 2nd course: ");
        String myCourse2 = input.nextLine();
        second_Student.setMyCourse(myCourse2);
        System.out.println("You entered: " + second_Student.getMyCourse());

        Student third_Student = new Student(Mike, hms.uss.ie, computer science);
        System.out.println("You entered for name: " + third_Student.getName());
        System.out.println("You entered for email: " + third_Student.geteMail());
        System.out.println("You entered for course: " + third_Student.getMyCourse());


    }
}
