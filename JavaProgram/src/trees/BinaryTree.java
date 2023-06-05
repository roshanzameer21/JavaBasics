package trees;


class Node{
    private int key;
    private Node left;
    private Node right;

    Node(int k){
        key = k;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}


public class BinaryTree {

   public static void main(String[] args){
       Node root = new Node(10);
       root.setLeft(new Node(20));
       root.setRight(new Node(30));
       root.getLeft().setLeft(new Node(40));
   }
}
