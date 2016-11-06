package wenjing.otherinterview.semetic;


/*
 * author :wenjing yang 
 * 
 * des: class of permutation
 */
	public class Permutation {
		
		/*
		 * test
		 */
		 public static void main(String args[]) throws Exception { 
			 permute("mpz");
		 } 
		
		 
	    public static void permute(String str){
	        int length = str.length();
	        boolean[] used = new boolean[length];
	        StringBuffer output = new StringBuffer(length);

	        permutation(str,length,output,used,0);

	    }

	    /* @para
	    * str: the target sorting string
	    *length: length of the string 
	    *output : stringbuffer for output
	    *used[] :flag if the char used
	    *position : pointer for char 
	    *
	    */ 
	    static void permutation(String str, int length, StringBuffer output, boolean[] used, int position){
	        // end of the recursion
	        if(position == length){
	            System.out.println(output.toString());
	            return;
	        }
	        else{
	            for(int i=0;i<length;i++){
	                // skip already used characters
	                if(used[i])
	                    continue;
	                // add fixed char to output, and mark it as used
	                output.append(str.charAt(i));
//	                System.out.println(str.charAt(i));
	                used[i] = true;

	                // permute over remaining characters starting at position+1
	                // recursion
	                permutation(str,length,output,used,position+1);
	                // remove fixed character from output 
//	                System.out.println(output.charAt(output.length()-1));
	                output.deleteCharAt(output.length()-1);
	                // unmark tha char
	                used[i] = false;
	            }
	        }
	    }
	}


