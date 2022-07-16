package leetCodeSolution;

public class MaxAreaofIsland {

	public static void main(String[] args) {
		/**/

		/*
		 * int[][] grid = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0,
		 * 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1,
		 * 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
		 * { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0,
		 * 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
		 */

		/* int[][] grid = {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}}; */
		int[][] grid = { { 1, 1 }, { 1, 0 } };
		System.out.println(maxAreaOfIsland(grid));

	}

	public static int maxAreaOfIsland(int[][] grid) {
		int Y = 0;
		int X = 0;
		int currentMax = 0;
		int maxArea = 0;
		
		if (grid.length == 1) {
			while (X < grid[0].length) {
				if (Y < grid.length && grid[Y][X] != 0) {
					if (X >= 1 && X < grid[0].length && grid[Y][X - 1] != 0) {
						grid[Y][X] = grid[Y][X - 1] + grid[Y][X];
					}
					currentMax = grid[Y][X];
				}
				if (currentMax >= maxArea) {
					maxArea = currentMax;
					currentMax = 0;
				} else {
					currentMax = 0;
				}
				X++;
			}
			return maxArea;
		}

		if (grid[0].length == 1) {
			while (Y < grid.length) {
				if (Y < grid.length && grid[Y][X] != 0) {
					if (Y >= 1 && Y < grid.length && grid[Y - 1][X] != 0) {
						grid[Y][X] = grid[Y - 1][X] + grid[Y][X];
					}
					currentMax = grid[Y][X];
				}
				if (currentMax >= maxArea) {
					maxArea = currentMax;
					currentMax = 0;
				} else {
					currentMax = 0;
				}
				Y++;
			}
			return maxArea;
		}
		

		while (X <= grid[0].length) {
			if (X == grid[0].length) {
				Y++;
				X = 0;
			} else if (Y == grid.length) {
				break;
			}
			if (Y < grid.length && grid[Y][X] ==1) {
				maxArea = Math.max(maxArea, max_Area(grid, Y, X));
			}

			X++;
		}

		return maxArea;
	}

	public static int max_Area(int[][] grid, int Y, int X) {
		if (X >= 0 && Y >= 0 && X < grid[0].length && Y < grid.length && grid[Y][X] == 1) {
			grid[Y][X]=0;
			return 1+max_Area(grid,Y+1,X)+max_Area(grid,Y-1,X)+max_Area(grid,Y,X-1)+max_Area(grid,Y,X+1);
		}
		return 0;
	}

}
