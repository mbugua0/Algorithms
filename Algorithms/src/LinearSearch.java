
public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int lst[] = {33,53,73,93,22,46,67,87,13,98,68,20,7,23,8,111,4,90,1,2,44};
        int element = 17;
        int x = findItem(lst,element);
        
        if (x > 0) { 	
        	System.out.println("Found the element:"+ element +" in the array");
        }else{
        	System.out.println("The element:"+ element +" was not found in the array");
        }

	}
	
	public static int findItem(int[] myList,int item){
		
		int y = 0;
        for (int i = 0; i < myList.length; i++){
        	if (myList[i] == item){
        		y = item;
        	}
        }
        return y;
	}

}
