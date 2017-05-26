package secondTime;

/**
 * Created by yamengwenjing on 2017-04-19.
 *461The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

 Given two integers x and y, calculate the Hamming distance.
 */
public class hammingDistance {

    /**
     * 直接让两个数求异或，可以得出全部不相同的值，（1）
     * i肯定是<=31 或者是<32,因为i=0的时候是不做操作的，所以最多移动31位 不会超过32（2）
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        int counter = 0;
        int target = x ^ y;
        for(int i = 0; i <=31;i++){
            counter+=(target>>i)&1;
        }

        return counter;
    }

    public int hammingDistanceMyDw(int x, int y) {
        int counter = 0;
        for(int i =0;i<=31;i++){
            if((((x>>i)^(y>>i))&1)==1){
                counter++;
            }
        }
        return counter;
    }
}
