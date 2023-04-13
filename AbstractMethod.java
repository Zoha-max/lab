package Abstraction;

//Example of abstract class

 abstract class Testabstract{ // abstract class 3 abstract void display(); // abstract method -- pare

class Demo1 extends Testabstract{ // 1st child class

// abstrct method of parent class

 void display () {
System.out.println("Demo1 method invoked");

}}

class Demo2 extends Testabstract{ // 2nd child class //abstret method of parent class System.out.println("dena2 method invoked");

void display () {
	System.out.println("Demo2 method invoked");

}}
 public class AbstractMethod{
 public static void main(String[] args) {
	 Demo1 child1 =new Demo1();
	 Demo2 child2 =new Demo2();
child1.display();
child2.display();
}
 }}