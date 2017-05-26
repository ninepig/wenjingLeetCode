package secondTime;

/**
 * Created by yamengwenjing on 2017-04-26.
 */
public class constructTheRectangleArea {

    public int[] constructRectangle(int area) {

        if(area ==0){
            return new int[]{0,0};
        }
        int[] result = new int[2];
        int w ,l;
        w = (int)Math.sqrt(area);
        while((area%w)!=0){
            w--;
        }
        l =area/w;
        result[0] = l;
        result[1] = w;
        return result;
    }

}
