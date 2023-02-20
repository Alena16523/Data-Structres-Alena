import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        //You are given an array prices where prices[i]
        // is the price of a given stock on the ith day.
        //You want to maximize your profit by choosing a single day
        // to buy one stock and choosing a different day in the future to sell that stock.
        //Return the maximum profit you can achieve from this transaction.
        // If you cannot achieve any profit, return 0.

       //int[] prices ={7,1,5,3,6,4};
        int[] prices ={7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){

        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else if(prices[i]-minPrice>maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
    }

    private static int maxProfit2(int[] prices) {

        int minPrice = Integer.MAX_VALUE, maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            minPrice=Integer.min(minPrice,prices[i]);
            maxProfit=Integer.max(maxProfit,prices[i]-minPrice);
        }
        return maxProfit;
    }


}
