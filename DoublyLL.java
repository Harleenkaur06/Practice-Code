// public class DoublyLL {
//     public static class Node{
//         int data;
//         Node next;
//         Node prev;
//         Node(int data){
//             this.data=data;
//         }
//     }
//     public static void display(Node head){
//         Node t=head;
//         while(t!=null){
//             System.out.print(t.data+" ");
//             t=t.next;
//         }
//         System.out.println();
//     }
//     public static void displayrev(Node tail){
//         Node t=tail;
//         while(t!=null){
//             System.out.print(t.data+" ");
//             t=t.prev;
//         }
//         System.out.println();
//     }
//     public static void displayrandom(Node random){
//         Node t=random;
//         while(t.prev!=null){
//             t=t.prev;
//         }
//         display(t);
//     }
//     public static void main(String[] args) {
//         Node n1=new Node(4);
//         Node n2=new Node(3);
//         Node n3=new Node(1);
//         Node n4=new Node(20);
//         Node n5=new Node(40);
//         n1.next=n2;
//         n2.prev=n1;
//         n2.next=n3;
//         n3.prev=n2;
//         n3.next=n4;
//         n4.prev=n3;
//         n4.next=n5;
//         n5.prev=n4;
//         display(n1);
//         displayrev(n5);
//         displayrandom(n3);
//     }
// }

//inserting in dll
// public class DoublyLL {
//     public static class Node{
//         int data;
//         Node next;
//         Node prev;
//         Node(int data){
//             this.data=data;
//         }
//     }
//     public static class doubly{
//         Node head=null;
//         Node tail=null;
//         void addatlast(int val){
//             Node newnode=new Node(val);
//             if(head==null){
//                 head=tail=newnode;
//             }else{
//                 newnode.prev=tail;
//                 tail.next=newnode;
//                 tail=newnode;
//             }
//         }
    
        
//         void display(){
//             Node t=head;
//             while(t!=null){
//                 System.out.print(t.data+" ");
//                 t=t.next;
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String[] args) {
//         doubly ll=new doubly();
//         ll.addatlast(4);
//         ll.addatlast(3);
//         ll.addatlast(2);
//         ll.addatlast(1);
//         ll.display();;
//     }
// }

//add at first
// public class DoublyLL {
//     public static class Node{
//         int data;
//         Node next;
//         Node prev;
//         Node(int data){
//             this.data=data;
//         }
//     }
//     public static class doubly{
//         Node head=null;
//         Node tail=null;
//         void addatlast(int val){
//             Node newnode=new Node(val);
//             if(head==null){
//                 head=tail=newnode;
//             }else{
//                 newnode.prev=tail;
//                 tail.next=newnode;
//                 tail=newnode;
//             }
//         }
    
//         void addatfirst(int val){
//             Node newnode=new Node(val);
//             if(head==null){
//                 head=tail=newnode;
//             }else{
//                 head.prev=newnode;
//                 newnode.next=head;
//                 head=newnode;

//             }

//         }
//         void display(){
//             Node t=head;
//             while(t!=null){
//                 System.out.print(t.data+" ");
//                 t=t.next;
//             }
//             System.out.println();
//         }
       
//     }
//     public static void main(String[] args) {
//         doubly ll=new doubly();
//         ll.addatlast(4);
//         ll.addatlast(3);
//         ll.addatlast(2);
//         ll.addatlast(1);
//         ll.display();
//         ll.addatfirst(100);
//         ll.display();
       
//     }
// }


//add at any index
// public class DoublyLL {
//     public static class Node{
//         int data;
//         Node next;
//         Node prev;
//         Node(int data){
//             this.data=data;
//         }
//     }
//     public static class doubly{
//         Node head=null;
//         Node tail=null;
//         void addatlast(int val){
//             Node newnode=new Node(val);
//             if(head==null){
//                 head=tail=newnode;
//             }else{
//                 newnode.prev=tail;
//                 tail.next=newnode;
//                 tail=newnode;
//             }
//         }
    
//         void addatfirst(int val){
//             Node newnode=new Node(val);
//             if(head==null){
//                 head=tail=newnode;
//             }else{
//                 head.prev=newnode;
//                 newnode.next=head;
//                 head=newnode;

//             }

//         }
//         void display(){
//             Node t=head;
//             while(t!=null){
//                 System.out.print(t.data+" ");
//                 t=t.next;
//             }
//             System.out.println();
//         }
//         void addatindex(int idx,int val){
//             Node t=head;
//            for(int i=1;i<idx;i++){
//             t=t.next;
//            }
//            Node r=t.next;
//            Node newnode=new Node(val);
//            t.next=newnode;
//            newnode.prev=t;
//            newnode.next=r;
//            r.prev=newnode;

//         }
//     }
//     public static void main(String[] args) {
//         doubly ll=new doubly();
//         ll.addatlast(4);
//         ll.addatlast(3);
//         ll.addatlast(2);
//         ll.addatlast(1);
//         ll.addatfirst(100);
//         ll.display();
//         ll.addatindex(3,400);
//         ll.display();
//     }
// }

//delete at head;
public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static class doubly{
        Node head=null;
        Node tail=null;
        void addatlast(int val){
            Node newnode=new Node(val);
            if(head==null){
                head=tail=newnode;
            }else{
                newnode.prev=tail;
                tail.next=newnode;
                tail=newnode;
            }
        }
    
        void addatfirst(int val){
            Node newnode=new Node(val);
            if(head==null){
                head=tail=newnode;
            }else{
                head.prev=newnode;
                newnode.next=head;
                head=newnode;

            }

        }
        void display(){
            Node t=head;
            while(t!=null){
                System.out.print(t.data+" ");
                t=t.next;
            }
            System.out.println();
        }
        void addatindex(int idx,int val){
            Node t=head;
           for(int i=1;i<idx;i++){
            t=t.next;
           }
           Node r=t.next;
           Node newnode=new Node(val);
           t.next=newnode;
           newnode.prev=t;
           newnode.next=r;
           r.prev=newnode;

        }
        void deleteathead(){
            head=head.next;
            head.prev=null;
        }
        void deleteattail(){
            Node t=head;
            while(t.next!=null){
                t=t.next;
            }
            t=t.prev;
            t.next=null;
        }
    }
    public static void main(String[] args) {
        doubly ll=new doubly();
        ll.addatlast(4);
        ll.addatlast(3);
        ll.addatlast(2);
        ll.addatlast(1);
        ll.addatfirst(100);
        ll.display();
        ll.addatindex(3,400);
        ll.display();
        ll.deleteathead();
        ll.display();
        ll.deleteattail();
        ll.display();
    }
}
