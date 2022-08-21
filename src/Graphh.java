import java.util.ArrayList;
import java.util.Queue;
import java.util.Set;

public class Graphh{
    protected Set<Node> v; // #vertics
    protected Dict Adj;  //neighbors list
    protected Q q;
    protected int diameter;  // longest shortest path between two vertices

    public Graphh(){
        //this.v.clear();
        this.Adj = new Dict();
        this.q = new Q();
    }
     public void BFS_Initialization(Graphh G, Node s, Q q){
        for(Node v: G.v){
            if (v == s){
                v.color = "grey";
                v.distance=0;
            }
            else {
                v.color = "white";
                v.distance = 0x7fffffff;
            }
            v.parent=null;
        }
        q.Enqueue(s);
     }

     public void BFS(Graphh G, Node s){
        BFS_Initialization(G,s,G.q);
        while (G.q.Not_Empty()){
            Node u = G.q.Dequeue();
            for (Node v : G.Adj.dict.get(u)){  // change to Adg itself is a dictionary, not having a dictionary
                if (v.color.equals("white")){
                    v.color="grey";
                    v.distance = u.distance +1;
                    v.parent = u;
                    G.q.Enqueue(v);
                }
            }
            u.color= "black";
        }
     }

     public Node Max_Diameter(Graphh G){
        int max=-1;
        Node argmax=null;
        for ( Node v : G.Adj.dict.keySet()){
            if(v.color.equals("black")){
                if(v.distance> max) {
                    max = v.distance;
                    argmax=v;

                }
            }
        }
        return argmax;
     }

}


