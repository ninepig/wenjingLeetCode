package leetcodeFromEasyTm.Math;

/**
 * Created by yangw on 2017/9/2.
 */
public class ConstructtheRectangle {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        int closingW = (int)Math.sqrt(area);
        while (area%closingW!=0){
            closingW--;
        }
        int l = area/closingW;
        int w = closingW;

        result[0] = l;
        result[1] = w;

        return result;

    }
}
