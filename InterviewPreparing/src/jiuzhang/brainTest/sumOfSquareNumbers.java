package jiuzhang.brainTest;

/**
 * Created by yangw on 2017/8/28.
 */
public class sumOfSquareNumbers {
    // 超时了！
    public boolean judgeSquareSum(int c) {

        if(c==0||c==1||c==2){
            return  true;
        }

        for(int i = 0 ;i<=c/2;i++){
            for(int j = 0;j<=c/2 ;j++){
                if(Math.pow((double) i,2)+Math.pow((double)j,2)==c){
                    return true;
                }if(Math.pow((double) i,2)+Math.pow((double)j,2)>c){
                    break;
                }
            }
        }
        return false;
    }

    public boolean judgeSquareSum2(int c){

        if(c==0||c==1||c==2){
            return true;
        }

        int left = 0 ;
        int right = (int)Math.sqrt(c);
        while (left<=right){
            int sum = left*left+right*right;
            if(sum==c){
                return true;
            }else if(sum>c){
                right--;
            }else {
                left++;
            }
        }
        return false;

    }

}
