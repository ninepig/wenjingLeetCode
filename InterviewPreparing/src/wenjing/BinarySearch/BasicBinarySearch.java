package wenjing.BinarySearch;

/**
 * Created by yamengwenjing on 2016-11-22.
 */
public class BasicBinarySearch {


    public  int binarySearchLoop(int[] nums, int target){

        if(nums == null )
            return -1;
        int beginPosition = 0;
        int MiddlePostion ;
        int EndPostion = nums.length-1;

        while(beginPosition+1<EndPostion){
            MiddlePostion = beginPosition+(EndPostion+beginPosition)/2;
            if(nums[MiddlePostion]>target){
                //对于二分法 +1 或者不加其实都可以的
                // 要减1！
                EndPostion = MiddlePostion-1;
            }else if(nums[MiddlePostion]<target){
                //要加1啊 兄弟
                beginPosition =MiddlePostion+1;
            }else{
                return MiddlePostion;
            }
        }
        return -1;
    }

    public int binarySearchRec(int[] nums,int target, int beginPo, int endPo){

        if (nums==null){
            return -1 ;
        }
        if(beginPo+1<endPo){
            int middlePos = beginPo+(endPo-beginPo)/2;
            if(target == nums[middlePos])
                return middlePos;
            else if(target<nums[middlePos]){
                return  binarySearchRec(nums,target,beginPo,middlePos-1);
            }else{
                return binarySearchRec(nums,target,middlePos+1,endPo);
            }
        }else{
            return -1;
        }

    }

    }


