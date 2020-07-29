import java.util.Hashtable;

/*Find the earliest time when a frog can jump to the other side of a river.*/
public class FrogRiverOne {
	class mySolution {
		public int solution(int X, int[] A) {
			Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
			int count = 0;
			int time = -1;

			for (int i = 0; i < A.length; i++) {
				if (!table.containsKey(A[i]) && A[i] <= X) {
					count++;
					table.put(A[i], true);

				}

				if (count == X) {
					time = i;
					break;
				}
			}

			return time;

		}
	}
}
