package wenjing.interview.cc150.arrayandstrings;
/*
 * 1.4
 */
public class ReplaceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	static char[] getReplace(String inputString){
		//step 1 get the count of output Char Array
		int replaceCount = 0;
		char[] inputChar = inputString.toCharArray();
		
		for(int i = 0; i< inputChar.length;i++){
			
			if(inputChar[i] == ' '){
				replaceCount++;
			}
		}
		
		int outputLength = replaceCount*2+inputChar.length;
		
		//step 2 
		char[] outputChar = new char[outputLength];
		
		
		for(int j = inputChar.length-1;j>=0;j--){
			
			if(inputChar[j] ==' '){
				
				outputChar[outputLength-1] = '0';
				outputChar[outputLength-2]= '2';
				outputChar[outputLength-3] = '%';
				outputLength = outputLength-3;
			}else{
				outputChar[outputLength-1] = inputChar[j];
				outputLength = outputLength-1;
			}
			
		}
		
		return outputChar;
	
		
	}
	
	

}
