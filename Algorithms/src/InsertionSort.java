import java.util.Arrays;


public class InsertionSort {
	
	public static int[] insertion(int[] list,int last, int prev){
		int[] orderedList = list;
		int index_lt = last;
		int index_pr = prev;
		int temp;
		int n = 0;
		while(index_lt < orderedList.length){
			if(orderedList.length <= 0 || index_lt > orderedList.length || index_pr == orderedList.length){
				return orderedList;
			}else{
				if(orderedList[index_lt] < orderedList[index_pr]){
					temp = orderedList[index_lt];
					orderedList[index_lt] = orderedList[index_pr];
					orderedList[index_pr] = temp;

					n = index_pr;
					while(n > 0){
						insertion(orderedList,n, n-1);
						n--;
					}
				}
			}
			index_lt++;
			index_pr++;
		}
		return orderedList;
	}
	
	public static void main(String[] args) {
		int myList[] = { 33, 53, 73, 93, 22, 46, 67, 87, 13, 98, 68, 20, 7, 23,
				8, 111, 4, 90, 1, 2, 44 };
		int[] orderedList = insertion(myList,1,0);
		System.out.println(Arrays.toString(orderedList));
	}
}
