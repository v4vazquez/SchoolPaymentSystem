package studentdatabaseapp;

import java.util.Scanner;

public class StudentTuitionPaymentApp {
    public static void main(String[] args) {
//
//            //object
//            Student student1 = new Student();
//
//            calling the method
//                student1.enroll();
//            pay tuition method
//                student1.payTuition();
//        System.out.println(student1.toString());
//
        //Ask how many new students we want to add
        System.out.println("Enter the amount of new students you would like to enroll: ");
        Scanner scan = new Scanner(System.in);
        //Create an array of students based on the size/ of the objects
        int numOfStudents = scan.nextInt();
        Student [] students = new Student[numOfStudents];

        //want to iterate through the creation of new students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();

        }
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i].toString());

        }

    }
}
