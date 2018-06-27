package com.techaxis.practice;

import java.util.Scanner;

public class Employee {
	private float salary;
	private int workingHour;
	private float incrementSalary=0;
	

	/**
	 * @return the totalSalary
	 */
	public float getTotalSalary() {
		return incrementSalary;
	}

	/**
	 * @param totalSalary the totalSalary to set
	 */
	public void setTotalSalary(float totalSalary) {
		this.incrementSalary = totalSalary;
	}

	public void getInfo(float salary, int workingHour) {
		this.salary = salary;
	this.workingHour = workingHour;

	}

	public void addSalary(float salary) {
		if(salary<500) {
			this.incrementSalary+=10;
		}
	}

	private void addWork(int workingHour) {
		if(workingHour>6) {
			this.incrementSalary+=5;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the working salary of employee");
		float salary = sc.nextFloat();
		System.out.println("Enter the working hour of employee");
		int workingHour = sc.nextInt();
		Employee e=new Employee();
		e.getInfo(salary,workingHour);
		e.addSalary(salary);
		e.addWork(workingHour);
		System.out.println("The final salary of employee after increment is"+(salary+e.getTotalSalary()));
		
		
		
		
	}
}
