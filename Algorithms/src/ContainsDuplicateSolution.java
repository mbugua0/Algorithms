import java.util.HashSet;


public class ContainsDuplicateSolution {
	
	 public boolean duplicate(int[] nums){
		 
		 HashSet<Integer> set = new HashSet<Integer>();
		 
		 for(int i = 0; i < nums.length; i++){
			 if(set.contains(nums[i]))
				 return true;
			 set.add(nums[i]);
		 }
		 
		 return false;
	 }
	 
	 public static void main(String[] args){
		 
		 int[] array = new int[10];
		 //array = [1,1,1,3,3,4,3,2,4,2];
		 ContainsDuplicateSolution solution = new ContainsDuplicateSolution();
		 if (solution.duplicate(array))
			 System.out.println("Duplicate found");
		 
	 }

}
