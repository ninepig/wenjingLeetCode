package wenjing.DP;

/**
 * Created by yamengwenjing on 2017-03-07.
 */
public class BestTimeToBuyStockI {
    //暴力法
//    public int maxProfitBruteForce(int[] prices) {

//    }
    //山峰法
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return 0;
        }
        int profit = 0;
        int buyingPrice = prices[0];

        for(int i = 0; i< prices.length;i++){
            if(prices[i]<buyingPrice){
                buyingPrice = prices[i];
            }else {
                profit = (prices[i]-buyingPrice)>profit? prices[i]-buyingPrice:profit;
            }
        }
        return  profit;
    }
}
