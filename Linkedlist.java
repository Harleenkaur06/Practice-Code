//making nodes and connecting them together
public class Linkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node n1=new Node(5);
        Node n2=new Node(3);
        Node n3=new Node(1);
        Node n4=new Node(4);
        Node n5=new Node(15);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        System.out.println(n1);//address of node n1
        System.out.println(n1.next);//address of node n2
        System.out.println(n1.data);//data of a
        System.out.println(n1.next.data);//data of b
    }
}
