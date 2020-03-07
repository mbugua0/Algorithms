import java.util.ArrayList;
import java.util.Arrays;


public class BubbleSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myList = new ArrayList<Integer>();
		//Adding items
		myList.add(4);
		myList.add(9);
		myList.add(7);
		myList.add(1);
		myList.add(3);
		myList.add(6);
		myList.add(5);
		//sort the list
		int len = myList.size();
		System.out.print(myList);
		for (int i = 0; i < len; i++){
			boolean sorted = false;
			for (int n = 0; n < len-1; n++){
				int first = myList.get(n);
				int second = myList.get(n+1);
				if (first > second){
					myList.set(n, second);
					myList.set(n+1, first);
					sorted = true;
				}
			}
			if (sorted == false){
				break;
			}else
				System.out.print(myList);
				
		}
		System.out.print(Arrays.toString(myList.toArray()));

	}

}
