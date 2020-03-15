/**
 * @author Abhishek Singh
 * last update  9:55 PM 02/03/20
 **/
package graph;

import java.util.*;

public class TopologicalSort {
    static class Graph {
        int vertices;
        List<Integer> adj[];

        Graph(int v) {
            this.vertices = v;
            adj=new ArrayList[vertices];
            for (int i = 0; i < vertices; i++) {
                adj[i] = new ArrayList<Integer>();
            }
        }
        public void addEdge(int u,int v){
            adj[u].add(v);
        }
        public void topologicalSort(){

            int []indegree=new int[vertices];
            for(int i=0;i<vertices;i++){
                ArrayList<Integer> temp= (ArrayList<Integer>)adj[i];
                for(int node:temp){
                    indegree[node]++;
                }
            }


            Queue<Integer> q=new LinkedList<Integer>();
            for(int i=0;i<vertices;i++){
                if(indegree[i]==0){
                    q.add(i);
                }
            }

            int count=0;
            Vector<Integer> topOrder=new Vector<>();
            while(!q.isEmpty()){
                int u=q.poll();
                topOrder.add(u);
                for(int node:adj[u]){
                    if(--indegree[node]==0){
                        q.add(node);
                    }
                }
                count++;
            }
            if(count!=vertices){
                System.out.println("loop");
                return;
            }
            for(int i:topOrder){
                System.out.print(i+" ");
            }

        }
    }
    public static void main(String[] args) {
        //Starts coding
        Graph g=new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        System.out.println("Following is a Topological Sort");
        g.topologicalSort();

    }
}
