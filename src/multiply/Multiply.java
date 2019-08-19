package multiply;

import java.util.Scanner;

//Reads n - an integer from the console
//Prints n's first multiples in the format
//"{n} x {i} = {result}"

	public class Multiply {
	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       int n = scanner.nextInt();
	       for(int i = 1; i <= 10; i ++){
	           System.out.printf("%d x %d = %d", n, i , n*i);
	           System.out.println();
	       }
	     
	    }
	}
