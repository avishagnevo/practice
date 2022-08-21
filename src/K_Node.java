public class K_Node extends Node{
    private static int k;

    public K_Node(int value, int k, Node parent) {
        super(value, parent);
        this.k=k;
    }

    public void AddChild(int value){
        K_Node child = new K_Node(value, k, this);
        try {
            if (this.c.size() >= this.k)
                throw new Exception();
            this.c.add(child);
        }
        catch (Exception exception){
            System.out.println("Cannot insert more then "+ this.k+ " descendants");
        }
    }

    public static int Calc_Height(K_Node x){
        if (x == null)
            return -1;
        else{
            int max_height = 0;
            int cut_height =0;
            for (Node child: x.c){
                cut_height = Calc_Height((K_Node) child) + 1;
                if (max_height < cut_height)
                    max_height = cut_height;
            }
            x.height = max_height;
        }
        return x.height;
    }
}
