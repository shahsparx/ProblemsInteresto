import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * Created by shahsparx on 20/4/17.
 */
public class BFS {

    private int V; //no of vertices
    private LinkedList<Integer> adj[];  //adj lists

    BFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

        void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    void BFS(int s)
    {
        //Mark all the vertices as not visted by default
        boolean visited[]=new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s]=true;
        queue.add(s);
    }

}
