public class day61 {
    
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

     public int search (int key){


         Node temp = head;
         int i = 0 ;

         while (temp != null) {
            
            if (temp.data == key) {
                return i ;
                
            }
            temp  = temp.next;
            i++;
         }
         return -1;
    }

    public static void main(String[] args) {
          day61 ll = new day61();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);

        System.out.println(ll.search(2));
    }
}
