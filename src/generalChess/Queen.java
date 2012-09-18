package generalChess;

import java.awt.Point;
import java.util.ArrayList;

public class Queen extends Piece {

	public Queen(boolean b) {
		super(b,"Q");
		// TODO Auto-generated constructor stub
	}
public ArrayList<Point> possibleMoves(){
		
		ArrayList <Point> a=new ArrayList <Point>();
		
		//get current point of said bishop
		
		Point currPoint = new Point (4,4);
		int x = (int)currPoint.getX();
		int y = (int)currPoint.getY();
		
		a.add(new Point(x,y));
		
		
		// pretending we are black for now.
		boolean color = false;
		//pretending we have a piece array for now
		Piece[][] Piece;
		Piece=new Piece[8][8];
		
		
		//bishop moves diagonally in 8x8 board
		
		//as long the last point in each diagonal of the array is a blank, the bishop will add the next point to its array
		
		if ((x+1)<8 && (y)<8) a.add(new Point(x+1,y+1));
		if ((x+2)<8 && (y)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X' ) a.add(new Point(x+2,y+2));
		if ((x+3)<8 && (y)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+3,y+3));
		if ((x+4)<8 && (y)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+4,y+4));
		if ((x+5)<8 && (y)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+5,y+5));
		if ((x+6)<8 && (y)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+6,y+6));
		if ((x+7)<8 && (y)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+7,y+7));
		
		//the 'adding' stops as soon as the bishop hits a piece. this removes the piece from the possible moves array if it is of the same color as our bishop
		if(Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().getColor() == color) a.remove(a.size()-1);
		
		
		
		if ((x-1)>0 && (y)<8) a.add(new Point(x-1,y+1));
		if ((x-2)>0 && (y)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-2,y+2));
		if ((x-3)>0 && (y)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-3,y+3));
		if ((x-4)>0 && (y)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-4,y+4));
		if ((x-5)>0 && (y)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-5,y+5));
		if ((x-6)>0 && (y)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-6,y+6));
		if ((x-7)>0 && (y)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-7,y+7));
		
		//the 'adding' stops as soon as the bishop hits a piece. this removes the piece from the possible moves array if it is of the same color as our bishop
				if(Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().getColor() == color) a.remove(a.size()-1);
		
		
		if ((y-1)>0 && (x)<8) a.add(new Point(x+1,y-1));
		if ((y-2)>0 && (x)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+2,y-2));
		if ((y-3)>0 && (x)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+3,y-3));
		if ((y-4)>0 && (x)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+4,y-4));
		if ((y-5)>0 && (x)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+5,y-5));
		if ((y-6)>0 && (x)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+6,y-6));
		if ((y-7)>0 && (x)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+7,y-7));
		
		
		//the 'adding' stops as soon as the bishop hits a piece. this removes the piece from the possible moves array if it is of the same color as our bishop
				if(Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().getColor() == color) a.remove(a.size()-1);
		
		
		if ((y+1)>0 && (x)>0) a.add(new Point(x-1,y-1));
		if ((y+2)>0 && (x)>0 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-2,y-2));
		if ((y+3)>0 && (x)>0 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-3,y-3));
		if ((y+4)>0 && (x)>0 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-4,y-4));
		if ((y+5)>0 && (x)>0 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-5,y-5));
		if ((y+6)>0 && (x)>0 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-6,y-6));
		if ((y+7)>0 && (x)>0 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-7,y-7));

		
		//the 'adding' stops as soon as the bishop hits a piece. this removes the piece from the possible moves array if it is of the same color as our bishop
				if(Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().getColor() == color) a.remove(a.size()-1);
		
				//as long the last point in each diagonal of the array is a blank, the bishop will add the next point to its array
				
				if ((x+1)<8 && (y+1)<8) a.add(new Point(x+1,y+1));
				if ((x+2)<8 && (y+2)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X' ) a.add(new Point(x+2,y+2));
				if ((x+3)<8 && (y+3)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+3,y+3));
				if ((x+4)<8 && (y+4)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+4,y+4));
				if ((x+5)<8 && (y+5)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+5,y+5));
				if ((x+6)<8 && (y+6)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+6,y+6));
				if ((x+7)<8 && (y+7)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+7,y+7));
				
				//the 'adding' stops as soon as the bishop hits a piece. this removes the piece from the possible moves array if it is of the same color as our bishop
				if(Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().getColor() == color) a.remove(a.size()-1);
				
				
				
				if ((x-1)>0 && (y+1)<8) a.add(new Point(x-1,y+1));
				if ((x-2)>0 && (y+2)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-2,y+2));
				if ((x-3)>0 && (y+3)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-3,y+3));
				if ((x-4)>0 && (y+4)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-4,y+4));
				if ((x-5)>0 && (y+5)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-5,y+5));
				if ((x-6)>0 && (y+6)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-6,y+6));
				if ((x-7)>0 && (y+7)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-7,y+7));
				
				
				//the 'adding' stops as soon as the bishop hits a piece. this removes the piece from the possible moves array if it is of the same color as our bishop
						if(Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().getColor() == color) a.remove(a.size()-1);
				
				
				if ((y-1)>0 && (x+1)<8) a.add(new Point(x+1,y-1));
				if ((y-2)>0 && (x+2)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+2,y-2));
				if ((y-3)>0 && (x+3)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+3,y-3));
				if ((y-4)>0 && (x+4)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+4,y-4));
				if ((y-5)>0 && (x+5)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+5,y-5));
				if ((y-6)>0 && (x+6)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+6,y-6));
				if ((y-7)>0 && (x+7)<8 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x+7,y-7));
				
				
				//the 'adding' stops as soon as the bishop hits a piece. this removes the piece from the possible moves array if it is of the same color as our bishop
						if(Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().getColor() == color) a.remove(a.size()-1);
				
				
				if ((y-1)>0 && (x-1)>0) a.add(new Point(x-1,y-1));
				if ((y-2)>0 && (x-2)>0 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-2,y-2));
				if ((y-3)>0 && (x-3)>0 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-3,y-3));
				if ((y-4)>0 && (x-4)>0 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-4,y-4));
				if ((y-5)>0 && (x-5)>0 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-5,y-5));
				if ((y-6)>0 && (x-6)>0 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-6,y-6));
				if ((y-7)>0 && (x-7)>0 && Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().charAt(1) == 'X') a.add(new Point(x-7,y-7));

				//the 'adding' stops as soon as the bishop hits a piece. this removes the piece from the possible moves array if it is of the same color as our bishop
						if(Piece[(int)(a.get(a.size()-1).getX())][(int)(a.get(a.size()-1).getY())].toString().getColor() == color) a.remove(a.size()-1);
						
				
				
				
				
				
				
				
			return a;
	}

}
