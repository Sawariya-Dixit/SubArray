
public class day95 {

    static class Node{
        int data;
        Node right , left;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }

    }

        public static int KAncestor(Node root, int n , int k){
            if (root ==null) {
                
                return -1;
            }
            if (root.data == n) {
                return 0;
            }
            int leftDist = KAncestor(root.left, n,k);
            int rightDist = KAncestor(root.right, n, k);


            if (leftDist == -1 && rightDist == -1) {
                return -1;
            }

            int max = Math.max(leftDist, rightDist);
            if (max+1 == k) {
                System.out.println(root.data);
            }

             return max+1;
        }
    
    

    public static void main(String[] args) {
              Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

          
        KAncestor(root, 5, 2);
    }
}
