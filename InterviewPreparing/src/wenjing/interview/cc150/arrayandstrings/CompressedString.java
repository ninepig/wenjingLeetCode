package wenjing.interview.cc150.arrayandstrings;

public class CompressedString {

	
	
	public static void main(String[] args){
		
		String inputString = "aaaaddd";
		
		String outPutString = compressedString(inputString);
						
		System.out.println(outPutString);
		
	}

	private static String compressedString(String inputString) {
		// TODO Auto-generated method stub
		char[] inputStringArray = inputString.toCharArray();
		StringBuffer outputStringBuffer = new StringBuffer();
		char storedChar;
		int repeatedNumber;
		
		for(int i = 0 ; i< inputString.length()-1;i++){
			
			storedChar = inputStringArray[i];
			repeatedNumber = 1;
			while(storedChar==inputStringArray[i+1]){
				
				repeatedNumber++;
				i++;	
				if(i==inputString.length()-1){
					break;
				}
			}
			outputStringBuffer.append(storedChar);
			outputStringBuffer.append(repeatedNumber);
			
		}
		return outputStringBuffer.toString();
	}
	
	
}
