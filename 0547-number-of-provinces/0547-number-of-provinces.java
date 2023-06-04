class Solution {
    int ans = 0;
    int[][] graph;
    boolean[] visited;
    int n;
    public int findCircleNum(int[][] isConnected) {
        n = isConnected.length;
        graph = isConnected;
        visited = new boolean[n];

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                ans++;
                dfs(graph, i);
            }
        }
        return ans;
    }
    private void dfs(int[][] graph, int node){
        for(int i = 0 ; i < n; i++){
            if(graph[node][i] == 1 && !visited[i]){
                visited[i] = true;
                dfs(graph, i);
            }
        }
    }
}