package lab;

class Vehicle { //parent class
    String brand;  //attributes 
    String model;  //attributes 
    int year;		//attributes 

    Vehicle(String brand, String model, int year) {
       this.brand = brand;
       this.model = model;
       this.year = year;
   }

    void drive() { //method called
       System.out.println("Driving the vehicle.");
   }
}

class Car extends Vehicle { //child class inherits from Vehicle
    String color; //additional attribute

   Car(String brand, String model, int year, String color) {
       super(brand, model, year);
       this.color = color;
   }

   public void honk() { //method called
       System.out.println("Honking the car's horn.");
   }
}

public class Lab4_Q1 {
   public static void main(String[] args) {
       Car myCar = new Car("Ferrari", "Roma", 2020, "Black"); 
       //Create an object
       
       myCar.drive();
       myCar.honk();
   }
}

