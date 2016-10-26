package wenjing.interview.cc150.dataStructrueAndSorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		int length = 100;
		int[] targetArray = new int[length];
		int[] tempArray = new int[length];
		
		mergeSorting(targetArray,tempArray,0,length-1);
		
		
		
	}

	private static void mergeSorting(int[] targetArray, int[] tempArray, int left, int right) {
		// TODO Auto-generated method stub
		if(left<right){
			int middle = (left+right)/2;
			
			mergeSorting(targetArray, tempArray, left, middle);
			mergeSorting(targetArray, tempArray, middle+1, right);
			mergeSortedArray(targetArray,tempArray,left,middle,right);
			
		}
		
		
		
	}

	private static void mergeSortedArray(int[] targetArray, int[] tempArray, int left, int middle, int right) {
		// TODO Auto-generated method stub
		
		int indexTarget = 0;
		int indexTargetRight = middle+1;
		int indexTemp  = 0;
		
		while(indexTarget<middle&&indexTargetRight<right){
			
			if(targetArray[indexTarget]>targetArray[indexTargetRight]){
				
				tempArray[indexTemp++] = targetArray[indexTargetRight++];
				
			}else{
				targetArray[indexTemp++] = targetArray[indexTarget++];
			}
		}
		
		while(indexTarget<=middle){
			tempArray[indexTemp++] = targetArray[indexTarget++];
		}
		while(indexTargetRight<=right){
			tempArray[indexTemp++] = targetArray[indexTargetRight++];
		}
		
		for(int i = 0;i<indexTemp;i++){
			targetArray[left] = tempArray[i];
		}
		
	}



}
