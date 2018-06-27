package com.techaxis.resturantmanagement.people;

abstract public class Staff extends PersonalInformation {

	private int age;
	private String sex;
	private String qualification;
	private String department;
	private String shift;
	protected float montlySalary;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public float getMontlySalary() {
		return montlySalary;
	}

	public void setMontlySalary(float montlySalary) {
		this.montlySalary = montlySalary;
	}
	
	abstract public float getYearlySalaryWithBouns();

}
