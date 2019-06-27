package class16;

import java.util.Scanner;

public class ReviewWeqasDay1 {
//Global
	String eyes;
	String hair;
	String nose;
	String shirt;

	public static void main(String[] args) {
		//Local
		String ear="left ";
		
		ReviewWeqasDay1 weqas=new ReviewWeqasDay1();
//		weqas.eyes="blue";
//		weqas.hair="blue";
//		weqas.nose="brown";
//		weqas.shirt="gray";
//		weqas.humanEyes();
//		weqas.noReturn();
//		ReviewWeqasDay1 weqas1=new ReviewWeqasDay1();
//		weqas1.eyes="green";
//		
//		System.out.println(weqas1.eyes);
//		weqas.scannerFirstName();
//		weqas.noReturn();
//		weqas.scannerInt();
//		weqas.reverseString();
		//weqas.vowelCountWithLoop();
	//weqas.vowelCountWithReplaceAll();
		String a="hbsello";
		System.out.println(a.substring(7));
	}
	void humanEyes() {
		ReviewWeqasDay1 weqas=new ReviewWeqasDay1();
		weqas.eyes="red";
		System.out.println(weqas.eyes);
	}
	
	void noReturn() {
		System.out.println("I do not have a return type");
	}
	void scannerFirstName() {
		Scanner scan =new Scanner(System.in);
		scan.nextLine();
	}
	void scannerInt() {
		Scanner scan=new Scanner(System.in);
		scan.nextInt();
	}
	
	void reverseString() {
		String str="seigolonhceT xatnyS";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
			System.out.println(reverse);
		}
		//System.out.println(reverse);
		
	}
	void vowelCountWithLoop() {
		String weqas="hello world my name Is wEqas";
		char[] w=weqas.toCharArray();
		char empty;
		for(int i=0;i<=w.length-1;i++) {
			if(w[i]=='a'||w[i]=='A'||w[i]=='e'||w[i]=='E'||w[i]=='i'
					|| w[i]=='I'||w[i]=='o'||w[i]=='O'||w[i]=='u'||w[i]=='U') {
				empty=w[i];
				System.out.print(empty+",");
			}
			
		}
		
		
		
	}
	
	
	void vowelCountWithReplaceAll() {
		String weqas="hello world my name Is wEqas";
		String replace =weqas.replaceAll("[^aA,eE,iI,oO,uU]", "");
		//String replace =string.replaceAll("[^aA,eE,iI,oO,uU]", "");

		System.out.println(replace);
	}
	
	
	
	
	
	
	
	

}



