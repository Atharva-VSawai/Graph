import java.util.*;

public class adjacencyList{
    static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    
    public static void createGraph( ArrayList<Edge> graph[] ){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>(); //Arraylist will create at every indiex location of array beefore this it is ul we cannot directly store into it 
        }

        graph[0].add(new Edge(0, 1, 10));
        
        graph[1].add(new Edge(1, 2, 5));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 0, 6));
        graph[2].add(new Edge(2, 1, 15));
        graph[2].add(new Edge(2, 3, 10));

        graph[3].add(new Edge(3, 1, 4));
        graph[3].add(new Edge(3, 2, 2));
    }
    
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>graph[] = new ArrayList[v];
        createGraph(graph);

        for(int i = 0; i<graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println( e.dest+" "+e.weight );
        }
    }
}

//AdjacencyGraph