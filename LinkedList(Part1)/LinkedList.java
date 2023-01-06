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

    public void addFirst(int data){

        //Step-1 --> Create a newNode
        Node newNode = new Node(data);

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

        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);

        ll.addMiddle(2, 9);

        ll.print();
    }
}