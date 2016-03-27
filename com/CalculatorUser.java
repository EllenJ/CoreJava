package com;

import util.Calculator;

public class CalculatorUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		System.out.println(c.add(10, 11));
		System.out.println(c.sub(10, 11));
		System.out.println(c.multipl(10, 11));
		System.out.println(c.division(10, 11));

	}

}
