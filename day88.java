public class day88 {

    static class Node{
    int data;
    Node left , right;

     public Node(int data){
        this.data =  data;
        this.left = null;
        this.right  = null;
    }
}

public static int height(Node root){
    if (root == null) {
        return 0 ;
    }
    int lh = height(root.left);
    int rh =  height(root.right);

    return Math.max(lh, rh)+1;


   }


   public static int diameter(Node root){
    if (root == null) {
        return 0 ; 
    }

    int leftDaim =  diameter(root.left);
    int leftHt   = height(root.left);
    int rightDaim =  diameter(root.right);
    int rightHt =  height(root.right);

    int selfDaim  = leftHt  + rightHt + 1;
    return Math.max(selfDaim,Math.max(leftDaim, rightDaim));
   }
  
public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
      

        System.out.println(diameter(root));
    }


}
