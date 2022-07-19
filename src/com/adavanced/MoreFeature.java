package com.adavanced;

public class MoreFeature {
	private float num1;
	private float num2;
	
	public MoreFeature() {
		// TODO Auto-generated constructor stub
		num1=0.0f;
		num2=0.0f;
	}

	public MoreFeature(float num1, float num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}
	//advanced feature
	
	public void greaterNum(float a, float b) {
		if(a>b) {
			System.out.println(a+" is greater than "+ b);
		}
		else {
			System.out.println(b+" is greater than "+a);
		}
	}
}
