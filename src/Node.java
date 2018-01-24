public class Node {
    public Node L;
    public Node R;
    public String root;

    Node(String n, Node nl, Node nr) {
        root = n;
        L = nl;
        R = nr;
    }

    public String toString(){
        return root;
    }
}
