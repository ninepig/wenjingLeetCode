package wenjing.interview.cc150.stackandqueue;

import java.util.Stack;

public class HaniTowerStack {

	public static void main(String args[]) {

		int n = 3;

	}

	public class Tower {
		private Stack<Integer> disk;
		private int index;

		public Tower(int i) {

			disk = new Stack<Integer>();
			this.index = i;
		}

		public int getIndex() {
			return index;
		}

		public void add(int d) throws Exception {
			// stack 中的汉诺塔必须从小到大排列
			if (!disk.isEmpty() && disk.peek() <= d) {
				throw new Exception("wrong place order");
			}
			disk.push(d);
		}
		public void moveTopTo(Tower t) throws Exception{
			int top = disk.pop();
			t.add(top);
			System.out.println("move disk " + top +"from" +getIndex() + "to Tower"+t.getIndex());
		}
		
		public void moveDisks(int n, Tower destinationTower, Tower buffer) throws Exception{
			
			if(n>0){
				moveDisks(n-1, buffer, destinationTower);
				moveTopTo(destinationTower);
				moveDisks(n-1,destinationTower,this);
		
			}
			
		}
		

	}

}
