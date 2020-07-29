import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Successor with delete. Given a set of n integers 
 * S = { 0, 1, ... , n-1 }
 *  and a sequence of requests of the following form:

 Remove x from S
 Find the successor of x: the smallest y in S such that y≥x.
 design a data type so that all operations (except construction) 
 take logarithmic time or better in the worst case.*/
public class SuccessorWithDelete {

	/**
	 * @param args
	 */
	private ArrayList<Integer> myArray = new ArrayList<Integer>();

	public SuccessorWithDelete(int i) {
		for (int x = 0; x < i; x++)
			myArray.add(x);
	}

	private void delete(int i) {
		myArray.remove(i);
	}

	private int getElement(int i) {
		return myArray.get(i);
	}

	private int getSuccessor(int i) {
		int index = myArray.indexOf(i);
		return getElement(index + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		Scanner input = new Scanner(System.in);
		int num =  input.nextInt();
		SuccessorWithDelete suc = new SuccessorWithDelete(i);
		Collections.sort(suc.myArray);
		System.out.println(" Array : " + suc.myArray);

		System.out.println("Element :" + suc.getElement(num));
		System.out.println(" Successor is : " + suc.getSuccessor(num));
		suc.delete(num);
		System.out.println(" Array : " + suc.myArray);

	}

}
