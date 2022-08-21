import java.util.ArrayList;

public class Node {
    protected int value;
    protected Node parent;
    protected ArrayList<Node> c;
    protected int height;
    protected String color;
    protected int distance;

    public Node(int value, Node parent){
        this.value=value;
        this.parent=parent;
        this.c = new ArrayList<Node>();
        for (Node node : c){
            node=null;
        this.color= "white";
        this.distance= 0x7fffffff;  // initialize to max integer possible
        }
    }

    public void AddChild(int value){
        Node child = new Node(value, this);
        this.c.add(child);
    }
}
