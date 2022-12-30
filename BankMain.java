package com.abstractclass.examples;

public class BankMain {

	public static void main(String[] args) {
		
		
		Bank b;
		
		b = new PNB();
		
		System.out.println("Rate of Intrest Of PNB :" + b.getRateOfIntrest() + "%");
		
		b = new SBI();
		
		System.out.println("Rate of Intrest Of SBI :" + b.getRateOfIntrest() + "%");
		
		b = new Maharashtra();
		
		System.out.println("Rate of Intrest Of Maharashtra :" + b.getRateOfIntrest() + "%");

	}

}
