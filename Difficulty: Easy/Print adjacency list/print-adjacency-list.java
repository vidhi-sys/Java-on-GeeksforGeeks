// User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
         
         
            List<List<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        return adj;
    }
}