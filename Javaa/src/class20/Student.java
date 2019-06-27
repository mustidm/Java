package class20;

public class Student {

	public static void main(String[] args) {
		
		Student obj=new Student();
		char myGrade=obj.getGrade(91);
		System.out.println("My grade at Syntax is "+myGrade);

		
		myGrade=obj.getGrade(59);
		System.out.println("My grade at Syntax is "+myGrade);
	}

	char getGrade(int score) {
		char grade;
		
		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else if (score > 70) {
			grade = 'C';
		} else if (score > 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}
}
