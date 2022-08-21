import java.util.ArrayList;

public class Q {
    public Node head;
    public Node tail;
    public ArrayList<Node> q;
    public int size;

    public Q(){
        this.head = null;
        this.tail = null;
        this.q = new ArrayList<Node>();
        this.size=0;
    }

    public Node Dequeue() {
        Node temp= null;
        if (this.size == 1){
            temp = this.head;
            this.head = null;
            this.tail = null;
            this.q.remove(0);
            this.size=0;
        }
        if (this.size > 1){
            temp = this.head;
            this.head = this.q.get(1);
            this.q.remove(0);
            this.size = this.size -1 ;
        }
        return temp;
    }


    public void Enqueue(Node node){
        if (this.size == 0)
            this.head = node;
        this.tail = node;
        this.q.add(node);
    }

    public boolean Not_Empty(){
        return (this.size!=0);
    }



}
