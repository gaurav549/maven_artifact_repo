package JavaPrograms;

import java.util.Scanner;

public class Swap_Two_Numbers {
	
	public static void main(String args[]) {
	
	int x, y ;
	System.out.println("Enter two Numbers x and y : ");
     Scanner scan = new Scanner(System.in);
     x=scan.nextInt();
     y=scan.nextInt();
     System.out.println("Two numbers are before Swap:\n x="+x+ "\n y="+y);
     x= x+y;
     y=x-y;
     x=x-y;
    System.out.println("Two numbers are After Swap:\n x="+x+ "\n y="+y);
     
}
}
