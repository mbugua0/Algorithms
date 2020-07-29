/*
 * Number of Islands
 * 
 *Given a 2d grid map of '1's (land) and '0's (water), count the 
 *number of islands. An island is surrounded by water and is formed 
 *by connecting adjacent lands horizontally or vertically. 
 *You may assume all four edges of the grid are all surrounded by water.
 *
 */

public class NumberOfIslands {

	/**
	 * @param args
	 */
	public int numIslands(char[][] grid) {
		
		int count = 0;
		
		for(int m = 0; m < grid.length; m++){ //traverse rows
			for(int n = 0; n < grid[m].length; n++){ //traverse elements in a row
				if (grid[m][n] == '1'){
					count += 1;
					breadthFirstSearch(grid, m, n);
				}
			}
		}
		return count;
	}
	
	public void breadthFirstSearch(char[][] grid, int m, int n){
		if(m < 0 || m >= grid.length || n >= grid[m].length || n < 0 || grid[m][n] == '0'){
			return;
		}
		grid[m][n] = '0';
		breadthFirstSearch(grid, m+1, n); //up
		breadthFirstSearch(grid, m-1, n); //down
		breadthFirstSearch(grid, m, n+1); //right
		breadthFirstSearch(grid, m, n-1); //left
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfIslands island = new NumberOfIslands();
		char[][] grid1 = new char[4][5];
//		grid1 =	[["1","1","1","1","0"],["1","1","0","1","0"],
//		        ["1","1","0","0","0"],["0","0","0","0","0"]];
//		
		char[][] grid2 = new char[4][5];
//		grid2 = [["1","1","0","0","0"],["1","1","0","0","0"],
//		         ["0","0","1","0","0"],["0","0","0","1","1"]];
		
		System.out.println("Islands : "+island.numIslands(grid1));
		System.out.println("Islands : "+island.numIslands(grid2));

	}

}
