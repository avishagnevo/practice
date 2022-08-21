import java.util.Random;
import java.util.Set;

public class Rooted_Tree extends Graphh{
    Node root=null;
    final static int RETURN_TO_PARENT= -1;

    public Rooted_Tree(Node root){
        this.root=root;
    }

    public static void Preorder_print(Node x){

    };
    public static void Inorder_print(Node x){

    };
    public static void Postorder_print(Node x){

    };
    public static int Traverse_To(Node x, Node from){
        int RETURN_TO_PARENT= -1;
        if (from==x.parent){
            if (x.c.size() == 0)
                return RETURN_TO_PARENT;
            return 0;
        }
        for (int i=0; i< x.c.size() ; i++) {
            if (x.c.get(i) == from){
                if (x.c.get(i + 1) == null)
                    return RETURN_TO_PARENT;
                else return i + 1;}
        }
        return RETURN_TO_PARENT;
    }

    public int Find_Diameter(Rooted_Tree T){
        int temp=-1;
//        Set<Node> keySet = T.Adj.dict.keySet();
//        if (!keySet.isEmpty())
//            Node s= random(keySet);
        BFS(T,T.root);
        Node u= Max_Diameter(T);
        BFS(T, u);
        Node v= Max_Diameter(T);
        return v.distance;


    }
}



