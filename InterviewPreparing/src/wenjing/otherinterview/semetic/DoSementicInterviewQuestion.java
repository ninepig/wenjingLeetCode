//package wenjing.otherinterview.semetic;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
///*
// * author :wenjing yang 
// * usage : for interview online test 
// * des: input is an array of letters 
// * output is
// *  Permutation of all kinds of letter
// * and The combinations in the output should be ordered alphabetically
// * 
// * 
// */
//
///*
// * for the one who tests this code
// * i just print the output to the console
// * 
// */
//public class DoSementicInterviewQuestion {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		//restrict 
//		int limitationLengthOfTestInput = 150;
//		int limitationLengthOfSingleString = 8;
//		String targetString;
//
//		
//		int numberOfInputFile = args.length;
//		if(numberOfInputFile >= limitationLengthOfTestInput){
//			System.out.println("out of limitation Length Of Test Input");
//			return ;
//		}
//		
//		for(int i = 1; i<=numberOfInputFile;i++){
//			
//			System.out.println("Case #"+i);
//			targetString = args[i-1];
//			
//			// in order to print out the order alphabetically, i use a function to sort the array
//			targetString = sortTargetString(targetString);
//			
//			if(targetString.length()>=limitationLengthOfSingleString){
//				System.out.println("out of limitation Length Of single Input");
//				return ;
//			}
//
//			Permutation.permute(targetString);
//			
//		}
//
//	}
//
//	private static String sortTargetString(String str) {
//		// TODO Auto-generated method stub
//		Character[] chars = new Character[str.length()];
//		for (int i = 0; i < chars.length; i++)
//		    chars[i] = str.charAt(i);
//
//		// sort the array
//		Arrays.sort(chars, new Comparator<Character>() {
//		    public int compare(Character c1, Character c2) {
//		        int cmp = Character.compare(
//		            Character.toLowerCase(c1.charValue()),
//		            Character.toLowerCase(c2.charValue())
//		        );
//		        if (cmp != 0) return cmp;
//		        return Character.compare(c1.charValue(), c2.charValue());
//		    }
//		});
//
//		// rebuild the string
//		StringBuilder sb = new StringBuilder(chars.length);
//		for (char c : chars) sb.append(c);
//		return str = sb.toString();
//	}
//
//	/*
//	 * author :wenjing yang 
//	 * 
//	 * des: class of permutation
//	 */
//		 static class Permutation {
//			
//		    public static void permute(String str){
//		        int length = str.length();
//		        boolean[] used = new boolean[length];
//		        StringBuffer output = new StringBuffer(length);
//
//		        permutation(str,length,output,used,0);
//
//		    }
//
//		    /* @para
//		    * str: the target sorting string
//		    *length: length of the string 
//		    *output : stringbuffer for output
//		    *used[] :flag if the char used
//		    *position : pointer for char 
//		    *
//		    */ 
//		    static void permutation(String str, int length, StringBuffer output, boolean[] used, int position){
//		        // end of the recursion
//		        if(position == length){
//		            System.out.println(output.toString());
//		            return;
//		        }
//		        else{
//		            for(int i=0;i<length;i++){
//		                // skip already used characters
//		                if(used[i])
//		                    continue;
//		                // add fixed char to output, and mark it as used
//		                output.append(str.charAt(i));
////		                System.out.println(str.charAt(i));
//		                used[i] = true;
//
//		                // permute over remaining characters starting at position+1
//		                // recursion
//		                permutation(str,length,output,used,position+1);
//		                // remove fixed character from output 
////		                System.out.println(output.charAt(output.length()-1));
//		                output.deleteCharAt(output.length()-1);
//		                // unmark tha char
//		                used[i] = false;
//		            }
//		        }
//		    }
//		}
//	
//}
