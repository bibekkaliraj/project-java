package com.techaxis.practice;

public class Triangle{
	private int oneSide;
	private int secondSide;
	private int thirdSide;

	
public Triangle(int firstSide,int secondSide,int thirdSide) {
	this.oneSide=firstSide;
	this.secondSide=secondSide;
	this.thirdSide=thirdSide;
}
public float getAreaOfTriangle() {
	int p=this.oneSide+this.secondSide+this.thirdSide;
	float area=(float) Math.sqrt(p*(p-this.oneSide)*(p-this.secondSide)*(p-this.thirdSide));
	return area;
}
	public static void main(String[] args) {
		Triangle t=new Triangle(4, 5, 3);
		
		System.out.println("The area is "+ t.getAreaOfTriangle());
		
	}
}
