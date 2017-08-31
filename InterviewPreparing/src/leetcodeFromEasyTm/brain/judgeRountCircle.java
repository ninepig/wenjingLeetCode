package leetcodeFromEasyTm.brain;

/**
 * Created by yangw on 2017/8/30.
 */
public class judgeRountCircle {
    public boolean judgeCircle(String moves) {
        if (moves==null||moves.length()==0){
            return true;
        }
        int x = 0 ,y=0;
        for (int i = 0 ; i < moves.length();i++){

            switch (moves.charAt(i)){
                case 'U':
                    x++;
                    break;
                case 'D':
                    x--;
                    break;
                case 'L':
                    y--;
                    break;
                case 'R':
                    y++;
                    break;
                default:
                    break;
            }
        }

        if(x==0&&y==0){
            return true;
        }
        return false;

    }
}
