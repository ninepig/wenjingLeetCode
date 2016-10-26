package wenjing.interviewGraph;

/*
 * �ڽӱ���Ҫ����һ��˳��洢�Ķ������ÿһ�������ϵıߵ�����
 */
public interface Graph {

		public static interface Edge{
			public int getWeight();
		}
		
		int vertexesNum();
		int edgeNum();
		boolean isEdge(Edge edge);
		void setEdge(int from, int to, int weight);
		Edge firstEdge(int vertex);
		Edge nextEdge(Edge edge);
		int toVertex(Edge edge);
		int fromVertext(Edge edge);
		String getVertexLable(int vertex);
		void assignLables(String[] labels);
		void deepFirstTravel(GraphVistor vistors);
		void breathFirstTravle(GraphVistor vistors);
		
		
	
}
