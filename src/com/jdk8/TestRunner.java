package com.jdk8;

public class TestRunner {

	public static void main(String[] args) {
		
//		IPrintable obj = new IPrintable() {
//			
//			@Override
//			public void print() {
//				
//				System.out.println("From anonymous inner class");
//				
//			}
//		};
//		
//		obj.print();
//		Functional programming
		
		IPrintable obj1 = () -> System.out.println("From anonymous inner class");
		obj1.print();
	}

}
