/*Compute number of integers divisible by k in range [a..b].*/
public class CountDiv {
	public int mySolution(int A, int B, int K) {
		int rem = A % K;
		int val;

		if (rem == 0) {
			return (B - A) / K + 1;
		} else if (B >= K) {
			val = (K - rem) + A;
			if (val < B) {
				return (B - val) / K + 1;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}
}
