package lab;
public class Stu_lab 
{
	 String Name;    // instance variable
     int Roll_no;
     String Depart;
     
     Stu_lab()		// Default constructor
     {
    	Name = "Zoha";
    	Roll_no = 75;
    	Depart = "CSE";
    	 
     }
     Stu_lab(String Name,int Roll_no,String Dept)	// Parameterized constructor
     {
    	 this.Name = Name;
    	 this.Roll_no = Roll_no;
    	 this.Depart = Dept;
     }
     void Display() 
     {
    	 System.out.println("The Name is: "+Name+"\nThe Roll_no is: "+Roll_no+"\nThe Depart is: "+Depart);
    	 
     }
     public static void main(String[] args) 
     {
    	 Stu_lab obj = new Stu_lab();
    	 System.out.println("   Default constructor  \n");
    	 obj.Display();
    	 Stu_lab obj1=new Stu_lab("Cristiano",07,"Soccer");
    	 System.out.println("\n  Parameterized constructor  \n");
    	 obj1.Display();
	}

}