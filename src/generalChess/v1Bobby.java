package generalChess;

import java.awt.Point;
import java.util.ArrayList;

public class v1Bobby {
	boolean color;
	Piece[][] b;
	
	public v1Bobby(Board b, boolean c){
		this.color=c;
		this.b=new Piece[8][8];
		getBoard(b);
	}
	
	public boolean getColor(){
		return color;
	}
	
	public Piece[][] getPieceArray(){
		return b;
	}
	
	public void getBoard(Board b){
		for (int x=0;x<8;x++){
			for(int y=0;y<8;y++){
				char t=b.getBoard()[x][y].toString().charAt(1);
				boolean tt=b.getBoard()[x][y].getColor();
				switch(t){
				case 'P':
					this.b[y][x]=new Pawn(tt);
					break;
				case 'R':
					this.b[y][x]=new Rook(tt);
					break;

				case 'N':
					this.b[y][x]=new Knight(tt);
					break;

				case 'B':
					this.b[y][x]=new Bishop(tt);
					break;

				case 'K':
					this.b[y][x]=new King(tt);
					break;

				case 'Q':
					this.b[y][x]=new Queen(tt);
					break;

				case 'X':
					this.b[y][x]=new Blank(true);
					break;

				}
			}
		}
	}
	
	public void move(int ax, int ay, int bx, int by){
		char t=this.b[ay][ax].toString().charAt(1);
		boolean c=this.b[ay][ax].getColor();
		switch(t){
		case 'P':
			this.b[by][bx]=new Pawn(c);
			break;
		case 'R':
			this.b[by][bx]=new Rook(c);
			break;
		case 'N':
			this.b[by][bx]=new Knight(c);
			break;
		case 'B':
			this.b[by][bx]=new Bishop(c);
			break;
		case 'K':
			this.b[by][bx]=new King(c);
			break;
		case 'Q':
			this.b[by][bx]=new Queen(c);
			break;
		}
		
		this.b[ay][ax]=new Blank(true);
	}
	
	public void printBoard(){
		for(int x=0;x<8;x++){
			for(int y=0; y<8; y++){
				System.out.print(b[x][y]+" | ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();

	}
	
	public ArrayList<Point> kMoves(){
		ArrayList<Point> a=new ArrayList();
		int x=-1;
		int y=-1;
		for(int j=0;j<8;j++){
			for(int k=0;k<9;k++){
				if (b[j][k].getColor()==color&&b[x][y].toString().charAt(1)=='K'){
					x=j;y=k;
					break;
				}
			}
		}
		if (x==-1||y==-1){
			return null;
		}
		else{
			
		}
		return a;
	}
	
	public ArrayList<Point> qMoves(){
		ArrayList<Point> a=new ArrayList();
		
		return a;
	}
	
	public ArrayList<Point> rMoves(){
		ArrayList<Point> a=new ArrayList();
		
		return a;
	}
	
	public ArrayList<Point> nMoves(){
		ArrayList<Point> a=new ArrayList();
		
		return a;
	}
	
	public ArrayList<Point> bMoves(){
		ArrayList<Point> a=new ArrayList();
		
		return a;
	}
	
	public ArrayList<Point> pMoves(){
		ArrayList<Point> a=new ArrayList();
		
		return a;
	}
	
	
	
	
	public static void main(String[] args){
		Board d=new Board();
		boolean color=true;
		
		
		v1Bobby a=new v1Bobby(d, true);
		
		if(a.color==true){
		a.move(4, 6, 4, 4);
		a.printBoard();
		a.move(5, 7, 2, 4);
		a.printBoard();
		a.move(3, 7, 5, 5);
		a.printBoard();
		a.move(5, 5, 5, 1);
		a.printBoard();
		}
				
}
	
	
	
	

}
