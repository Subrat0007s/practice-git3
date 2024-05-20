package com.numbers;

//sum of (power of count) of each digit =number
public class ArmstrongNumber {
	static int count(int n) {
		int c=0;
		while(n!=0) {
			n=n/10;
			c++;
		}
		return c;
	}
	static int power(int base,int ex) {
		int pow=1;
		for(int i=1;i<=ex;i++) {
			pow=pow*base;
		}
		return pow;
	}

	public static void main(String[] args) {
		int n=153,n1=n;
		int c=count(n);
		int sum=0,rem=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+power(rem, c);
			n=n/10;
		}
		System.out.println(sum==n1?"Armstrong Number":"Not a Armstrong Number");
		
	}

}
