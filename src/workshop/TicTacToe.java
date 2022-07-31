package workshop;
public class TicTacToe {

	static char[] board = new char[10];
	
	static void createBoard(){
		for(int i = 0 ; i<10 ; i++) {
			board[i] = ' ';
		}
	}	
	public static void main(String[] args) {
		System.out.println("----- Welcome To The Game Of Tic Tac Toe -----");
		createBoard();
	}

}