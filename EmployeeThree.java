package com.techaxis.practice;

public class EmployeeThree {
	private String name;
	private String address;
	private int yearOfJoining;
	
	


	public void setInformation(String name, String address, int yearOfJoining) {
		this.name = name;
		this.address = address;
		this.yearOfJoining = yearOfJoining;
		
	}

	public static void main(String[] args) {
		
		EmployeeThree e1 =new EmployeeThree();
		EmployeeThree e2 =new EmployeeThree();
		EmployeeThree e3=new  EmployeeThree();
		
		e2.setInformation("Robert", "44C-Walls Street", 1994);
		e3.setInformation("John", "54V-Walls Street", 1999);
		e1.setInformation("Sam","68D-Walls Street",2000);
		System.out.println("Name\t\t"+"Year Of Joining \t\t   "+"Address");
		System.out.println(e1.name+"\t\t    "+e1.yearOfJoining+"\t\t\t"+e1.address);
		System.out.println(e2.name+"\t\t    "+e2.yearOfJoining+"\t\t\t"+e2.address);
		System.out.println(e3.name+"\t\t    "+e3.yearOfJoining+"\t\t\t"+e3.address);
	
	
	}
}
	
