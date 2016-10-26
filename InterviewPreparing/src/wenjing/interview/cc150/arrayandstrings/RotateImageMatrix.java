package wenjing.interview.cc150.arrayandstrings;

/*1.6

*
*
*/

//TODO
public class RotateImageMatrix {
	
	
	public void rotateMatrix(int[][] matrix, int numberOfLayer){
		
		for(int layer = 0;layer< numberOfLayer/2;layer++){
			int first = layer;
			int last = numberOfLayer -1 - layer;
			for(int i = first;i<last;++i){
				int offset = i - first ;
				
				int top = matrix[first][i];
				
				matrix[first][i] = matrix[last - offset][first];
				
				matrix[last - offset][first] = matrix[last][last - offset];
				
				matrix[last][last-offset] = matrix[i][last];
				
				matrix[i][last] = top;
			}
			
		}
		
		
		
	}
	

}
