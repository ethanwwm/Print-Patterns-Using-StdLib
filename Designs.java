/*
 * Author: Ethan Wong
 * 
 * Question: 1.5.25 from Robert Sedgewick and Kevin Wayne:
 * Introduction to Programming in Java: An Interdisciplinary Approach
 * 
 */

import java.awt.Color;

public class Designs {
	public static void main(String[]args)
	{
		int selection = Integer.parseInt(args[0]);
		
		//If command line argument is 0, the following lines will be executed
		if(selection==0) {
			//DImensions of polygon (Diamond)
			double [] x = {0.5, 1.0, 0.5, 0.0};
			double [] y = {0.0, 0.5, 1.0, 0.5};
			
			//DImensions of polygon (Triangle)
			double [] t1x = {0.0, 0.25, 0.25};
			double [] t1y = {0.25, 0.25, 0.0};
			
			//DImensions of polygon (Triangle)
			double [] t2x = {0.75, 0.75, 1.0};
			double [] t2y = {0, 0.25, 0.25};
			
			//DImensions of polygon (Triangle)
			double [] t3x = {0.0, 0.25, 0.25};
			double [] t3y = {0.75, 0.75, 1.0};
			
			//DImensions of polygon (Triangle)
			double [] t4x = {0.75, 0.75, 1.0};
			double [] t4y = {0.75, 1.0, 0.75};
			
			//Fills background
			StdDraw.filledSquare(0.5,0.5,256);
			
			//Changes color of filled polygon
			StdDraw.setPenColor(Color.gray);
			StdDraw.filledPolygon(x,y);
			
			//Outputs the 4 triangular polygon
			StdDraw.setPenColor(Color.white);
			StdDraw.filledPolygon(t1x, t1y);
			StdDraw.filledPolygon(t2x, t2y);
			StdDraw.filledPolygon(t3x, t3y);
			StdDraw.filledPolygon(t4x, t4y);
		}
		
		//If command line argument is 1, the following lines will be executed
		if(selection==1) {
			//DImensions of polygon (Diamond)
			double [] x = {0.5, 1.0, 0.5, 0.0};
			double [] y = {0.0, 0.5, 1.0, 0.5};
			
			//DImensions of polygon (Rectangle)
			double [] r1x = {0.0, 0.125, 0.375, 0.25};
			double [] r1y = {0.25, 0.375, 0.125, 0};
			
			//DImensions of polygon (Rectangle)
			double [] r2x = {0, 0.25, 0.375, 0.125};
			double [] r2y = {0.75, 1, 0.875, 0.625};
			
			//DImensions of polygon (Rectangle)
			double [] r3x = {0.625, 0.75, 1.0, 0.875};
			double [] r3y = {0.875, 1.0, 0.75, 0.625};
			
			//DImensions of polygon (Rectangle)
			double [] r4x = {0.625, 0.875, 1, 0.75};
			double [] r4y = {0.125, 0.375, 0.25, 0};
			
			//Fills background
			StdDraw.filledSquare(0.5,0.5,256);
			
			//Changes color of filled polygon
			StdDraw.setPenColor(Color.gray);
			StdDraw.filledPolygon(x,y);
			
			//Outputs the 4 rectangular polygon
			StdDraw.setPenColor(Color.white);
			StdDraw.filledPolygon(r1x, r1y);
			StdDraw.filledPolygon(r2x, r2y);
			StdDraw.filledPolygon(r3x, r3y);
			StdDraw.filledPolygon(r4x, r4y);
		}
		
		//If command line argument is 2, the following lines will be executed
		if (selection==2)
		{
			//Dimensions of polygon (Diamond)
			double [] x = {0.5, 1.0, 0.5, 0.0};
			double [] y = {0.0, 0.5, 1.0, 0.5};
			
			//Dimensions of rectangle
			double [] rx1 = {0, 0, 1, 1};
			double [] ry1 = {0.25, 0.75, 0.75, 0.25};
			
			//Dimensions of rectangle
			double [] rx2 = {0.25, 0.25, 0.75, 0.75};
			double [] ry2 = {0, 1, 1, 0};
			
			//Prints the rectangles
			StdDraw.setPenColor(Color.black);
			StdDraw.filledPolygon(rx1, ry1);
			StdDraw.filledPolygon(rx2, ry2);
			
			//Prints diamond
			StdDraw.setPenColor(Color.gray);
			StdDraw.filledPolygon(x,y);
			
		}
		
		//If command line argument is 3, the following lines will be executed
		if(selection==3)
		{
			//DImensions of polygon (Diamond)
			double [] x = {0.5, 1.0, 0.5, 0.0};
			double [] y = {0.0, 0.5, 1.0, 0.5};
			
			//DImensions of rectangle
			double [] rx1 = {0, 0, 1, 1};
			double [] ry1 = {0.25, 0.75, 0.75, 0.25};
			
			//DImensions of rectangle
			double [] rx2 = {0.25, 0.25, 0.75, 0.75};
			double [] ry2 = {0, 1, 1, 0};
			
			//Dimensions of the 4 triangles
			double [] tx1 = {0, 0.5, 1};
			double [] ty1 = {0.25, 0.75, 0.25};
			double [] tx2 = {0, 1, 0.5};
			double [] ty2 = {0.75, 0.75, 0.25};
			double [] tx3 = {0.25, 0.25, 0.75};
			double [] ty3 = {0, 1, 0.5};
			double [] tx4 = {0.25, 0.75, 0.75};
			double [] ty4 = {0.5, 1, 0};
			
			//Prints and changes color of background
			StdDraw.setPenColor(Color.gray);
			StdDraw.filledSquare(0.5,0.5,256);
			
			//Prints the two black rectangles
			StdDraw.setPenColor(Color.black);
			StdDraw.filledPolygon(rx1, ry1);
			StdDraw.filledPolygon(rx2, ry2);
			
			//Prints the 4 white triangles
			StdDraw.setPenColor(Color.white);
			StdDraw.filledPolygon(tx1, ty1);
			StdDraw.filledPolygon(tx2, ty2);
			StdDraw.filledPolygon(tx3, ty3);
			StdDraw.filledPolygon(tx4, ty4);
			
			//Prints the gray diamond
			StdDraw.setPenColor(Color.gray);
			StdDraw.filledPolygon(x,y);
		}
		
		
	}
}
