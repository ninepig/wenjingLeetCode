package jiuzhang.searchgraph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by yangw on 2017/8/17.
 */
public class cloneGraph {
    class UndirectedGraphNode {
        int label;
        ArrayList<UndirectedGraphNode> neighbors;

        UndirectedGraphNode(int x) {
            label = x;
            neighbors = new ArrayList<UndirectedGraphNode>();
        }
    }

    //bfs
//    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
//        if(node==null){
//            return node;
//        }
//        ArrayList<UndirectedGraphNode> nodes = new ArrayList<>();
//        HashMap<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<>();
//
//        //using bfs clone nodes;
//        nodes.add(node);
//        map.put(node,new UndirectedGraphNode(node.label));
//
//        //using bfs and queue put all neighbour and it copy version into hashmaps.
//        int start = 0;
//        while (start<nodes.size()){
//            UndirectedGraphNode head = nodes.get(start);
//            start++;
//            for(int i = 0 ; i<head.neighbors.size();i++){
//                //对于当前点的邻居点，我们全部要放入到map之中，如果第一次放，也就是第一次见到这个点，我们要同时把这个点放入nodes之中
//                //如果已经出现过，就不需要放入到nodes之中
//                UndirectedGraphNode neighbour = head.neighbors.get(i);
//                if(!map.containsKey(neighbour)){
//                    map.put(neighbour,new UndirectedGraphNode(neighbour.label));
//                    nodes.add(neighbour);
//                }
//            }
//        }
//
//        //clone neighbours
//        for(int i=0; i<nodes.size();i++){
//            UndirectedGraphNode newNode  = nodes.get(i);
//            for(int j = 0 ; j<newNode.neighbors.size();j++){
//                newNode.neighbors.add(map.get(nodes.get(i).neighbors.get(j)));
//            }
//        }
//
//        return map.get(node);
//
//
//
//    }

//    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
//        if(node == null){
//            return node;
//        }
//        ArrayList<UndirectedGraphNode> nodeQueue = new ArrayList<>();
//        HashMap<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<>();
//
//        nodeQueue.add(node);
//        map.put(node, new UndirectedGraphNode(node.label));
//
//        //bfs to travel graph and put node into hashmap
//        int index = 0 ;
//
//        while (index<nodeQueue.size()){
//            UndirectedGraphNode thisNode = nodeQueue.get(index);
//            index++;
//            for(int i = 0 ; i < thisNode.neighbors.size();i++){
//                UndirectedGraphNode thisNeibour = thisNode.neighbors.get(i);
//                if(!map.containsKey(thisNeibour)){
//                    map.put(thisNeibour,new UndirectedGraphNode(thisNeibour.label));
//                    nodeQueue.add(thisNeibour);
//                }
//            }
//        }
//        //copy neibours
//        //因为我们要一直使用这个queue，所以要用arraylist，而不用linkedlist，没有出队的操作（不像二叉树）
//        //copy的过程 就是用nodeQueuez之中的node 在我们之前复制的hashmap之中找对应的点
//
//        for(int i = 0 ; i <nodeQueue.size();i++){
//            //先从nodequeue之中取出第i个结点的copy
//            UndirectedGraphNode newNode = map.get(nodeQueue.get(i));
//            for(int j = 0;j<nodeQueue.get(i).neighbors.size();j++){
//                //从map之中找到第i个结点的第j个neighbour结点 添加给newnode的neighbour
//                newNode.neighbors.add(map.get(nodeQueue.get(i).neighbors.get(j)));
//            }
//        }
//        return map.get(node);
//
//
//
//
//    }
public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
        if(node == null){
            return node;
        }

        ArrayList<UndirectedGraphNode> nodeQueue = new ArrayList<>();
        HashMap<UndirectedGraphNode,UndirectedGraphNode> maps = new HashMap<>();

        nodeQueue.add(node);
        maps.put(node,new UndirectedGraphNode(node.label));

        //bfs put all neibours of node into maps;
        int start = 0 ;
        while (start<nodeQueue.size()){
            UndirectedGraphNode thisNode = nodeQueue.get(start);
            start++;

            for(int i = 0 ; i<thisNode.neighbors.size();i++){
                UndirectedGraphNode thisNeighbour = thisNode.neighbors.get(i);
                if(!maps.containsKey(thisNeighbour)){
                    maps.put(thisNeighbour,new UndirectedGraphNode(thisNeighbour.label));
                    nodeQueue.add(thisNeighbour);
                }
            }
        }

        for(int i = 0 ; i < nodeQueue.size();i++){
            UndirectedGraphNode newHead = maps.get(nodeQueue.get(i));
            for(int j = 0 ; j< nodeQueue.get(i).neighbors.size();j++){
                newHead.neighbors.add(maps.get(nodeQueue.get(i).neighbors.get(j)));
            }
        }

        return maps.get(node);

}
}

