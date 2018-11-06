import java.util.Scanner;
public class XOXO {
	
//private static final char "X" = 0;
static char[] board ={'0','1','2','3','4','5','6','7','8'}; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
 	System.out.println("Welcome to tic-tac-toe");
 	Printboard();

 	Scanner keyboard = new Scanner(System.in);
 	System.out.print("Please choose your game piece: X or O  ===>>  ");// Make sure to capitalize X's and O's
 	char Player= keyboard.nextLine().charAt(0);
 	System.out.println(Player);
 	if(Player=='X')
 		System.out.println("You are Player One");
 	else if(Player=='O'){
 		System.out.println("You are Player Two");
 	    System.out.println("Wait for next turn");
 	}
 
	
	boolean winner=false;

	char check; 

	while(winner==false) {
	
		PlayX();

		Printboard();

		check=checkwinner();

		if(check=='X'||check=='O'||check=='T') {

			winner=true;

			System.out.println(check);

		}

		else{

			PlayO();

			Printboard();

			check=checkwinner();
		}

			if(check=='X'||check=='O'|| check=='T') {

				winner=true;

				System.out.println(check);
			}

		
		
	}
			

		}

		
	
	//1.create a method that prints the board.

	/*
	 1| 2|3
	-----
	 4| 5|6
	-----
	 7| 8|9
	 
	
	 */
	//System.out.print(board[0] | board[1] | board[2]);
//2. user input for X's and O's. And you want to print your board after each user input.
	//3.checkWinner90 method. 
public static void Printboard(){
	
	System.out.println( "" + board[0] +"|" + board[1] + "|"  + board[2] );
	System.out.println("-----");
	System.out.println(  "" +board[3]+ "|" + board[4] + "|"  + board[5] );
	System.out.println("-----");
	System.out.println( "" + board[6] + "|" +  board[7] + "|"  + board[8]);
	

}
public static void PlayX(){//call the board
	Scanner keyboard = new Scanner(System.in);//Creates a Scanner item
	System.out.print("Player 1,please choose a spot on the board  ===>>  ");
	 int num=keyboard.nextInt();//Grabs the first input from keyboard 
	 if(board[num]=='X'||board[num]=='O') {

			System.out.println("Spot is already taken, try again");

			PlayX();

		}

		else {

			board[num]='X';

		}
	}
public static void PlayO(){
	Scanner keyboard = new Scanner(System.in);//Creates a Scanner item
	System.out.print("Player 2,please choose a spot on the board  ===>>  ");
	 int num=keyboard.nextInt();//Grabs the first input from keyboard
	 if(board[num]=='X'||board[num]=='O') {

			System.out.println("Spot is already taken, try again");

			PlayO();

		}

		else {

			board[num] = 'O';
		}

}
	
	  
	
public static char checkwinner(){//go through all the cases ex:board[0]+board[1]+board[2];//convert characters to strings "" +board[1]+ board[2] + board[3]
	//8 cases combine, second if else check for whether the three are x and O's. if(XXX==line) return 'x' else if line=='OOO') return 'O' if(line.equals(XXX)){
	//return 'X';
	String line1=""+ board[0]+board[1]+board[2];	
	String line2=""+board[0]+ board[3]+board[6];
	String line3="" + board[0]+ board[4]+ board[8];
	String line4="" + board[1] + board[4]+board[7];
	String line5="" + board[2]+ board[4] + board[6];
	String line6= "" + board[2] + board[5] + board[8];
	String line7="" + board[3] + board[4]+ board[5];
	String line8="" + board[6] + board[7] + board[8];
    
	
	if(line1.equals("XXX")) {

		System.out.println("Player One Wins");	

		return 'X';}


	else if(line1.equals("OOO")) {
		System.out.println("Player Two Wins");

		return'O';

		}
	

  if(line2.equals("XXX")) {
	  System.out.println("Player One Wins");	

		return 'X';}

	else if(line2.equals("OOO")) { 
		System.out.println("Player Two Wins");

		return'O';

		}

		

	if(line3.equals("XXX")) {
		 System.out.println("Player One Wins");	
	

		return 'X';}

	else if(line3.equals("OOO")) { 
		System.out.println("Player Two Wins");

		return'O';

		}

		

	 if(line4.equals("XXX")) {
		 System.out.println("Player One Wins");
	

		return 'X';
	 }

	else if(line4.equals("OOO")) {
		System.out.println("Player Two Wins");

		return'O';

		}

		

	if(line5.equals("XXX")){
		 System.out.println("Player One Wins");

		return 'X';}

	else if(line5.equals("OOO")) {
		System.out.println("Player Two Wins");

		return'O';

		}

		

if(line6.equals("XXX")){ 
	System.out.println("Player One Wins");


		return 'X';
}

	else if(line6.equals("OOO")) {
		System.out.println("Player Two Wins");
		return'O';

		}

		

 if(line7.equals("XXX")) {
	 System.out.println("Player One Wins");

		return 'X';}

	else if(line7.equals("OOO")) {
		System.out.println("Player Two Wins");
		return'O';

		}

		

	 if(line8.equals("XXX")){
		 System.out.println("Player One Wins");

		return 'X';
	 }
	else if(line8.equals("OOO")) { 
		System.out.println("Player Two Wins");
		return'O';

		}
	 
	// else
	    	//System.out.println("Draw!");

		

	

	

int counter = 0;

	for(int k=0; k<board.length;k++) {

		if(board[k]=='X'||board[k]=='O') {

			counter ++;

		}
	}

 if(counter==9) {
	 System.out.println("It's a tie");

		return 'T';

	}


	

	

	return ' ';
	
}}







	
//}

//}
