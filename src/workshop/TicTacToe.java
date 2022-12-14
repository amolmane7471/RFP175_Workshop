package workshop;
import java.util.Scanner;
public class TicTacToe {

	static char[] board = new char[10];
	static char player,computer;
	static int playLocation;
	static int tossResult;
	public static Scanner scanner = new Scanner(System.in);
	
	static void createBoard(){
		for(int i = 0 ; i<10 ; i++) {
			board[i] = ' ';
		}
	}	
	
	static void getPlayerChoice() {
		 System.out.print("select X or O : ");
		 player = Character.toUpperCase(scanner.next().charAt(0));
		 
		 if (player == 'X')
			 computer='O';
		 else
			 computer ='X';
		 System.out.println("You have selected : " +player);
		 System.out.println("Computer's choice is : " +computer);
	}
	
	static void showBoard() {
		  	System.out.println(" ___________");
	        System.out.println("| " + board[1] + " | "+ board[2] + " | " + board[3]+ " |");
	        System.out.println("|___|___|___|");
	        System.out.println("| " + board[4] + " | "+ board[5] + " | " + board[6]+ " |");
	        System.out.println("|___|___|___|");
	        System.out.println("| " + board[7] + " | "+ board[8] + " | " + board[9]+ " |");
	        System.out.println("|___|___|___|");	}

	public static void userMove() {
		System.out.println("Enter Location 1-9 to Make Move");
		playLocation = scanner.nextInt();
		if (playLocation > 0 && playLocation < 10 ) {
			board[playLocation] = player;
			showBoard();
		} else {
			System.out.println("Invalid Choice");
		}
	}
	
	public static boolean isEmpty() {
		if (board[playLocation] == ' ') {
			return true;
		} else {
			return false;
		}
	}

	public static void checkToss() {
		double tossResult = 1+Math.floor(Math.random() * 10) % 2;
		System.out.println("Choose 1 for Heads or 2 for Tails");
		int coin = scanner.nextInt();
		if (coin == tossResult) {
			System.out.println("Player Won The Toss! Player Starts");
		} else {
			System.out.println("Computer Won The Toss! Computer Starts");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("----- Welcome To The Game Of Tic Tac Toe -----");
		createBoard();
		getPlayerChoice();
		showBoard();
		userMove();
		boolean freeSpace=isEmpty();
		System.out.println("free space or not: "+freeSpace);
		checkToss();
	}

}