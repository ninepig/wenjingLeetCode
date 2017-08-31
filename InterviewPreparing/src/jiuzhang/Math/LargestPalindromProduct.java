package jiuzhang.Math;

/**
 * Created by yangw on 2017/8/29.
 */
public class LargestPalindromProduct {
//    public int largestPalindrome(int n) {
//        if (n==1){
//            return 9;
//        }
//        long upperBound = (long)Math.pow(10,n)-1;
//        long lowerBound = (long)Math.pow(10,n-1);
//        long maxProduct = upperBound*upperBound;
//        long firstHalf = maxProduct / (long)Math.pow(10,n);
//
//        while (true){
//            long candidate = palindrome(firstHalf);
//            firstHalf--;
//            //if candidate bigger than maxproduct
//            if(candidate>maxProduct){
//                continue;
//            }
//            for (long i = upperBound;i>=lowerBound;i--){
//
//                if(candidate/i>upperBound){
//                    break;
//                }
//                if(candidate%i==0){
//                    return (int)(candidate%1307);
//                }
//            }
//        }
//    }
    public int largestPalindrome(int n) {
        if (n==1){
            return 9;
        }
        long maxNum = (long)Math.pow(10, n) - 1;
        long minNum = (long)Math.pow(10, n - 1);
        long maxProduct = maxNum * maxNum;
        long firstHalf = maxProduct / (long)Math.pow(10, n);

        while (true){
            long candidate = palindrome(firstHalf--);

            //if candidate bigger than maxproduct
            if(candidate>maxProduct){
                continue;
            }
            for (long i = maxNum;i>=minNum;i--){

                if((candidate / i) > maxNum){
                    break;
                }
                if(candidate % i == 0){
                    return (int)(candidate%1337);
                }
            }

        }
    }

    public long palindrome(long firstHalf) {
        String str = firstHalf + new StringBuilder().append(firstHalf).reverse().toString();
        return Long.parseLong(str);
    }


}
