package emailApp;

import java.util.Scanner;

public class Email {
 private String Fname;
 private String Lname;
 private String Pass;
 private String department;
 private String email;
 private int mailCapacity = 500;
 private int defaultPasswordLength=10;
 private String alternateEmail;
 private String companySuffix = "kodoshevComp.com";
 	
 public Email(String Fname,String Lname) {
	 this.Fname = Fname;
	 this.Lname = Lname;
	 //System.out.println("Email Created: " + this.Fname + " " + this.Lname );
     this.department = setDepartment();
     //System.out.println("Department: " + this.department);
     this.Pass = randomPass(defaultPasswordLength);
     System.out.println("Your pass is:" + this.Pass);
     email = Fname.toLowerCase() + "." + Lname.toLowerCase() + "@" + department +"."+ companySuffix;
     //System.out.println("Your email is: " + email);
 }
 
 private String setDepartment() {
	 System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Code:");
	 Scanner in = new Scanner(System.in);
	 int depChoise = in.nextInt();
	 if (depChoise == 1) {return "sales";}
	 else if (depChoise == 2) {return "dev";}
	 else if(depChoise == 3) {return "acc";}
	 else {return "";}
	 
 }
 
 private String randomPass(int lenght) {
	 String passSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$";
	 char[] password = new char[lenght];
	 for (int i=0 ; i < lenght; i++) {
		 int rand = (int) (Math.random() * passSet.length());
		 password[i] = passSet.charAt(rand);
		 }
	 return new String (password);
 }
 
 public void setMailboxCapacity(int capacity) {
	 this.mailCapacity = capacity;
 }
 
 public void setAltEmai(String altEmail) {
	 this.alternateEmail = altEmail;
 }
 
 public void changePass(String password) {
	 this.Pass= password;
 }
 
 public int getmailboxCapacity() {return mailCapacity;}
 public String getAlternateEmail() {return alternateEmail; }
 public String getPassword() {return Pass;}
 
 public String ShowInfo() {
	 return "Display Name: " + Fname + " " + Lname + " ," +
			 "\nCompany Email: " + email + " , " +
			 "\nMailBox Capacity: " + mailCapacity + " mb ";
	 }
 }
 
