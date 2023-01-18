public class LinkedList{

    public class Node{
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

    public void addFirst(int data){

        //Step-1 --> Create a newNode
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        //Step-2 --> newNode's next = head;
        newNode.next = head;

        //Step-3 --> head = newNode
        head = newNode;
    }

    public void addLast(int data){

        //Step-1 --> Create a newNode
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
        }

        //Step-2 --> tail's next = newNode
        tail.next = newNode;

        //Step-3 --> tail = newNode
        tail = newNode;
    }

    public void addMiddle(int idx, int data){
        //Create a newNode
        Node newNode = new Node(data);
        size++;

        if(idx == 0){
            addFirst(data);
            return;
        }

        Node temp = head;
        int i=0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print(){

        // if(head == null){
        //     System.out.println("Linked List is empty");
        //     return;
        // }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;
        for(int i=0;i<size-2;i++){
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    public int iterativeSearch(int key){
            Node temp = head;
            for(int i=0;i<size;i++){
                if(temp.data == key){
                    return i;
                }
                temp = temp.next;
            }
            return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        else if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    public int recursiveSearch(int key){
       return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthNodeFromEnd(int N){
        //find size of the LinkedList, here we have already findout the size, so we will take sz as size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(N == sz){
            head = head.next;
            return;
        }
        
        int i = 0;
        int iToFind = sz-N;
        Node prev = head;
        while(i < iToFind-1){
            prev = prev.next;
            i++;
        } 
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head; 
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        return mid;
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //find mid
        Node mid = findMid(head);

        //reverse half from mid
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(7);
        ll.addLast(8);

        ll.addMiddle(5, 6);

        ll.print();
        System.out.println("The size of the LinkedList is:"+size);

        ll.removeFirst();
        ll.print();
        System.out.println("The size of the LinkedList is:"+size);

        ll.removeLast();
        ll.print();
        System.out.println("The size of the LinkedList is:"+size);

        System.out.println("The element "+3+" is found in index "+ll.iterativeSearch(3));
        System.out.println("The element "+10+" is found in index "+ll.iterativeSearch(10));

        System.out.println("The element "+3+" is found in index "+ll.recursiveSearch(3));
        System.out.println("The element "+10+" is found in index "+ll.recursiveSearch(10));

        ll.reverse();
        System.out.print("The reverse of the given LinkedList is: ");
        ll.print();

        ll.deleteNthNodeFromEnd(3);
        System.out.println("The LinkedList after deletion of "+3+"th node from the end become:");
        ll.print();

        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.print();

        System.out.println("The given LinkedList is a Palindrome:"+ll.checkPalindrome());
    }
}