package secondTime;

/**
 * Created by yamengwenjing on 2017-05-01.
 */
public class baseSeven {

    public String convertToBase7(int num) {

        Boolean ifPositive = true;
        if(num<0){
            ifPositive = false;
        }
        int target = Math.abs(num);
        StringBuffer sb = new StringBuffer();
        while (target!=0){
            int reminder = target%7;
            sb.append(reminder);
            target = target/7;
        }
        if(!ifPositive){
            sb.append("-");
        }
        return sb.reverse().toString();
    }

}
