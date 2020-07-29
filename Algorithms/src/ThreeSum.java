import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {
	
	private long start;

    /**
     * Initializes a new stopwatch.
     * @return 
     */
    public ThreeSum() {
        start = System.currentTimeMillis();
    } 


	public static int count(int[] a) {
		int N = a.length;
		int count = 0;
		for (int i = 0; i < N; i++)
			for (int j = i + 1; j < N; j++)
				for (int k = j + 1; k < N; k++)
					if (a[i] + a[j] + a[k] == 0)
						count++;
		return count;
	}

    /**
     * Returns the elapsed CPU time (in seconds) since the stopwatch was created.
     *
     * @return elapsed CPU time (in seconds) since the stopwatch was created
     */
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int length = scan.nextInt();
		int[] a = new int[length];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < length; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(a));
		ThreeSum sum = new ThreeSum();
		System.out.println(count(a));
		double duration = sum.elapsedTime();
		System.out.println("Time taken to execute : "+duration);

	}

}
