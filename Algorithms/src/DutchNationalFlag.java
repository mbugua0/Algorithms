/*
 * Given a mess of 3 balls (colored red blue and white) write an 
 * algorithm + program with the most efficient way to sort them 
 * color wise. (Dutch National Flag Problem)
 * 
 * Or 
 * 
 * Sort an array of 0s, 1s and 2s
 */
public class DutchNationalFlag {

	/**
	 * @param args
	 */
	// Utility function to print the contents of an array 
    static void printArr(int arr[], int n) 
    { 
        for (int x = 0; x < n; x++) 
            System.out.print(arr[x] + " "); 
    } 
      
    // Function to sort the array of 0s, 1s and 2s 
    static void sortArr(int arr[], int n) 
    { 
        int i = 0, cnt0 = 0, cnt1 = 0, cnt2 = 0; 
      
        // Count the number of 0s, 1s and 2s in the array 
        for (int x = 0; x < n; x++) { 
            switch (arr[x]) { 
            case 0: 
                cnt0++; 
                break; 
            case 1: 
                cnt1++; 
                break; 
            case 2: 
                cnt2++; 
                break; 
            } 
        } 
      
        // Store all the 0s in the beginning 
        while (cnt0 > 0) { 
            arr[i++] = 0; 
            cnt0--; 
        } 
      
        // Then all the 1s 
        while (cnt1 > 0) { 
            arr[i++] = 1; 
            cnt1--; 
        } 
      
        // Finally all the 2s 
        while (cnt2 > 0) { 
            arr[i++] = 2; 
            cnt2--; 
        } 
      
        // Print the sorted array 
        printArr(arr, n); 
    } 
      
    // Driver code 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 }; 
        int n = arr.length; 
        sortArr(arr, n); 

	}

}

/*
 * Complexity Analysis: Time Complexity: O(n).
 * Only two traversals of the array is needed.
 * Space Complexity: O(1).As no extra space is required.
 */
