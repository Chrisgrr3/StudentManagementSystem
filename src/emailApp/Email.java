package emailApp;

import java.util.Scanner;

public class Email {
//	Template:
//	Best practice: Encapsulate so that values cannot be accessed by others.
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "mycompany.com";
	
//	Blueprint:
	
//	Constructor should receive first and last name
	public Email(String firstName, String lastName) {
//	Pass in local variables as parameters to set object properties.
//		"this" refers to class-level variable.
		this.firstName = firstName;
		this.lastName = lastName;
		
//		Call method asking for department - return department
		this.department = setDepartment();
		
//		Call method that returns random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
//		Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
//	Ask for department
	private String setDepartment() {
		System.out.print("New worker: " + firstName + ". Department codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if(departmentChoice == 1) return "sales";
		else if(departmentChoice == 2) return "development";
		else if(departmentChoice == 3) return "accounting";
		else return "";
		
	}
//	Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
//		Our resulting password will be an array of characters of the given length
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
//			Math.random() returns a random number between 0 and 1
//			If we multiply by the length of passwordSet, we will
//			generate a number between 0 and its length. Finally,
//			we should ensure to cast this number as an integer to
//			represent indexes of passwordSet.
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
//	Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
//	Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
//	Change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity(){ return mailboxCapacity;}
	public String getAlternateEmail() { return "Alternate email: " + alternateEmail;}
	public String getPassword() { return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}
