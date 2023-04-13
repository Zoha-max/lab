package Abstraction;
interface shape{
	void sides();//Abstract
	default void show() {//default method
		System.out.println("Default Method");
	}
	static int square(int a) {//static method
		return a*a;
	}
}
class Rectangle implements shape{
	@Override
	public void sides() {
		System.out.println("Parent abstract method");
	}
}
public class InterfaceEg2 {
public static void main(String[] args) {
	shape obj=new Rectangle();
	obj.show();//default method
	obj.sides();//Abstract method
	System.out.println(shape.square(2));
}
}
