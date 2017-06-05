package jiuzhang.permutationTemplate.practise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangw on 2017/6/5.
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

 For example,
 If n = 4 and k = 2, a solution is:

 [
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
 ]
 */
public class combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if(n<=0){
            return result;
        }
        List<Integer> currentList = new ArrayList<>();
        combinationHelper(result,currentList,n,k,1);

        return result;
    }

    private void combinationHelper(List<List<Integer>> result, List<Integer> currentList, int n, int k, int postion) {

        if(currentList.size()==k){
            //必须用newArraylist 的形式做
            result.add(new ArrayList<>(currentList));
        }else {

            for (int i = postion;i<=n;i++){
//                currentList.add(postion);
//                combinationHelper(result,currentList,n,k,postion+1);
                //大哥。肯定是把i加进去啊！从N--N+1的变化是由i决定的啊。。
                currentList.add(i);
                combinationHelper(result,currentList,n,k,i+1);
                currentList.remove(currentList.size()-1);
            }
        }
    }
}
