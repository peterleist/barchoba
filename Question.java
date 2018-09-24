
public class Question extends Node{

    private Node lNode;
    private Node rNode;

    //Konstruktor
    public Question(String data){ super(data); }

    //Getter-Setter
    public void SetlNode(Node n){ lNode = n;}
    public void SetrNode(Node n){ rNode = n;}
    public Node GetlNode(){return lNode; }
    public Node GetrNode(){return rNode; }



}