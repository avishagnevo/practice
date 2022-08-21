public class U_Rooted_Tree extends Rooted_Tree {
    final static int CHILD = -2;
    final static int PARENT_SIBLING = -3;
    final static int PARENT = -3;
    final static int SIBLING = -4;


    public U_Rooted_Tree(Node root) {
        super(root);
        this.root = new U_Node(root.value, root.parent);
    }

    public static void Print(U_Rooted_Tree T) {
        int from = PARENT_SIBLING;
        U_Node x = (U_Node) T.root;
        while (x != null) {
            if (from == PARENT_SIBLING) {
                System.out.println(x.value);
                if (x.leftChild != null)
                    x = x.leftChild;
                else {
                    if (x.rightSibling != null)
                        x = x.rightSibling;
                    else {
                        from = CHILD;
                        x = (U_Node) x.parent;
                    }
                }
            } else {
                if (x.rightSibling != null) {
                    from = PARENT_SIBLING;
                    x = x.rightSibling;
                } else x = (U_Node) x.parent;
            }
        }

    }

    public static int Count(U_Node x) {
        if (x == null)
            return 0;
        return Count(x.leftChild) + Count(x.rightSibling) + 1;

    }

    public static int Count_All_Leaves(U_Rooted_Tree T) {
        int from = PARENT_SIBLING;
        U_Node x = (U_Node) T.root;
        int counter = 0;
        boolean all_leaves = true;
        while (x != null) {
            if (from == PARENT_SIBLING) {
                if (x.leftChild != null) {
                    x = x.leftChild;
                    all_leaves = true;
                } else {
                    all_leaves = all_leaves && true;
                    if (x.rightSibling != null)
                        x = x.rightSibling;
                    else {
                        from = CHILD;
                        x = (U_Node) x.parent;

                    }
                }
            } else {
                if (all_leaves)
                    counter++;
                all_leaves = false;
                if (x.rightSibling != null) {
                    from = PARENT_SIBLING;
                    x = x.rightSibling;
                } else x = (U_Node) x.parent;
            }
        }

    return counter;
    }

    public static int Count_All_Depths(U_Rooted_Tree T, int depth){
        int from = PARENT;
        U_Node x = (U_Node) T.root;
        int counter = 0;
        int d = 0;
        while (x != null) {
                if (x.leftChild != null  && from!=CHILD) {
                    x = x.leftChild;
                    from=PARENT;
                    d++;
                }
                else {
                    if (d == depth)
                        counter++;
                    if (x.rightSibling != null) {
                        x = x.rightSibling;
                        from = SIBLING;
                    }
                    else {
                        from = CHILD;
                        x = (U_Node) x.parent;
                        d--;

                    }
                }
            }
        return counter;
        }

    }
