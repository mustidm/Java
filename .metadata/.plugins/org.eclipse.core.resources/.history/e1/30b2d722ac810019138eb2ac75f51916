package com.class30;

import java.util.ArrayList;

public class ArrayListTypes {
	public static void main(String[] args) {
		//generic Array that stores only String Object
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jack");
		names.add("Nick");
		names.add("Sam");
		// names.add(123); not valid since we have generic arraylist of a type of String
	
		//non generic arrayList- we can store different types of Objects
		ArrayList alist=new ArrayList();
		alist.add("String");//String
		alist.add(100);//Integer 
		alist.add(100.10);//Double
		alist.add(true);// Boolean
		alist.add('a');// Character
		
		for ( Object value: alist) {
			System.out.println(value);
		}
		
		ArrayList <Boolean> boleanArrayList=new ArrayList();
		boleanArrayList.add(true);
		boleanArrayList.add(false);
		
		for (Object val:boleanArrayList) {
			System.out.println(val);
		}
	}
}
