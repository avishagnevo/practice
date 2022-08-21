public class K_Rooted_Tree extends Rooted_Tree{
    protected static int k;

    public K_Rooted_Tree(Node root, int k) {
        super(root);
        this.root= new K_Node(root.value, k, root.parent);
        this.k=k;
    }

    public static void Preorder_print(K_Rooted_Tree T){
        if (T.root==null) //recursion limit
            return;
        System.out.println(T.root.value);
        for (Node child: T.root.c){
            Preorder_print(child);
        }

    };
    public static void Postorder_print(K_Rooted_Tree T){
        K_Node from= null;
        K_Node x= (K_Node) T.root;
        while (x != null ){
            int to = Traverse_To(x, from);
            from = x;
            if (to == RETURN_TO_PARENT){
                System.out.println(x.value);
                x= (K_Node) x.parent;
            }
            else x= (K_Node) x.c.get(to);
        }

    };
    public static void Inorder_print(Node x){

    };
    public static int Traverse_To(K_Node x, K_Node from){
        if (from==x.parent){
            if (x.c.size() == 0)  //x.c.get(0) == null I replaced
                return RETURN_TO_PARENT;
            return 0;
        }
        for (int i=0; i< k-1 ; i++) {
            if (x.c.get(i) == from){
                if (x.c.get(i + 1) == null)
                    return RETURN_TO_PARENT;
                else return i + 1;}
        }
        return RETURN_TO_PARENT;
    }
}

