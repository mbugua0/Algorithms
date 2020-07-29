/*Let's calculate the number of ways of climbing the first two of the Davis' s=3  staircases:

The first staircase only has n=1  step, so there is only one way for him to climb it (i.e., by jumping 1 step). Thus, we print 1 on a new line.
The second staircase has n=3 steps and he can climb it in any of the four following ways:

1. 1 > 1 >1
2. 1 > 2
3. 2 > 1
4. 3
Thus, we print  on a new line.*/

import java.util.Scanner;


public class StairCase {

	/**
	 * @param args
	 */
	// Complete the stepPerms function below.
    static int stepPerms(int n) {
        if(n < 0){
            return 0;
        }
        if (n == 0 || n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        if (n == 3){
            return 4;
        }
        if (n == 4){
            return 7;
        }
        if (n == 5){
            return 13;
        }

        return stepPerms(n-1)+stepPerms(n-2)+stepPerms(n-3);


    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(stepPerms(n));
	}

}
