public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node t=head;
        while(t!=null){
            System.out.println(t.data);
            t=t.next;
        }
    }
    public static void display2(Node tail){
        Node t=tail;
        while(t!=null){
            System.out.println(t.data);
            t=t.prev;
        }
    }
    public static void main(String[] args) {
        Node n1=new Node(4);
        Node n2=new Node(3);
        Node n3=new Node(1);
        Node n4=new Node(20);
        Node n5=new Node(40);
        n1.next=n2;
        n2.prev=n1;
        n2.next=n3;
        n3.prev=n2;
        n3.next=n4;
        n4.prev=n3;
        n4.next=n5;
        n5.prev=n4;
        display(n1);
        display2(n5);
    }
}
