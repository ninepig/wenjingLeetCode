package wenjing.interview.cc150.dataStructrueAndSorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] targetArray = new int[100];
		
		QuickSortingMethod(targetArray,0,targetArray.length);
		
		
	}

	private static void QuickSortingMethod(int[] targetArray, int i, int length) {
		// TODO Auto-generated method stub
		
		int pivot = getPivot(targetArray,i,length);
		QuickSortingMethod(targetArray, i, pivot);
		QuickSortingMethod(targetArray, pivot+1, length);
		
	}

	private static int getPivot(int[] targetArray, int low, int high) {
		// TODO Auto-generated method stub
		
		int pivot = targetArray[low];
		
		while(low<high){
			
			while(low<high&&targetArray[high]>pivot){
				high--;
			}
			swap(targetArray,low,high);
			
			while(low<high&&targetArray[low]<pivot){
				low++;
			}
			swap(targetArray,high,low);
			
		}
		targetArray[low] = pivot;
		 
		return low;
	}

	private static void swap(int[] targetArray, int low, int high) {
		// TODO Auto-generated method stub
		//switch low and high 
	}

}
