package wenjing.LeetCode;

/**
 * Created by yamengwenjing on 2016-11-23.
 *  *
 * /* The guess API is defined in the parent class GuessGame.
 @param num, your guess
 @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
 int guess(int num); */

public class LeetCode374{
        static int guess(int num){
            return 1;
        }
        public int guessNumber(int n) {

            if(n<1){
                return 0;
            }
            int begin =1 ;
            int end = n;
            while(begin+1<end){
                int middle = begin+(end-begin)/2;
                if(guess(middle)==0){
                    return middle;
                }else if(guess(middle)>0){
                    begin = middle;
                }else{
                    end =middle;
                }
            }

            if(0 == guess(begin)){
                return begin;
            }
            if (0 == guess(end)){
                return end;
            }


            return 0;
        }
}
