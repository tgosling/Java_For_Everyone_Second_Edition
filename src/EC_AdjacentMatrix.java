public class EC_AdjacentMatrix {
    public static boolean adjacent(int[][] graph, int node1, int node2){
        if(graph[node1][node2] != 0)
            return true;
        else
            return false;
    }
}
