import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public boolean dfs(int[][] graph, boolean[] vis, boolean[] rec, int curr, boolean[] present){
        
        vis[curr] = true;
        rec[curr] = true;
        
        for(int next : graph[curr]){
            if(rec[next]){
                return present[curr] = true;
            }
            else if(!vis[next]){
                if(dfs(graph, vis, rec, next, present)){
                    return present[curr] = true;
                }
            }
        }
        
        rec[curr] = false;
        return false;
        
        
        
        
    }
    
    
    
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        List<Integer> l = new ArrayList<>();
        boolean vis[] = new boolean[graph.length];
        boolean rec[] = new boolean[graph.length];
        boolean present[] = new boolean[graph.length];
        
        for(int i =0; i<graph.length; i++){
            if(!vis[i]){
                dfs(graph, vis, rec, i, present);
            }
            
        }
        
        for(int i =0; i<graph.length; i++){
            if(!present[i]){
                l.add(i);
            }
        }
        
        return l;
        
    }
}