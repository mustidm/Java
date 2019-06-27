package class07;

import java.util.Scanner;

public class Repl7_1 {

	public static void main(String[] args) {
		/*
		 * First Output: "enter name of the instructor"

case 1: if User provided the name as Shiva as input it should show  "Will take care of Java Assignment"
case 2: if User provided the name as  Sandish as input it should show  "Will take care of SDLC Assignment"
case 3: if User provided the name as  Weqas as input it should show  "Will take care of Selenium Assignment"
case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"

other than these four names if user provide the name try to give like (James or John ) " Invalid instructor selected"
		 */
		
		String name;
		Scanner scan =new Scanner (System.in);
		
		System.out.println("enter name of the instructor");
		name=scan.nextLine();
		
		switch (name) {
		
		case "Shiva":
			System.out.println("Will take care of Java Assignment");
			break;
		case "Sandish":
			System.out.println("Will take care of SDLC Assignment");
			break;
		case "Weqas":
			System.out.println("Will take care of Selenium Assignment");
			break;
		case "Asel":
			System.out.println("Will take care of every Assignment");
			break;
		default:
			System.out.println("Invalid instructor selected");
		}
		
		
		
	}
}
