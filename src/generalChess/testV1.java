package generalChess;

public class testV1 {
public static void main(String[] args){
	v1Bobby a=new v1Bobby(new Board(), true);
	Board c=new Board();
	a.turn(c);
	a.printBoard();
	a.turn(a.getPieceArray());
	a.printBoard();
	a.turn(a.getPieceArray());
	a.printBoard();
	a.turn(a.getPieceArray());
	a.printBoard();
	a.turn(a.getPieceArray());
	a.printBoard();
	
}
}
