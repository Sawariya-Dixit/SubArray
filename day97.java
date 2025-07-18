public class day97 {
    

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

    public static  Node delete(Node root , int val){

        if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else if (root.data > val) {
            root.left = delete(root.left, val);
        }

        else{
            //case 1 single child
            if (root.left == null && root.right ==null) {
                return null;
            }

            // case 2 dingle child

            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }

             //3 both children

           Node Is =  findInorderSuccessor(root.right);
               root.data = Is.data;
            root.right  = delete(root.right, Is.data);
        }
        return root;

    }
    
    public static Node findInorderSuccessor(Node root ){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

     public static void inOrder(Node root){
        if (root == null) {
           return; 
        }
        inOrder(root.left);
        System.out.print(root.data+"  ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14 };
        Node root = null;


         for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);

         }
         inOrder(root);
          
         root = delete(root, 1);
         System.out.println();

         inOrder(root);
          

    }
}
