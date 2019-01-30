import java.util.Scanner;
public class PasswordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String p = "APSC2019";
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the password ===>> ");
		String password = input.nextLine();
		
		if(!password.equals(p)){
			System.out.print("Wrong password");
			System.out.print("Enter Password ==>> ");
			password = input.nextLine();
			
		}
		else 
			
		System.out.println("Password accepted");
			
		}
	}
	
	

	

