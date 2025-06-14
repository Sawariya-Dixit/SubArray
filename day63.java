
    public class day63 {

      public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}


    public static void main(String[] args) {
        
        day63 ll =  new day63();
         ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.printList();
    }
}


