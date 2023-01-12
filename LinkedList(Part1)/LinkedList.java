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
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);

        ll.addMiddle(2, 9);

        ll.print();
        System.out.println("The size of the LinkedList is:"+size);

        ll.removeFirst();
        ll.print();
        System.out.println("The size of the LinkedList is:"+size);

        ll.removeLast();
        ll.print();
        System.out.println("The size of the LinkedList is:"+size);

    }
}