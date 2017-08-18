package jiuzhang.searchgraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by yangw on 2017/8/18.
 */
public class topoLogicalSorting {
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {

        ArrayList<DirectedGraphNode> result = new ArrayList<>();

        HashMap<DirectedGraphNode,Integer> degreeMaps = new HashMap<>();

        // make a degree map with key is node ,value is indegree value
        for(DirectedGraphNode thisNode : graph){
            for (DirectedGraphNode neighbour: thisNode.neighbors){
                if(degreeMaps.containsKey(neighbour)){
                    degreeMaps.put(neighbour,degreeMaps.get(neighbour)+1);
                }else {
                    degreeMaps.put(neighbour,1);
                }
            }
        }
        // put all node with 0 indegree in to a  queue;
        Queue<DirectedGraphNode> nodeQueue = new LinkedList<>();
        for(DirectedGraphNode node: graph){
            if(!degreeMaps.containsKey(node)){
                //如果maps之中没有原来的结点，则说明这个点的入度为0，那他就可以直接加入topo的sorting result之中
                //同时把入度为0的结点放入queue之中
                nodeQueue.offer(node);
                result.add(node);
            }
        }
        //queue维护的是放入result的，排序拍好的拓扑结点
        //遍历queue，不断地搜索node，poll原结点 如果他入度的结点减1以后为0 ，则说明他是后续的排列，不断类推，直到完成循环
        while (!nodeQueue.isEmpty()){

            DirectedGraphNode thisNode = nodeQueue.poll();
            for (DirectedGraphNode neighbour : thisNode.neighbors){
                degreeMaps.put(neighbour,degreeMaps.get(neighbour)-1);
                if(degreeMaps.get(neighbour)==0){
                    result.add(neighbour);
                    nodeQueue.offer(neighbour);
                }
            }
        }
        return result;
    }

//      Definition for Directed graph.
      class DirectedGraphNode {
          int label;
          ArrayList<DirectedGraphNode> neighbors;
          DirectedGraphNode(int x) { label = x; neighbors = new ArrayList<DirectedGraphNode>(); }
      }


}
