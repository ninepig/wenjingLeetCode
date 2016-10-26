package wenjing.interview.cc150.arrayandstrings;
/*
 * 1.3
 */
public class DeterminePermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "abcde" ;
		String b = "dcbaa";
		
		ifPermutionTwoStrings(a,b);
	
		
		
	}				
	
	
	/*
	 * time o(n)
	 *spaceo(1)
	 */
	static boolean ifPermutionTwoStrings(String a, String b) {
		// TODO Auto-generated method stub
		if(a==null||b==null){
			return false;
		}
		if(a.length()!=b.length()){
			return false;
		}
		
		char[] aChar = a.toCharArray();
		char[] bChar = b.toCharArray();
		
		for(int i = 1;i <= a.length();i++){
			if(aChar[i-1] != bChar[a.length()-i]){
				System.out.println("false");

				return false;
			}
			
		}
		System.out.println("true");
		return true;
		
	}

	
	
	
}
