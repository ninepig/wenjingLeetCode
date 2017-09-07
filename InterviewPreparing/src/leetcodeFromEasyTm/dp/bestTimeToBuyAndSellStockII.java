package leetcodeFromEasyTm.dp;

/**
 * Created by yangw on 2017/9/3.
 */
public class bestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return 0;
        }
        int result = 0;

        for (int i= 0 ; i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                result+= prices[i+1]-prices[i];
            }
        }
        return result;
    }
}
