package jiuzhang.brainTest;

/**
 * Created by yangw on 2017/8/22.
 */
public class judgeCircle {
    public boolean judgeCircle(String moves) {
        if(moves==null||moves.length()==0){
            return true;
        }
        int x = 0;
        int y = 0;

        for(int i = 0 ; i < moves.length();i++){

            switch (moves.charAt(i)){
                case 'U':y+=1;
                        break;
                case 'D':y-=1;
                        break;
                case 'L':x-=1;
                        break;
                case 'R':x+=1;
                        break;
                default:break;
            }
            if(x==0&&y==0){
                return true;
            }
        }
        return false;
    }
}
