package generalChess;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class v1Bobby {
	boolean color;
	Piece[][] b;
	
	public v1Bobby(Board b, boolean c){
		this.color=c;
		this.b=new Piece[8][8];
		getBoard(b);
	}
	
	public v1Bobby(Piece[][]b, boolean c){
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
		for (int y=0;y<8;y++){
			for(int x=0;x<8;x++){
				char t=b.getBoard()[x][y].toString().charAt(1);
				boolean tt=b.getBoard()[x][y].getColor();
				switch(t){
				case 'P':
					this.b[x][y]=new Pawn(tt);
					break;
				case 'R':
					this.b[x][y]=new Rook(tt);
					break;

				case 'N':
					this.b[x][y]=new Knight(tt);
					break;

				case 'B':
					this.b[x][y]=new Bishop(tt);
					break;

				case 'K':
					this.b[x][y]=new King(tt);
					break;

				case 'Q':
					this.b[x][y]=new Queen(tt);
					break;

				case 'X':
					this.b[x][y]=new Blank(true);
					break;

				}
			}
		}
	}
	
	public void getBoard(Piece[][] u){
		for (int y=0;y<8;y++){
			for(int x=0;x<8;x++){
				char t=u[x][y].toString().charAt(1);
				boolean tt=u[x][y].getColor();
				switch(t){
				case 'P':
					this.b[x][y]=new Pawn(tt);
					break;
				case 'R':
					this.b[x][y]=new Rook(tt);
					break;

				case 'N':
					this.b[x][y]=new Knight(tt);
					break;

				case 'B':
					this.b[x][y]=new Bishop(tt);
					break;

				case 'K':
					this.b[x][y]=new King(tt);
					break;

				case 'Q':
					this.b[x][y]=new Queen(tt);
					break;

				case 'X':
					this.b[x][y]=new Blank(true);
					break;

				}
			}
		}
	}
	
	public void move(int ax, int ay, int bx, int by){
		char t=this.b[ax][ay].toString().charAt(1);
		boolean c=this.b[ax][ay].getColor();
		switch(t){
		case 'P':
			this.b[bx][by]=new Pawn(c);
			break;
		case 'R':
			this.b[bx][by]=new Rook(c);
			break;
		case 'N':
			this.b[bx][by]=new Knight(c);
			break;
		case 'B':
			this.b[bx][by]=new Bishop(c);
			break;
		case 'K':
			this.b[bx][by]=new King(c);
			break;
		case 'Q':
			this.b[bx][by]=new Queen(c);
			break;
		}
		
		this.b[ax][ay]=new Blank(true);
	}
	
	public void printBoard(){
		for(int x=0;x<8;x++){
			for(int y=0; y<8; y++){
				System.out.print(b[y][x]+" | ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();

	}
	
	
	//returns possible king moves
	public ArrayList<ArrayList> kMoves(){
		ArrayList<ArrayList> d=new ArrayList();
		ArrayList g=new ArrayList();
		int x=-1;
		int y=-1;
		for(int j=0;j<8;j++){
			for(int k=0;k<8;k++){
				if (b[j][k].getColor()==color&&b[j][k].toString().charAt(1)=='K'){
					x=j;y=k;
					break;
				}
			}
		}
		g.add(b[x][y]);
		g.add(new Point(x, y));
		if (x==-1||y==-1){
			return null;
		}
		else{
			for(int a=x-1;a<x+2;a++){
				for(int b=y-1;b<y+2;b++){
					if(a>-1&&a<8&&b>-1&&b<8){
						if(this.b[a][b].toString().charAt(1)=='X'||this.b[a][b].getColor()!=color){
							g.add(new Point(a,b));
						}
					}
				}
			}
		}
		d.add(g);
		return d;
	}
	
	//possible queen moves
	public ArrayList<ArrayList> qMoves(){
		ArrayList<ArrayList> d=new ArrayList<ArrayList>();
		
		return d;
	}
	
	public ArrayList<ArrayList> rMoves(){
		ArrayList<ArrayList> d=new ArrayList<ArrayList>();
		
		return d;
	}
	
	public ArrayList<ArrayList> nMoves(){
		ArrayList<ArrayList>v=new ArrayList<ArrayList>();
		for(int y=0;y<8;y++){
			for(int x=0;x<8;x++){
				if (b[x][y].getColor()==color&&b[x][y].toString().charAt(1)=='N'){
					ArrayList d=new ArrayList();
					d.add(b[x][y]);
					d.add(new Point(x, y));
					if(x-2>-1&&y-1>-1&&(b[x-2][y-1].toString().charAt(1)=='X'||b[x-2][y-1].getColor()==!color))d.add(new Point(x-2, y-1));
					if(x-1>-1&&y-2>-1&&(b[x-1][y-2].toString().charAt(1)=='X'||b[x-1][y-2].getColor()==!color))d.add(new Point(x-1, y-2));
					
					if(x-2>-1&&y+1<8&&(b[x-2][y+1].toString().charAt(1)=='X'||b[x-2][y+1].getColor()==!color))d.add(new Point(x-2, y+1));
					if(x-1>-1&&y+2<8&&(b[x-1][y+2].toString().charAt(1)=='X'||b[x-1][y+2].getColor()==!color))d.add(new Point(x-1, y+2));
					
					if(x+2<8&&y+1<8&&(b[x+2][y+1].toString().charAt(1)=='X'||b[x+2][y+1].getColor()==!color))d.add(new Point(x+2, y+1));
					if(x+1<8&&y+2<8&&(b[x+1][y+2].toString().charAt(1)=='X'||b[x+1][y+2].getColor()==!color))d.add(new Point(x+1, y+2));
					
					if(x+1<8&&y-2>-1&&(b[x+1][y-2].toString().charAt(1)=='X'||b[x+1][y-2].getColor()==!color))d.add(new Point(x+1, y-2));
					if(x+2<8&&y-1>-1&&(b[x+2][y-1].toString().charAt(1)=='X'||b[x+2][y-1].getColor()==!color))d.add(new Point(x+2, y-1));
					v.add(d);
			}
		}}	
		return v;
	}
	
	public ArrayList<ArrayList> bMoves(){
		ArrayList<ArrayList> a=new ArrayList<ArrayList>();
		
		return a;
	}
	
	public ArrayList<ArrayList> pMoves(){
		ArrayList<ArrayList>v=new ArrayList<ArrayList>();
		for(int y=0;y<8;y++){
			for(int x=0;x<8;x++){
				if (b[x][y].getColor()==color&&b[x][y].toString().charAt(1)=='P'){
					ArrayList d=new ArrayList();
					d.add(b[x][y]);
					d.add(new Point(x, y));
					if(color==false){
						if(y==1&&b[x][y+2].toString().charAt(1)=='X')d.add(new Point(x, y+2));
						if(y+1<8&&b[x][y+1].toString().charAt(1)=='X')d.add(new Point(x, y+1));
						if(x+1<8&&y+1<8&&(b[x+1][y+1].toString().charAt(1)!='X'&&b[x+1][y+1].getColor()!=color))d.add(new Point(x+1, y+1));
						if(x-1>-1&&y+1<8&&(b[x-1][y+1].toString().charAt(1)!='X'&&b[x-1][y+1].getColor()!=color))d.add(new Point(x-1, y+1));
					}
					
					if(color==true){
						if(x==6&&b[y][x-2].toString().charAt(1)=='X')d.add(new Point(y, x-2));
						if(x-1>0&&b[y][x-1].toString().charAt(1)=='X')d.add(new Point(y, x-1));
						if(y+1<8&&x-1>0&&(b[y+1][x-1].toString().charAt(1)!='X'&&b[y+1][x-1].getColor()!=color))d.add(new Point(y+1, x-1));
						if(y-1<8&&x-1>0&&(b[y-1][x-1].toString().charAt(1)!='X'&&b[y-1][x-1].getColor()!=color))d.add(new Point(y-1, x-1));
					}
					v.add(d);
			}
		}}	
		return v;
	}
	
	//makes a random move
	public void randomMove(){
		
	}
	
	
	public static void main(String[] args){
		Board d=new Board();
		boolean color=false;
		v1Bobby a=new v1Bobby(d, color);
		v1Bobby b=new v1Bobby(d, !color);
		a.printBoard();
		b.printBoard();
		int x=0;
		while (x==0){
			a.randomMove();
			a.printBoard();
			
		}
		
		
		
		/*
		 * 4 move checkmate with white
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
		 * */
		
		
		
}
	
	
	
	

}
