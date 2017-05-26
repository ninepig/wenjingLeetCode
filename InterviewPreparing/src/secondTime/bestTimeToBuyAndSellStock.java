package secondTime;

/**
 * Created by yamengwenjing on 2017-05-03.
 */
public class bestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        if(prices==null||prices.length==0){
            return 0;
        }

        int buyingNumber = prices[0];
        int profit = 0;
        for(int i = 1; i<prices.length;i++){
            if(prices[i]<buyingNumber){
                buyingNumber = prices[i];
            }else {
                profit = (prices[i]-buyingNumber)>profit?(prices[i]-buyingNumber):profit;
            }
        }

        return profit;
    }
}
