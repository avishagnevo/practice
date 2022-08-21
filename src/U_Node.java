public class U_Node extends Node{
    U_Node lastChild;
    U_Node leftChild;
    U_Node rightSibling;

    public U_Node(int value, Node parent) {
        super(value, parent);
        U_Node lastChild = null;
        U_Node leftChild = null;
        U_Node rightSibling = null;
    }

    public void AddChild(int value){
        U_Node child = new U_Node(value, this);
        if (this.leftChild == null)
            this.leftChild = child;
        else this.lastChild.rightSibling=child;
        this.lastChild = child;
        this.c.add(child);

    }


}
