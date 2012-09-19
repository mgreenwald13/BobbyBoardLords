package generalChess;

import java.awt.Point;
import java.util.ArrayList;


public class Bobby {
	private Piece[][] board;
	private boolean color; 
	int numPiecesLeft;
	
	public boolean getColor(){
		return color;
	}
	
	public Bobby(boolean b, Board start){
		color=b;
		getBoard(start);
		numPiecesLeft=16;
	}
	
	public Bobby(boolean b, Piece[][] start){
		color=b;
		getBoard(start);
		numPiecesLeft=16;
	}
	
	public void getBoard(Piece[][] p){
		for(int x=0;x<8;x++){
			for (int y=0;y<8;y++){
				board[x][y]=p[x][y];
			}
		}
	}
	
	public void getBoard(Board b){
		Piece[][] arr=b.getBoard();
		for(int x=0;x<8;x++){
			for(int y=0;y<8;y++){
				char type=arr[x][y].toString().charAt(1);
				boolean col=arr[x][y].getColor();
				switch (type){
				case 'P':
					board[x][y]=new Pawn(col);
				case 'R':
					board[x][y]=new Rook(col);
				case 'N':
					board[x][y]=new Knight(col);
				case 'B':
					board[x][y]=new Bishop(col);
				case 'K':
					board[x][y]=new King(col);
				case 'Q':
					board[x][y]=new Queen(col);
				case 'X':
					board[x][y]=new Blank(true);
			}}}
	}
	
	//return moves in an array with the first row storing which piece it is and then all the subsequent rows storing the possible moves for that piece
	
	public ArrayList<ArrayList> getMoves(){
		ArrayList<ArrayList> poss=new ArrayList<ArrayList>();
		
		//number of columns in ArrayList
		int count=0;
		
		//makes the arraylist with a new column for each of your pieces
		for (int x=0; x<8; x++){
			for (int y=0; y<8; y++){
				if(board[x][y].getColor()==color&&board[x][y].toString().charAt(1)!='X'){
					ArrayList temp=new ArrayList();
					temp.add(0, board[x][y]);
					Point loc=new Point(x, y);
					temp.add(1, loc);
					poss.add(count, temp);
					count++;
				}
			}
		}
		
		//begins to get all the possible moves that a piece can make
		for(int t=0; t<poss.size(); t++){
			Point loc=new Point((Point)poss.get(t).get(1));
			char type=poss.get(t).toString().charAt(1);
			
			//King
			if(type=='K'){
				for (int x=(int)loc.getX()-1;x<=(int)loc.getX()-1; x++){
					for (int y=(int)loc.getY()-1; x<=(int)loc.getY()-1; y++){
						if((int)loc.getX()-1>-1&&(int)loc.getX()+1<8&&(int)loc.getY()-1>-1&&(int)loc.getY()+1<8&&board[x][y].toString().charAt(1)=='X'||board[x][y].getColor()==!color){
							Point p=new Point(x, y);
							poss.get(t).add(p);
						}
					}
				}
			}
			
			//Pawn
			if(type=='P'){
				int xCoord=(int)loc.getX();
				int yCoord=(int)loc.getY();

				//check diagonal one square left and one up
				if(yCoord+1<8&&board[xCoord-1][yCoord+1].getColor()==!color){
					Point p=new Point(xCoord-1, yCoord+1);
					poss.get(t).add(p);
				}
				
				//check diagonal one square right and one up
				if(yCoord+1<8&&board[xCoord+1][yCoord+1].getColor()==!color){
					Point p=new Point(xCoord+1, yCoord+1);
					poss.get(t).add(p);
				}
				
				//check one space in front
				if (yCoord+1<8&&board[xCoord][yCoord+1].toString().charAt(1)=='X'){
					Point p=new Point(xCoord, yCoord+1);
					poss.get(t).add(p);
				}
				
				//check two spaces in front if it is in starting position
				if(yCoord==1){
					if (board[xCoord][yCoord+2].toString().charAt(1)=='X'){
						Point p=new Point(xCoord, yCoord+2);
						poss.get(t).add(p);
					}
				}
				}
			
			//Knight
			int xCoord=(int)loc.getX();
			int yCoord=(int)loc.getY();
			if (type=='N'){
			
			//2 up 1 right
			if(xCoord+1<8&&yCoord<8&&board[xCoord+1][yCoord+2].toString().charAt(1)=='X'||board[xCoord+1][yCoord+2].getColor()==!color){
				Point p=new Point(xCoord+1, yCoord+2);
				poss.get(t).add(p);
				}
			
			//2 up 1 left
			if(xCoord-1>-1&&yCoord+2<8&&board[xCoord-1][yCoord+2].toString().charAt(1)=='X'||board[xCoord+1][yCoord+2].getColor()==!color){
				Point p=new Point(xCoord-1, yCoord+2);
				poss.get(t).add(p);
				}
			
			//2 down 1 left
			if(xCoord-1>-1&&yCoord-2>-1&&board[xCoord-1][yCoord-2].toString().charAt(1)=='X'||board[xCoord+1][yCoord+2].getColor()==!color){
				Point p=new Point(xCoord-1, yCoord-2);
				poss.get(t).add(p);
				}
			
			//2 down 1 right
			if(xCoord+1<8&&yCoord-2>-1&&board[xCoord+1][yCoord-2].toString().charAt(1)=='X'||board[xCoord+1][yCoord+2].getColor()==!color){
				Point p=new Point(xCoord+1, yCoord-2);
				poss.get(t).add(p);
				}
			
			//2 right 1 down
			if(xCoord+2<8&&yCoord-1>-1&&board[xCoord+2][yCoord-1].toString().charAt(1)=='X'||board[xCoord+1][yCoord+2].getColor()==!color){
				Point p=new Point(xCoord+2, yCoord-1);
				poss.get(t).add(p);
				}
			
			//2 right 1 up
			if(xCoord+2<8&&yCoord+1<8&&board[xCoord+2][yCoord+1].toString().charAt(1)=='X'||board[xCoord+1][yCoord+2].getColor()==!color){
				Point p=new Point(xCoord+2, yCoord+1);
				poss.get(t).add(p);
				}
			
			//2 left 1 down
			if(xCoord-2>-1&&yCoord-1>-1&&board[xCoord-2][yCoord-1].toString().charAt(1)=='X'||board[xCoord+1][yCoord+2].getColor()==!color){
				Point p=new Point(xCoord-2, yCoord-1);
				poss.get(t).add(p);
				}
			
			//2 left 1 up
			if(xCoord-2>-1&&yCoord+1<8&&board[xCoord-2][yCoord+1].toString().charAt(1)=='X'||board[xCoord+1][yCoord+2].getColor()==!color){
				Point p=new Point(xCoord-2, yCoord+1);
				poss.get(t).add(p);
				}
			}}
		return poss;
	}

//makes the move you want - input a point with starting and ending coordinates of move 
//note: assumes that the move you are making is valid and doesn't put you into check
public Piece[][] move(Point start, Point fin){
	Piece[][] a=new Piece[8][8];
	//just recreates the current board state in a new Piece grid
	for(int x=0;x<8;x++){
		for(int y=0;y<8;y++){
			char type=board[x][y].toString().charAt(1);
			boolean col=board[x][y].getColor();
			switch (type){
			case 'P':
				a[x][y]=new Pawn(col);
			case 'R':
				a[x][y]=new Rook(col);
			case 'N':
				a[x][y]=new Knight(col);
			case 'B':
				a[x][y]=new Bishop(col);
			case 'K':
				a[x][y]=new King(col);
			case 'Q':
				a[x][y]=new Queen(col);
			case 'X':
				a[x][y]=new Blank(true);
			}
		}
	}
	//replaces the spot where you want to move with the piece you want to move
	char t=a[(int)start.getX()][(int)start.getY()].toString().charAt(1);
	switch(t){
	case 'P':
		a[(int)fin.getX()][(int)fin.getY()]=new Pawn(color);
	case 'R':
		a[(int)fin.getX()][(int)fin.getY()]=new Rook(color);
	case 'N':
		a[(int)fin.getX()][(int)fin.getY()]=new Knight(color);
	case 'B':
		a[(int)fin.getX()][(int)fin.getY()]=new Bishop(color);
	case 'K':
		a[(int)fin.getX()][(int)fin.getY()]=new King(color);
	case 'Q':
		a[(int)fin.getX()][(int)fin.getY()]=new Queen(color);
	}
	
	//puts a blank where the start piece was
	a[(int)start.getX()][(int)start.getY()]=new Blank(true);
	
	//return the new array with the pieces switched
	return a;
}

public void isThreatened (Point p){
	//creates an instance of Bobby that thinks it is the enemy team
	Bobby other =new Bobby(!color, board);
	//arraylist of the all the locations of the pieces that threaten your piece
	ArrayList<Point> threats=new ArrayList<Point>();
	//go through each of the possible moves the enemy team can make by going through the all 
	//pieces and all the moves that those pieces can make
	for(int i=0;i<other.getMoves().size();i++){
		for(int k=2;k<other.getMoves().get(i).size();k++){
			//create a new point with the location of the point where the enemy piece can move
			Point temp=new Point((Point)other.getMoves().get(i).get(k));
			//if that location is the same as your piece, add that location to the array
			if(temp.equals(p)){
				threats.add(temp);
			}
		}
	}
	
	
	

	
	
}

}
