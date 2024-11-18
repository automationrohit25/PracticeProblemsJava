package com.jdk8;

public interface IPrintable {
	
	public abstract void print();
	
	default void scan() {
		System.out.println("scanning");
	}
	
	static void printToConsole() {
		System.out.println("Print to console");
	}

}
