package wenjing.interviewGraph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DefaultGraph implements Graph {

	private static class _Edge implements Edge{

		private static final _Edge NullEdge = new _Edge();
		
		int from;
		int to;
		int weight;
		
		_Edge nextEdge;
		
		private _Edge() {
			// TODO Auto-generated constructor stub
			weight =Integer.MAX_VALUE;
		}
		
		
		_Edge(int from, int to,int weight){
			this.from = from;
			this.to = to;
			this.weight = weight;
			
		}
		
		

		public int getWeight() {
			// TODO Auto-generated method stub
			return weight;
		}
		
		
	}
	/*
	 * ����ֻҪ��ͷ��β�Ϳ����ˡ�
	 */
	private static class _EdgeStaticQueue{
		
		_Edge first;
		_Edge last;
		
	}
	
	private int numVertexes;
	private String[] labels;
	private int numEdges;
	
	
	private _EdgeStaticQueue[] edgeQueues;
	private boolean[] vistTags;
	
	public DefaultGraph(int numberVertexes){
		if(numberVertexes<1){
			throw new IllegalArgumentException();
		}
		this.numVertexes = numberVertexes;
		this.vistTags = new boolean[numberVertexes];
		this.labels = new String[numberVertexes];
		for(int i = 0; i<numberVertexes;i++){
			labels[i] =i+""; 
		}
		this.edgeQueues = new _EdgeStaticQueue[numberVertexes];
		
		for(int i=0; i<numberVertexes;i++){
			
			edgeQueues[i] = new _EdgeStaticQueue();
			edgeQueues[i].first = edgeQueues[i].last = _Edge.NullEdge;
			
			
		}
		
		this.numEdges = 0;
	}
	
	
	
	
	

	public int vertexesNum() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int edgeNum() {
		// TODO Auto-generated method stub
		return numEdges;
	}


	public boolean isEdge(Edge edge) {
		// TODO Auto-generated method stub
		return (edge!=_Edge.NullEdge);
	}


	public void setEdge(int from, int to, int weight) {
		// TODO Auto-generated method stub
		if(from<0||from>=numVertexes|| to<0||to>=numVertexes||weight<0||from==to){
			throw new IllegalArgumentException();
		}
		_Edge edge = new _Edge(from, to, weight);
		edge.nextEdge = _Edge.NullEdge;
		if(edgeQueues[from].first == _Edge.NullEdge)
			edgeQueues[from].first = edge;
		else
			edgeQueues[from].last.nextEdge = edge;
		edgeQueues[from].last =edge;
	}

	
	public Edge firstEdge(int vertex) {
		// TODO Auto-generated method stub
		if(vertex>=numVertexes)
			throw new IllegalArgumentException();
		return edgeQueues[vertex].first;
	}

	@Override
	public Edge nextEdge(Edge edge) {
		// TODO Auto-generated method stub
		return ((_Edge)edge).nextEdge;
	}

	@Override
	public int toVertex(Edge edge) {
		// TODO Auto-generated method stub
		return ((_Edge)edge).to;
	}

	@Override
	public int fromVertext(Edge edge) {
		// TODO Auto-generated method stub
		return ((_Edge)edge).from;
	}

	@Override
	public String getVertexLable(int vertex) {
		// TODO Auto-generated method stub
		return labels[vertex];
	}

	@Override
	public void assignLables(String[] labels) {
		// TODO Auto-generated method stub
		 System.arraycopy(labels, 0, this.labels, 0, labels.length);
	}
	
	/*
	 * ��ĳһ�㿪ʼ�ܼ�����ǰ�ߣ����ܾ��˻ص�ĳһ����û�з��ʵĶ��㣬�������߿��ñ�ָ��ĵ��Ƿ��Ѿ����ʣ����û�з��ʣ���ô�Ӹ�ָ��ĵ����������
	 * ά��һ����־���飬�������¼ĳһ�����Ƿ��Ѿ����ʣ�����Ҳ����ܼ�����ǰ���ʵķ��ʵ㣬�������
	 * 
	 * 
	 */
	@Override
	public void deepFirstTravel(GraphVistor vistors) {
		// TODO Auto-generated method stub

		Arrays.fill(vistTags, false);
		for(int i = 0; i<numVertexes;i++){
			if(!vistTags[i]){
				do_Dfs(i,vistors);
				
			}
									
		}
		
		
		
		
		
	}

	private void do_Dfs(int i, GraphVistor vistors) {
		// TODO Auto-generated method stub
		vistors.visit(this, i);
		vistTags[i] = true;
		
		for(Edge e= firstEdge(i);isEdge(e);e=nextEdge(e)){
			if(!vistTags[toVertex(e)]){
				do_Dfs(toVertex(e), vistors);
			}
			
		}
		
	}


/*����������δ�ÿ��ָ�����㿪ʼ���Զ�����һ��һ��ķ��ʡ���һ�����ж���������˲ż�����һ��ķ��ʡ�
 * �������ҲҪ������һ���������洢�����ʶ���
 * (non-Javadoc)
 * @see wenjing.interviewGraph.Graph#breathFirstTravle(wenjing.interviewGraph.GraphVistor)
 */
	@Override
	public void breathFirstTravle(GraphVistor vistors) {
		// TODO Auto-generated method stub
		Arrays.fill(vistTags, false);
		for(int i = 0 ;i< numVertexes;i++){
			if(!vistTags[i]){
				do_Bfs(i,vistors);
			}			
		}
		
		
	}


private void do_Bfs(int i, GraphVistor vistors) {
	// TODO Auto-generated method stub
	 LinkedList queue = new LinkedList<>();
	 queue.add(i);
	 while(!queue.isEmpty()){
		 int fromV = (int) queue.remove();
		 vistors.visit(this, fromV);
		 vistTags[fromV]=true;
		 for(Edge e = firstEdge(fromV);isEdge(e);e=nextEdge(e)){
			 if(!vistTags[toVertex(e)]){
				 queue.add(toVertex(e));
			 }
		 }
		 
	 }
	
	
}

}
