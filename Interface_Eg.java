package Abstraction;
interface Shape{
	void shape_name();
}
class User_Circle implements Shape{
	@Override
	public void shape_name() {
		System.out.println("Draw a circle");
	}
}
class User_Triangle implements Shape{
	@Override
	public void shape_name() {
		System.out.println("Draw a triangle");
	}
}
public class Interface_Eg {
	public static void main(String[] args) {
		Shape object = new User_Triangle();
		object.shape_name();
	}

}