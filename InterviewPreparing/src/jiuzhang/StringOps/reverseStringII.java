package jiuzhang.StringOps;

/**
 * Created by yangw on 2017/8/28.
 */
public class reverseStringII {
    public String reverseStr(String s, int k) {
            if (s==null||s.length()==0){
                return s;
            }

            char[] arr = s.toCharArray();
            int length = s.length();
            int pos = 0;

            while (pos<length){
                //对于要反转的点，要么是终点，要么是目前的点+k-1
                int lastPos = Math.min(pos+k-1,length-1);
                swap(arr,pos,lastPos);
                pos+=2*k;
            }

            return String.valueOf(arr);

    }

    private void swap(char[] arr, int pos, int lastPos) {
        while (pos<lastPos){
            char temp = arr[pos];
            arr[pos] = arr[lastPos];
            arr[lastPos] = temp;
            pos++;
            lastPos--;
        }
    }
}
