public class day99 {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root, int n1, int n2) {
        if (root == null) return null;
        if (root.data == n1 || root.data == n2) return root;

        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null) return root;

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

  
    public static int lcaDist(Node root, int n) {
        if (root == null) return -1;
        if (root.data == n) return 0;

        int left = lcaDist(root.left, n);
        int right = lcaDist(root.right, n);

        if (left != -1) return left + 1;
        if (right != -1) return right + 1;

        return -1;
    }

  
    public static int minDist(Node root, int n1, int n2) {
        Node lcaNode = lca(root, n1, n2);

        int d1 = lcaDist(lcaNode, n1);
        int d2 = lcaDist(lcaNode, n2);

        return d1 + d2;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);  

        int n1 = 4, n2 = 6;
        System.out.println(minDist(root, n1, n2));  
    }
}
