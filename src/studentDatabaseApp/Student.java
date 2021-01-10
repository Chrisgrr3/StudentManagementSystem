package studentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int year;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int courseCost = 600;
	private static int id = 1000;
//	Constructor: Prompt user to enter student name and year
	public Student() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student year: ");
		this.year = in.nextInt();
		
		setStudentID();
	}
//	Generate an ID
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = year + "" + id;
	}
//	Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance += courseCost;
			}
			else { break;}
		} while(1 != 0);
	}
//	View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
//	Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("How much would you like to pay? \n$");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
//	Show status
	public void showInfo() {
		System.out.println("Name: " + firstName + "" + lastName +
				"\nGrade Level: " + year +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionBalance);
	}
}
