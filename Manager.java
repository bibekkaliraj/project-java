package com.techaxis.resturantmanagement.people;

public class Manager extends Staff {

	private final float BONUS_PERCENTAGE_FOR_MANGER = 0.10f;

	private String[] duties;

	public String[] getDuties() {
		return duties;
	}

	public void setDuties(String[] duties) {
		this.duties = duties;
	}

	@Override
	public float getYearlySalaryWithBouns() {
		return (float) (this.montlySalary * 12 + this.montlySalary * BONUS_PERCENTAGE_FOR_MANGER);
	}
	
	public float getYealySalaryWithBounsPublicly(){
		return this.getYearlySalaryWithBouns();
	}

}
