package com.main;

import java.util.Scanner;

import com.adavanced.MoreFeature;

public class MainAppAdavanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		float num1,num2;
		MoreFeature more=new MoreFeature();
		while(true) {
			System.out.println("Advanced Calulator");
		System.out.println("Enter two numbers: ");
		System.out.println("Enter number 1");
		num1=sc.nextFloat();
		System.out.println("Enter number 2:");
		num2=sc.nextFloat();
		more.greaterNum(num1, num2);
		}
	}

}
