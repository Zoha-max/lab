package lab;



public class Rectangle1 
{
	private int length;   // instance variable
	private int breadth;
	
	Rectangle1(int length,int breadth)  // Parameterized constructor
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	int Area() // method for calculation
	{
		return length * breadth;
	}
	
	}
 
class RectangleTest 
{
	public static void main(String[] args)  // main method
	{
		Rectangle1 r = new Rectangle1(40,20);
		System.out.println("Area = "+r.Area()); // calculating area of rectangle
		Rectangle1 r1 = new Rectangle1(30,30);
		System.out.println("New Area = "+r1.Area());
		
	}
	
}
