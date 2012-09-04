package generalChess;
import java.util.*;
import java.awt.*;
public class Bishop extends Piece {

	public Bishop(boolean b) {
		super(b,"B");
		// TODO Auto-generated constructor stub
		
		//piece can only move diagonally and in 8x8 board
		
	}
	public ArrayList<Point> possibleMoves(){
		
		ArrayList <Point> a=new ArrayList <Point>();
		
		//get current point of said bishop
		
		Point currPoint = new Point (4,4);
		int x = (int)currPoint.getX();
		int y = (int)currPoint.getY();
		
		a.add(new Point(x,y));
		
		//bishop moves diagonally in 8x8 board
		
		if ((x+1)<8 && (y+1)<8) a.add(new Point(x+1,y+1));
		if ((x+2)<8 && (y+2)<8) a.add(new Point(x+2,y+2));
		if ((x+3)<8 && (y+3)<8) a.add(new Point(x+3,y+3));
		if ((x+4)<8 && (y+4)<8) a.add(new Point(x+4,y+4));
		if ((x+5)<8 && (y+5)<8) a.add(new Point(x+5,y+5));
		if ((x+6)<8 && (y+6)<8) a.add(new Point(x+6,y+6));
		if ((x+7)<8 && (y+7)<8) a.add(new Point(x+7,y+7));
		
		if ((x-1)>0 && (y+1)<8) a.add(new Point(x-1,y+1));
		if ((x-2)>0 && (y+2)<8) a.add(new Point(x-2,y+2));
		if ((x-3)>0 && (y+3)<8) a.add(new Point(x-3,y+3));
		if ((x-4)>0 && (y+4)<8) a.add(new Point(x-4,y+4));
		if ((x-5)>0 && (y+5)<8) a.add(new Point(x-5,y+5));
		if ((x-6)>0 && (y+6)<8) a.add(new Point(x-6,y+6));
		if ((x-7)>0 && (y+7)<8) a.add(new Point(x-7,y+7));
		
		
		if ((y-1)>0 && (x+1)<8) a.add(new Point(x+1,y-1));
		if ((y-2)>0 && (x+2)<8) a.add(new Point(x+2,y-2));
		if ((y-3)>0 && (x+3)<8) a.add(new Point(x+3,y-3));
		if ((y-4)>0 && (x+4)<8) a.add(new Point(x+4,y-4));
		if ((y-5)>0 && (x+5)<8) a.add(new Point(x+5,y-5));
		if ((y-6)>0 && (x+6)<8) a.add(new Point(x+6,y-6));
		if ((y-7)>0 && (x+7)<8) a.add(new Point(x+7,y-7));
		
		
		if ((y-1)>0 && (x-1)>0) a.add(new Point(x-1,y-1));
		if ((y-2)>0 && (x-2)>0) a.add(new Point(x-2,y-2));
		if ((y-3)>0 && (x-3)>0) a.add(new Point(x-3,y-3));
		if ((y-4)>0 && (x-4)>0) a.add(new Point(x-4,y-4));
		if ((y-5)>0 && (x-5)>0) a.add(new Point(x-5,y-5));
		if ((y-6)>0 && (x-6)>0) a.add(new Point(x-6,y-6));
		if ((y-7)>0 && (x-7)>0) a.add(new Point(x-7,y-7));

		
		
		return a;
	}
	
	
	
	
	
	
}



