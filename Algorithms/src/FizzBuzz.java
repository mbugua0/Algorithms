import java.util.Scanner;


public class FizzBuzz {

	/**
	 * @param args
	 */
	/*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    // Write your code here
        int i = 1;
        int first = 3;
        int second = 5;
        while(i<=n){
            if(i%first == 0 && i%second == 0){
                System.out.println("FizzBuzz");
            }
            else if(i%first == 0 && i%second > 0){
                System.out.println("Fizz");
            }
            else if(i%first > 0 && i%second == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
            i++;
        }

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		fizzBuzz(n);

	}

}
