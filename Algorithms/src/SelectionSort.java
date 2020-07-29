import java.util.Arrays;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first,index;
        int myList[] = {33,53,73,93,22,46,67,87,13,98,68,20,7,23,8,111,4,90,1,2,44};
        boolean check;
        for (int i = 0; i < myList.length; i++){
            first = myList[i];
            index = 0;
            check = false;
            for (int x = i; x < myList.length; x++){
                if (first > myList[x]){
                    first = myList[x];
                    index = x;
                    check = true;
                }
            }
            if (check){
                myList[index] = myList[i];
                myList[i] = first;
            }
            System.out.println(Arrays.toString(myList));
            System.out.println();
        }

	}

}
