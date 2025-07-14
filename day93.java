import java.util.ArrayList;

public class day93 {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Get path from root to node n
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    // LCA using path method
    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        boolean found1 = getPath(root, n1, path1);
        boolean found2 = getPath(root, n2, path2);

        if (!found1 || !found2) {
            return null; 
        }

        int i = 0;
        while (i < path1.size() && i < path2.size()) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
            i++;
        }

        return path1.get(i - 1); 
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5;

        Node ans = lca(root, n1, n2);
        if (ans != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + ans.data);
        } else {
            System.out.println("LCA not found!");
        }
    }
}
