package leetcodeFromEasyTm.bit;

import com.sun.javafx.binding.StringFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangw on 2017/9/4.
 */
public class binaryWatch {
    public List<String> readBinaryWatch(int num) {
        ArrayList<String> result = new ArrayList<>();
        if (num==0){
            return result;
        }
        for (int i = 0 ; i < 12;i++){
            for (int j = 0 ; j <60 ; j++){
                if (Integer.bitCount(i)+Integer.bitCount(j) ==num){
                    result.add(String.format("%d:%02d",i,j));
                }
            }
        }
        return result;

    }
}
