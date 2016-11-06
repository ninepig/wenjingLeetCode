package wenjing.otherinterview.semetic;

public class AllCombo {

	
	 public static void main(String args[]) throws Exception { 
         String[] str = {"a","b","c","d"};
//         permutation(str, 0, 2);��������//���str[0..2]���������з�ʽ
         permutation(str, 0, 3);
	 } 
	
	
	public static void permutation(String[] str, int first,int end) {
        //���str[first..end]���������з�ʽ
        if(first == end) {    //���һ�����з�ʽ
            for(int j=0; j<= end ;j++) {
                System.out.print(str[j]);
            }
            System.out.println();
        }
            
        for(int i = first; i <= end ; i++) {
            swap(str, i, first);
            permutation(str, first+1, end);  //�̶��õ�ǰһλ���������к����
            swap(str, i, first);
        }    
    }
    
    private static void swap(String[] str, int i, int first) {
         String tmp;
         tmp = str[first];
         str[first] = str[i];
         str[i] = tmp;      
    }


 
}
