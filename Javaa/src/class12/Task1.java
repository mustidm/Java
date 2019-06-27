package class12;

import java.util.Scanner;

public class Task1 {
/*
 * Accept username, password and confirm password and check following requirements:

Username and Password cannot be  empty, if soâ†’ message=â€�Username and Password cannot be emptyâ€�.
Password should be minimum 8 characters, if less â†’ message=â€�Password is too shortâ€�.
Password cannot contain username if so, â†’ message=â€�Password cannot contain usernameâ€�.
Password should match confirmed password, if not  â†’ message=â€œPasswords do not matchâ€�.
Only after all requirements met â†’ message â€œYour username and password has been createdâ€�


 */
	public static void main(String[] args) {
		
		Scanner scan;
		String userName, password, confirmedPassword, message;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter username");
		userName=scan.nextLine();
		
		System.out.println("Please enter password");
		password=scan.nextLine();
		
		System.out.println("Please confirm password");
		confirmedPassword=scan.nextLine();
		
		if (!(userName.isEmpty() && password.isEmpty())) {//1 checkpoint
			if(password.length()>8) {//2 checkpoint
				if (!password.contains(userName)) {//3 checkpoint
					if (password.equals(confirmedPassword)) {//4 checkpoint
						message="Your username and password has been created";
					}else {
						message="Passwords do not match";
					}
				}else {
					message="Password cannot contain username";
				}
			}else {
				message="Password is too short";
			}
		}else {
			message="Username and Password cannot be empty";
		}
		System.out.println(message);
	}
}
