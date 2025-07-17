public class day96 {

      static class Node{
        int data;
        Node right , left;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    
    public static Node insert(Node root , int val){

        if (root  == null ){
            root = new Node(val);
            return root;
        }

        if (root.data  > val) {
            root.left = insert(root.left, val);
        }

        else {
            root.right = insert(root.right, val);
        }
         return root;
    }


    public static void inOrder(Node root){
        if (root == null) {
           return; 
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    

    public static void main(String[] args) {
        int val[] = {5,1,3,4,2,7 };
        Node root = null;


         for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);

         }

         inOrder(root);
    }
}



