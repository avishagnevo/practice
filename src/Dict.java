import java.util.ArrayList;
import java.util.Hashtable;

public class Dict {
    Hashtable<Node, ArrayList<Node>> dict;

    public Dict(){
        this.dict= new Hashtable<>();
    }
     public void Add_Term(Node key, ArrayList<Node> value){
        this.dict.put(key, value);
     }

}
