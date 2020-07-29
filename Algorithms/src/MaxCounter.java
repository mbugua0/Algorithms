import java.util.Hashtable;

/*Calculate the values of counters after applying all 
 * alternating operations: increase counter by 1; 
 * set value of all counters to current maximum.*/

public class MaxCounter {
	public int[] mySolution(int N, int[] A) {
		int maxValue = 0;
		int values = 0;
		int[] counters = new int[N];
		Hashtable<Integer, Integer> unique = new Hashtable<Integer, Integer>();

		for (int i = 0; i < A.length; i++) {

			if (A[i] <= N) {

				if (counters[A[i] - 1] < values) {
					counters[A[i] - 1] = values + 1;
				} else {
					counters[A[i] - 1] += 1;
				}
				unique.put(A[i] - 1, counters[A[i] - 1]);

				if (maxValue < counters[A[i] - 1]) {

					maxValue = counters[A[i] - 1];
				}
			} else if (A[i] == (N + 1)) {
				values = maxValue;
				unique.clear();
			}
		}

		for (int j = 0; j < N; j++) {
			if (unique.containsKey(j)) {

				counters[j] = unique.get(j);
			} else {
				counters[j] = values;
			}
		}

		return counters;
	}
}
