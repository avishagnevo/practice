
public class Main {

    public static void main(String[] args) {
//        int k=2;
//        K_Node root= new K_Node(7,k, null);
//        K_Rooted_Tree TK= new K_Rooted_Tree(root, k);
//        TK.root.AddChild(1);
//        TK.root.AddChild(20);
//        TK.root.c.get(0).AddChild(4);
//        TK.root.c.get(0).AddChild(9);
        //TK.root.c.get(0).AddChild(9); //this will throw an Exception

        //K_Rooted_Tree.Preorder_print(TK.root); working
        //K_Rooted_Tree.Postorder_print(TK); working
        //System.out.println(K_Node.Calc_Height((K_Node) TK.root)); // working

        U_Node root= new U_Node(7, null);
        U_Rooted_Tree TU= new U_Rooted_Tree(root);
        TU.root.AddChild(1);
        TU.root.AddChild(20);
        TU.root.c.get(0).AddChild(4);
        TU.root.c.get(0).AddChild(9);
        TU.root.c.get(1).AddChild(4);
        TU.root.c.get(1).AddChild(9);
        TU.root.c.get(1).c.get(1).AddChild(9);
        TU.root.c.get(1).c.get(0).AddChild(9);

        //U_Rooted_Tree.Print(TU); working
        //System.out.println(U_Rooted_Tree.Count((U_Node) TU.root)); working
        //ֿֿֿSystem.out.println(U_Rooted_Tree.Count_All_Leaves(TU));
        //System.out.println(U_Rooted_Tree.Count_All_Depths(TU, 3)); working
    }


}