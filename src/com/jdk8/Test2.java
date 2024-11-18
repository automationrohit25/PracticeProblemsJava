package com.jdk8;

import java.util.LinkedHashSet;

public class Test2 {

	public static void main(String[] args) {
		
		LinkedHashSet<String>
        set = new LinkedHashSet<String>();

    // Use add() method to add
    // elements into the LinkedHashSet
    set.add("Welcome");
    set.add("To");
    set.add("Geeks");
    set.add("For");
    set.add("Geeks");

    // Displaying the LinkedHashSet
    System.out.println("The LinkedHashSet: "
                       + set);

    // Creating the array and using toArray()
    String[] arr = new String[10];
    arr = set.toArray(arr);


	}

}
