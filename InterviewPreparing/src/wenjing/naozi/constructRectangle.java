package wenjing.naozi;

/**
 * Created by yamengwenjing on 2017-02-22.
 */
/*
For a web developer, it is very important to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:

1. The area of the rectangular web page you designed must equal to the given target area.

2. The width W should not be larger than the length L, which means L >= W.

3. The difference between length L and width W should be as small as possible.
You need to output the length L and the width W of the web page you designed in sequence.
 */
public class constructRectangle {
    /*
    这个题就是动脑子。如何算出两个最接近的长宽高，就应该是开方，然后直到某个值可以整除开方数！ 太巧秒了。
     */
    public int[] constructRectangle(int area) {
        if(area ==0){
            return new int[2];
        }
        int[] result = new int[2];
        int w= 0;
        int l = 0;
        w = (int)Math.sqrt(area);
        while(area%w!=0){
            w--;
        }
        l = area/w;
        result[0] = l;
        result[1]= w;
        return result;
    }

}
