//package wenjing.interviewTree;
//
//import java.util.ArrayList;
//
///*
// * �μ�bst��ԭ������һ�����������������������������С����С���ң�
// * ����������㷢���˽����������ֿ��ܣ���������ڵ������㣬����1234567 --- 1235467 ֱ�ӽ�����������Ϳ�����
// * �����1234567---5234167 ����Ҫ�������ǵ�һ��52Υ�����ĵ�һ�� �͵ڶ���42Υ�����ĵڶ���
// * ����Ŀ����룬�ǳ�����
// */
//public class RecoverBST {
//
//	public void solution(BinaryNode<T> root){
//
//		ArrayList<Integer> preNode = new ArrayList<>();
//		ArrayList<Integer> resultNode = new ArrayList<>();
//		preNode.add(null);
//
//		help(root,preNode,resultNode);
//
//		//�ҵ�����������ĵ㣬����
//		if(resultNode.size() != 0){
//			int temp = resultNode.get(0);
//			resultNode.set(0, resultNode.get(1));
//			resultNode.set(1, temp);
//		}
//
//
//	}
//
//	private void help(BinaryNode<T> root, ArrayList<Integer> preNode, ArrayList<Integer> resultNode) {
//		// TODO Auto-generated method stub
//
//		if(root == null){
//			return ;
//		}
//		help(root.leftChild,preNode,resultNode);
//
//		//Υ������
//		if(preNode.get(0)!=null && preNode.get(0)>root.getData()){
//			//����ǵ�һ��Υ���㣬�����п����ǵ�һ����������ĵ�һ����
//			if(resultNode.size()==0){
//				resultNode.add(preNode.get(0));
//				resultNode.add(root.getData());
//			}//������ǵ�һ��Υ���㣬�����ڶ���Υ����ĺ���ڶ���=[=]bg]Ԫ�ؼ���
//			else{
//				resultNode.set(1, root.getData());
//			}
//		}
//		//��֮ǰ�Ľ����Ϊ��ǰ��root bst�Ļ�������
//		preNode.set(0, root.getData());
//		help(root.rightChild,preNode,resultNode);
//
//	}
//
//
//
//}
