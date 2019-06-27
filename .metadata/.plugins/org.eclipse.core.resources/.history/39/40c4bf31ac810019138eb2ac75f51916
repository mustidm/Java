package com.class30;

public interface Shape {

	void calculateArea(double num);
	void calculatePerimiter(double num);
}
class Circle implements Shape {

	@Override
	public void calculateArea(double num) {
		double area= 3.14*(num*num);
		System.out.println(area);
	}
	@Override
	public void calculatePerimiter(double num) {
		double perimiter=2*(num*3.14);
		System.out.println(perimiter);
	}
	
	public void whoAmI() {
		System.out.println("I am a circle");
	}
}

class Square implements Shape{

	@Override
	public void calculateArea(double num) {
		double area=num*num;
		System.out.println(area);
	}
	@Override
	public void calculatePerimiter(double num) {
		double perimiter =4*num;
		System.out.println(perimiter);
	}
}