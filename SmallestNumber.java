package lab;

public class SmallestNumber {
	 public static int findSmallest(int num1, int num2, int num3) {
	        int smallest = num1;
	        if (num2 < smallest) {
	            smallest = num2;
	        }
	        if (num3 < smallest) {
	            smallest = num3;
	        }
	        return smallest;
	    }
	    
	    public static void main(String[] args) {
	        int smallest = findSmallest(10, 5, 15);
	        System.out.println("Smallest number is: " + smallest);
	    }

}
