/*
 * Explanation
 * The Fibonacci sequence begins as follows:
 * fibonacci(0) = 0
 * fibonacci(1) = 1
 * fibonacci(2) = fibonacci(1)+fibonacci(0)
 * fibonacci(3) = fibonacci(2)+fibonacci(1)
 * fibonacci(4) = fibonacci(3)+fibonacci(2)
 * fibonacci(5) = fibonacci(4)+fibonacci(3)
 * 
 * fibonacci(0) = 0 and fibonacci(1) = 1 are the first two elements
 * fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
 */
import java.util.Scanner;


public class FibonacciSeq {

	/**
	 * @param args
	 */
    // Complete the function.
	public static int fibonacci(int n) {
	    if(n <= 0){
	        return 0;
	    }
	    if(n == 1){
	        return 1;
	    }
	    return fibonacci(n-1)+fibonacci(n-2);
	    
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fibonacci(n));
	}

}
