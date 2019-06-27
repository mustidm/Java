package com.class30;

public abstract class Marks {

	public abstract double getPercentage();
}
class A extends Marks{
	int mark1, mark2, mark3;
	public A(int mark1, int mark2, int mark3) {
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	@Override
	public double getPercentage() {
		double perc=(mark1+mark2+mark3)/3;
		return perc;
	}
}
class B extends Marks {
	int mark1, mark2, mark3, mark4;
	public B(int mark1, int mark2, int mark3, int mark4) {
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.mark4=mark4;
	}
	@Override
	public double getPercentage() {
		double perc=(mark1+mark2+mark3+mark4)/4;
		return perc;
	}
}