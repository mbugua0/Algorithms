
public class BinarySearch {
	static boolean check = false;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int element = 87;
		int[] mylist = {1, 2, 4, 7, 8, 13, 20, 22, 23, 33, 44, 46, 53, 67, 68, 73, 87, 90, 93, 98, 111};
        int lower = 0;
        int upper = mylist.length;
        
        boolean found = binarySearch(element, lower, upper, mylist);
		
		if (found == true){
			System.out.println("Element : "+ element +" found in our array");
		}else{
			System.out.println("Element : "+ element +" not found in our array");
		}

	}
	
	public static boolean binarySearch(int element_,int lower_,int upper_,int[] list_){
		
		if (lower_ > upper_) {
	        check = false;
			return false;
	    }
		
		int median = (lower_ + upper_)/2;
		if(list_[median] == element_){
			check = true;
			return true;
		}
		else if(list_[median] < element_){
			binarySearch(element_, median + 1, upper_, list_);
		}
		else{
			binarySearch(element_, lower_, median - 1, list_);
		}
		return check;
	}

}
