package jiuzhang.permutationTemplate;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by yangw on 2017/5/24.
 * Given a list of numbers that may has duplicate numbers, return all possible subsets
 */
public class subsetsII {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] nums) {
        // write your code here

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(nums==null|nums.length==0){
            result.add(new ArrayList<Integer>());
            return result;
        }

        ArrayList<Integer>currentList =  new ArrayList<>();
        Arrays.sort(nums);
        subSetsHelper(result,currentList,nums,0);

        return result;
    }

    private void subSetsHelper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> currentList, int[] nums, int postion) {

        //把当前集合加入
        result.add(new ArrayList<Integer>(currentList));
        //postion是很关键的一点，通过postion 来确定在原集合中子集的位置
        for(int i=postion;i<nums.length;i++){
            //考虑去掉重复的情况，也就是如果当前i不是我们第一位，同时num[i-1] == num[i]，也就是下一位和当前位重复了，比如1,2,2这样的情况，我们就忽略第二个2
            if(i!=postion&&nums[i]==nums[i-1]){
                continue;
            }
            //根据位置加入到currentList之中，也就是现在我们这个集合
            currentList.add(nums[i]);
            //再把这个集合里的子集情况递归的加入结果之中，即12为开头，可能有123，124的情况
            subSetsHelper(result,currentList,nums,i+1);
            // 12结束以后，要把2去掉，考虑13的情况，同理最早是1的情况，再是把1去了考虑2的情况
            currentList.remove(currentList.size()-1);
        }

    }
}
