import java.util.Hashtable;

/*Find the minimal positive integer not occurring in a given sequence.*/

public class MissingInteger {
	class mySolution {
		public int solution(int[] A) {
			Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();

			for (int i = 0; i < A.length; i++) {
				table.put(A[i], true);
			}

			for (int j = 1; j <= A.length; j++) {
				if (!table.containsKey(j)) {
					return j;
				}
			}

			return A.length + 1;

		}
	}
}
