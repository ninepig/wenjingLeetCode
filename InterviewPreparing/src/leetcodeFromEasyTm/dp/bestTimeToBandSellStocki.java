package leetcodeFromEasyTm.dp;

/**
 * Created by yangw on 2017/9/5.
 */
public class bestTimeToBandSellStocki {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0){
            return 0;
        }
        int max = 0;
        int lowerBuyPrice = prices[0];

        for(int i = 1 ; i < prices.length; i++){
            if(prices[i]<lowerBuyPrice){
                lowerBuyPrice = prices[i];
            }else{
                max = Math.max((prices[i] - lowerBuyPrice),max);
            }
        }
        return max;
    }

}
