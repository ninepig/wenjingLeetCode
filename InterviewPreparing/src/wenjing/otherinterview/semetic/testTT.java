package wenjing.otherinterview.semetic;

import java.util.ArrayList;
import java.util.List;

public class testTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> res=new ArrayList<>();	
		for(int i=0;i<5;i++){
			List<Integer> row=new ArrayList<>();
			for(int j=0;j<2*i;j++){
				row.add(j);
			}
				res.add(row);
		}
		
//		output		
//		java.util.Iterator<List<Integer>> it= res.iterator();
//		for(it:5){
//			System.out.println(res<i>);
	
		
		
	}

}
