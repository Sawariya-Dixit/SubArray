import java.util.*;
public class day72 {
    

    static class Stack{
       
       static  ArrayList<Integer> al =  new ArrayList<>();

       public static boolean isEmpty()
       {

        return al.size() == 0;

       }

        public static void push(int data)

         {

        al.add(data);

         }

       public static int pop(){
        if (isEmpty()) {

            return-1;
        }

        int top = al.get(al.size()-1);
        al.remove(al.size()-1);
        return top;

       }



       public static int peek()

       {
        if (isEmpty()) 
        {
            return-1;
        }
        return al.get(al.size()-1);

       }

    }

    public static void main(String[] args) {
        


         Stack s  = new Stack();
         s.push(1);
         s.push(2);
         s.push(3);

         while (!s.isEmpty()) {
            
            System.out.println(s.peek());
            s.pop();
         }


    }
}
