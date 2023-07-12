class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List <Integer> res = new ArrayList<>();
        if(graph == null || graph.length==0) return res;
        int nodecount = graph.length;
        int [] col = new int[nodecount];
        for(int i = 0 ; i < nodecount ; i++){
            if(dfs(graph,i,col)) res.add(i);
        }
        return res;
    }
    public boolean dfs(int [][] graph, int start, int [] col){
        if(col[start]!=0) return col[start]==1;
        col[start]=2;
        for(int n : graph[start]){
            if(!dfs(graph,n,col)) return false;
        }
        col[start]=1;
        return true;
    }
}