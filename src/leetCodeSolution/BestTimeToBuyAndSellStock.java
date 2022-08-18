package leetCodeSolution;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = { 1,2,4,3 };
		maxProfit(prices);
	}

	public static int maxProfit(int[] prices) {
		int buy = Integer.MAX_VALUE;
		int sell = 0;
		for (int i = 0; i < prices.length; i++) {
			buy = Math.min(buy, prices[i]);
			sell = Math.max(sell, prices[i] - buy);
			System.out.println("sell "+sell+" buy "+buy);
		}
		
		return sell;
	}

}
