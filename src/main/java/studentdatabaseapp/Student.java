package studentdatabaseapp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {

    //This part is encapsulation
    private String firstName;
    private String lastName;
    private int studentYear;
    private String studentId;
    //cant leave empty because it will return null
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    //when a new student is made, they will have a value of 1000. it will stay with the class
    private static int id = 1000;


    //constructor: prompt user to enter student's name and year
        //not taking anything in argument, asking for inside the method
        public Student(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter student fist name");
            //using nextLine because it takes a string
            this.firstName = scan.nextLine();

            System.out.println("Enter student last name");
            this.lastName = scan.nextLine();

            System.out.println("Enter the student year. Enter 1 for freshman, 2 for sophomore, 3 for junior, 4 for senior");
            //using nextInt to take the number corresponding to the grade year
            this.studentYear = scan.nextInt();

            setStudentID();


        }
    //generate an ID
    //make it handled only here
    private void setStudentID(){
         //every time we create a new student we want to increment by 1
            id++;
            this.studentId = studentYear + "" + id;

        }
    //Enroll into courses
    //not taking any parameters
    public void enroll(){
            //get inside a loop and user hits 0 when done enrolling
        do {
            System.out.print("Enter a course to enroll, type Q to quit:  ");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            if (!course.toUpperCase().equals("Q")) {
                //courses is everything listed above, it is going to equal the courses and then you do a line break and then you add the course you just selected
                //its added in to your list of courses. Every time course is added, you increase tuition blanace
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }

        } while(1 !=0);
    }
    //view balance
    public void viewBalance(){
        System.out.println("Your balance for tuition is: $" + tuitionBalance);
        }


    //if they pay tuition, expect a number so we input in the parameter
    public void payTuition(){
            viewBalance();
            System.out.print("Enter your payment");
            Scanner scan = new Scanner(System.in);
            int payment = scan.nextInt();

            tuitionBalance = tuitionBalance - payment;
        System.out.println("Thanks for the payment of $:" + payment );
        viewBalance();
        }

    //Show status
    public String toString(){
            return "Name: " + firstName + " " + lastName + "\nStudent Grade Level: " + studentYear + "\nStudent ID: "+ studentId +"\nCourses Enrolled: " + courses + "\nBalance : $"+tuitionBalance;
    }

}
