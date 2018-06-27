package com.techaxis.practice;

public class Reacangle {
	private int length;
	private int breadth;
public Reacangle(int length,int breadth) {
	this.length=length;
	this.breadth=breadth;
}
private int area(){
	return (this.length*this.breadth);
}
public static void main(String[] args) {
	Reacangle robj=new Reacangle(5, 3);
	System.out.println(robj.area());
	Reacangle robj1=new Reacangle(4, 6);
	System.out.println(robj1.area());
}
}
