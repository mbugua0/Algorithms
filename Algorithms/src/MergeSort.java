import java.util.Arrays;


public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mylist = {33,53,73,93,22,46,67,87,13,98,68,20,7,23,8,111,4,90,1,2,44};
        int[] result = mergeSort(mylist);
		System.out.print(Arrays.toString(result));

	}
	
	public static int[] mergeSort(int[] list){
		
		//This split the array into subarrays until no more splitting can be done
		int len = list.length;
		int[] left;
		int[] right;
		
		//if length is divisible by two we create two equal arrays in size
		//else the right subarray is gets more elements
		if (len%2 == 0){
			left = new int[len/2];
			right = new int[len/2];
		}else{
			left = new int[len/2];
			right = new int[len/2 + 1];
		}
		
		for(int i = 0; i < len; i++ ){
			//assign the left and right subarrays elements 
			if(i < len/2){
				left[i] = list[i];
			}else{
				right[i - len/2] = list[i];
			}
		}
		
		//recursive splitting
		//check if the length of subarray is greater than 1 before recursion
		if (left.length > 1){
		left = mergeSort(left);
		}
		if (right.length > 1){
		right = mergeSort(right);
		}
		
		//merge and sort
		int[] sorted = merge(left,right);
		
		return sorted;
	}
	
	public static int[] merge(int[] left,int[] right){
		
		int l = 0;
		int r = 0;
		int index = 0;
		// create space for the merged array
		int[] merged = new int[left.length + right.length];
		// add until one subarray is deplete
		while(l < left.length && r < right.length){
			if (left[l] < right[r]){
				merged[index++] = left[l++];
			}else{
				merged[index++] = right[r++];
			}
		}
		
		// add every leftover element from the subarray 
		// only one of these two while loops will be executed
		while(l < left.length){
			merged[index++] = left[l++];
		}
		
		while(r < right.length){
			merged[index++] = right[r++];
		}
		
		return merged;
	}

}
