import java.util.ArrayList;
import java.util.List;

public class PascalTriangleSolution {
	public List<List<Integer>> generate(int numRows) {
	        
	        List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>();
	        if (numRows <= 0){
	            return pascalTriangle;
	        }
	         
	        List<Integer> row = new ArrayList<Integer>();
	        row.add(1); // add the root/top node
	        pascalTriangle.add(row);
	        
	        for (int m = 1; m < numRows; m++){
	            List<Integer> currentRow = new ArrayList<Integer>();
                List<Integer> previousRow = pascalTriangle.get(m-1);
	            currentRow.add(1);
	            for (int n = 1; n < m; n++){ // added first element on current row
	                currentRow.add(previousRow.get(n-1)+previousRow.get(n));
	            }
	            currentRow.add(1); // added last element on current row
	            pascalTriangle.add(currentRow);
	        }
	        
	        
	      return pascalTriangle;  
	    }
}
