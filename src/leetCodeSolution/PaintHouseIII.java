package leetCodeSolution;

import java.util.Arrays;

public class PaintHouseIII {

	public static void main(String[] args) {
		// unfinished
		int[] houses = { 0, 2, 1, 2, 0 };
		int[][] cost = { { 1, 10 }, { 10, 1 }, { 10, 1 }, { 1, 10 }, { 5, 1 } };
		int m = 5;
		int n = 2;
		int target = 3;
		System.out.println(minCost(houses, cost, m, n, target));
	}

	public static int minCost(int[] houses, int[][] cost, int m, int n, int target) {
		boolean containsZero = Arrays.stream(houses).anyMatch(x -> x == 0);
		if (!containsZero) {
			return -1;
		}
		int neighbors = 1;
		int total = 0;
		int colorNum = 0;
		for (int i = 0; i < m; i++) {
			if (houses[i] == 0) {
				int min_cost = Integer.MAX_VALUE;
				for (int j = 0; j < n; j++) {
					if (min_cost > cost[i][j]) {
						min_cost = cost[i][j];
						colorNum = j + 1;
					}
				}
				total += min_cost;
				houses[i] = colorNum;
			}
		}

		neighbors = countNeighbors(houses);
		if(neighbors!=target) {
			System.out.println("not match");
		}
		System.out.println("countNeighbors: " + neighbors);
		return total;
	}

	public static int countNeighbors(int[] houses) {
		int neighbors = 1;
		for (int i = 0; i < houses.length - 1; i++) {
			if (houses[i] != houses[i + 1]) {
				neighbors += 1;
			}
		}
		return neighbors;
	}
}
