package ie.atu.week6;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Your name is: " + name);

        System.out.println("Please enter your email: ");
        String eMail = input.nextLine();
        System.out.println("Your email is: " + eMail);

        System.out.println("Please enter your course: ");
        String myCourse = input.nextLine();
        System.out.println("Your course is: " + myCourse);
    }
}
