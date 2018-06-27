package com.techaxis.practice;

import java.util.Scanner;

public class Area {
	private int length;
	private int breadth;

	public Area(int l, int b) {
		// TODO Auto-generated constructor stub
		this.length = l;
		this.breadth = b;
	}

	public int returnArea() {
		return (this.length * this.breadth);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth of reactangle?");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		Area a=new Area(length,breadth);
		System.out.println("your area is"+a.returnArea());
		
	}

}
