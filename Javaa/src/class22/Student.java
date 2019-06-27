package class22;

public class Student {

	String studentName;
	int grade1, grade2, grade3;
	
	public Student(String name, int a, int b, int c) {
		studentName=name;
		grade1=a;
		grade2=b;
		grade3=c;
	}
	
	public void getAverage() {
		int average=(grade1+grade2+grade3)/3;
		System.out.println("My name is "+studentName+" and my average grade is "+average);
	}
	
}
