public class day98 {

      static class Node
      {
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

    public static void printRange(Node root , int k1, int k2 ){
        if (root ==null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2 ) {
            printRange(root.left, k1, k2);
            System.out.print(root.data+"  ");
            printRange(root.right, k1, k2);

        }
        else if (root.data < k1) {
            printRange(root.left, k1, k2);
        }
        else
        {
            printRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,10,11,14 };
        Node root = null;

         for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);

         }
         printRange(root, 5, 12);


    }
}





