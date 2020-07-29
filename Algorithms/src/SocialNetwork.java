import java.util.Scanner;

/*Social network connectivity. Given a social network containing 
 * n members and a log file containing m timestamps at which 
 * times pairs of members formed friendships, design an algorithm 
 * to determine the earliest time at which all members are 
 * connected (i.e., every member is a friend of a friend of a 
 * friend ... of a friend). Assume that the log file is sorted 
 * by timestamp and that friendship is an equivalence relation. 
 * The running time of your algorithm should be mlogn 
 * or better and use extra space proportional to n.*/
public class SocialNetwork {

	/*It's a Union–Find problem*/
	/**
	 * @param args
	 */
	public int[] members;
	public int[] time;
	
	public SocialNetwork(int n){
		members = new int[n];
		time = new int[n];
		
		for (int i=0;i<n;i++){
			members[i] = i;
			time[i] = i;
		}
		/*for (int i=0;i<m;i++){
			time[i] = i;
		}*/
	}
	public int root(int m){
		while(m != members[m]){
			members[m] = members[members[m]];
			m = members[m];
		}	
		return m;
	}
	
	public boolean connected(int m,int t){
		return root(m) == root(t);
	}
	
	public void union(int i, int j) {
		int m = root(i);
		int t = root(j);
		/*
		 * change root of p to point to root of q (depth of p and q array
		 * accesses)
		 */
		if (m == t)
			return;

		if (members[m] < time[t]) {
			members[m] = t;
			time[t] += time[m];
		} else {
			members[t] = m;
			time[m] += time[t];
		}
	}
	
	public int find(int i){
		return root(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 10; 
		Scanner input = new Scanner(System.in);
		int num1, num2;
		SocialNetwork social = new SocialNetwork(m);
		
		for (int i =0; i< m; i++){
			num1 = input.nextInt();
			num2 = input.nextInt();
			if (!social.connected(num1, num2))
				social.union(num1, num2);
		}
		for (int i = 0; i < social.time.length; i++) {
			System.out.print(social.time[i] + " ");
		}
		

	}

}
