public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static boolean isCycle(){//Floyd's Cycle finding Algorithm
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        //Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }
        //Find meet Point
        slow = head;
        Node prev = null;
        
         //if the cycle doesn't point to the head
         if(slow != fast){
            while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
            }
           //remove the cycle
            prev.next = null;
        }
         //cycle points to the head
        else{
           while(fast.next != slow){
               fast = fast.next;
           }
           fast.next = null;
        }
    }
    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        head = new Node(1);
        head.next = new Node(2);
        Node temp = head.next;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1->2->3->2

        System.out.println("Is cycle exists in the LinkedList:"+isCycle());
        removeCycle();
        System.out.println("Is cycle exists in the LinkedList:"+isCycle());
    }
}
