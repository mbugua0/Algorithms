/*
 * An array is bitonic if it is comprised of an increasing sequence of 
 * integers followed immediately by a decreasing sequence of integers. 
 * Write a program that, given a bitonic array of nn distinct integer 
 * values, determines whether a given integer is in the array.
 * Standard version: Use ∼3 lg n compares in the worst case.
 * Signing bonus: Use ∼2 lg n compares in the worst case 
 * (and prove that no algorithm can guarantee to perform fewer than 
 * ∼2 lg n compares in the worst case).
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class BinarySearch {
	static boolean check = false;
	/**
	 * @param args
	 */
	
	public static boolean binarySearch(int element_,int lower_,int upper_,ArrayList<Integer> list_){
		
		if (lower_ > upper_) {
	        check = false;
			return check;
	    }
		
		int median = (lower_ + upper_)/2;
		if(list_.get(median) == element_){
			check = true;
			return check;
		}
		else if(list_.get(median) < element_){
			binarySearch(element_, median + 1, upper_, list_);
		}
		else{
			binarySearch(element_, lower_, median - 1, list_);
		}
		return check;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
        int lower = 0;
        System.out.println("Enter the length of the array:");
		int upper = scan.nextInt();
		System.out.println("Enter the elements of the array:");
		ArrayList<Integer> mylist = new ArrayList<Integer>(upper);
		for (int i = 0; i < upper; i++){
			mylist.add(scan.nextInt());
		}
        //Sort the array
		Collections.sort(mylist);
		System.out.println("my array:"+mylist);
		System.out.println("Enter the element to search in the array:");
		int element = scan.nextInt();
        boolean found = binarySearch(element, lower, upper, mylist);
		
		if (found == true){
			System.out.println("Element : "+ element +" found in our array");
		}else{
			System.out.println("Element : "+ element +" not found in our array");
		}

	}

}

