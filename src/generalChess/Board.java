package generalChess;


public class Board {
	
	private Piece[][] arr;
	public Board(){
		arr=new Piece[8][8];
		for(int i=0;i<8;i++){
			for(int a=2;a<6;a++){
				arr[i][a]=new Blank(true); 
			}
		}
		for(int x=0;x<8;x++){
			arr[x][1]=new Pawn(false);
			arr[x][6]=new Pawn(true);
		}
	
		//black setup
		arr[0][0]=new Rook(false);
		arr[7][0]=new Rook(false);
		
		arr[1][0]=new Knight(false);
		arr[6][0]=new Knight(false);
		
		arr[2][0]=new Bishop(false);
		arr[5][0]=new Bishop(false);
	
		arr[4][0]=new Queen(false);
		arr[3][0]=new King(false);
	
		//white setup
		arr[0][7]=new Rook(true);
		arr[7][7]=new Rook(true);
		
		arr[1][7]=new Knight(true);
		arr[6][7]=new Knight(true);
		
		arr[2][7]=new Bishop(true);
		arr[5][7]=new Bishop(true);
	
		arr[4][7]=new Queen(true);
		arr[3][7]=new King(true);

	}
	

	public void printBoard(){ 
		for(int y=0; y<8; y++){
	
			for(int x=0; x<8; x++){
				System.out.print(arr[y][x].toString()+" | ");
			}
		
			System.out.println();
		}
		
		return ; 
	}
	
	public static void main (String args[]){
		Board a = new Board();
		a.printBoard();
	}
	
}
