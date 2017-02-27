package wenjing.Leecode.number;

/**
 * Created by yamengwenjing on 2017-02-26.
 */

/*
转换成7进制数的string ，
转换成进制数的原则，就是看取余，然后除以几，一路除下来，取余，最终获得string，这个题目要考虑的是数字的正负问题
 */
public class Base7 {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        boolean negative = false;
        StringBuffer buffer = new StringBuffer();
        if(num<0){
            negative = true;
        }
        while (num!=0){
            buffer.append(Math.abs(num)%7);
            num = num/7;
        }

        if(negative){
            buffer.append('-');
        }

        return  buffer.reverse().toString();


    }


}
