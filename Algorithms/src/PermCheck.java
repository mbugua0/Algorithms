import java.util.Hashtable;

/*Check whether array A is a permutation.*/
public class PermCheck {
	public int solution(int[] A) {
		Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();

		for (int i = 0; i < A.length; i++) {
			if (table.containsKey(A[i]) || A[i] > A.length) {
				return 0;
			} else {
				table.put(A[i], true);
			}
		}

		return 1;
	}
}
