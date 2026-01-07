//making nodes and connecting them together
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static void main(String[] args) {
//         Node n1=new Node(5);
//         Node n2=new Node(3);
//         Node n3=new Node(1);
//         Node n4=new Node(4);
//         Node n5=new Node(15);
//         n1.next=n2;
//         n2.next=n3;
//         n3.next=n4;
//         n4.next=n5;
//         System.out.println(n1);//address of node n1
//         System.out.println(n1.next);//address of node n2
//         System.out.println(n1.data);//data of a
//         System.out.println(n1.next.data);//data of b
//     }
// }

//displaying a linked list
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static void display(Node head){
//         while(head!=null){
//             System.out.print(head.data+" ");
//             head=head.next;
//         }
//     }
//     public static void main(String[] args) {
//         Node n1=new Node(5);
//         Node n2=new Node(3);
//         Node n3=new Node(1);
//         Node n4=new Node(4);
//         Node n5=new Node(15);
//         n1.next=n2;
//         n2.next=n3;
//         n3.next=n4;
//         n4.next=n5;
//         display(n1);
        
//     }
// }

//displaying a linked list recursively
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static void display(Node head){
        
//         if(head==null) return;
//         System.out.println(head.data);
//         display(head.next);
        
//     }
//     public static void main(String[] args) {
//         Node n1=new Node(5);
//         Node n2=new Node(3);
//         Node n3=new Node(1);
//         Node n4=new Node(4);
//         Node n5=new Node(15);
//         n1.next=n2;
//         n2.next=n3;
//         n3.next=n4;
//         n4.next=n5;
//         display(n1);
        
//     }
// }

//displaying linked list in reverse order using recursion
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static void display(Node head){
        
//         if(head==null) return;
        
//         display(head.next);
//         System.out.println(head.data);
        
//     }
//     public static void main(String[] args) {
//         Node n1=new Node(5);
//         Node n2=new Node(3);
//         Node n3=new Node(1);
//         Node n4=new Node(4);
//         Node n5=new Node(15);
//         n1.next=n2;
//         n2.next=n3;
//         n3.next=n4;
//         n4.next=n5;
//         display(n1);
        
//     }
// }

//making linked list class and addatend function
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static class LinkedList{
//         Node head=null;
//         Node tail=null;
//         void addatend(int data){
//             Node t=new Node(data);
//             if(head==null){
//                 head=tail=t;
//             }
//             tail.next=t;
//             tail=t;
//         }
    
//     void display(){
//         Node t=head;
//        while(t!=null){
//         System.out.println(t.data);
//         t=t.next;
//        }
        
//     }}
//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         ll.addatend(5);
//         ll.addatend(3);
//         ll.addatend(1);
//         ll.addatend(15);
//         ll.addatend(50);
//         ll.display();

//     }
// }

//making a insert at beginning function
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static class LinkedList{
//         Node head=null;
//         Node tail=null;
//         void addatend(int data){
//             Node t=new Node(data);
//             if(head==null){
//                 head=tail=t;
//             }
//             tail.next=t;
//             tail=t;
//         }
    
//     void display(){
//         Node t=head;
//        while(t!=null){
//         System.out.println(t.data);
//         t=t.next;
//        }   
//     }
//     void insertatstart(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             addatend(data);;
//         }
//         temp.next=head;
//         head=temp;
//     }
// }
//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         ll.addatend(5);
//         ll.addatend(3);
//         ll.addatend(1);
//         ll.addatend(15);
//         ll.addatend(50);
//         ll.display();
//         ll.insertatstart(100);
//         ll.insertatstart(101);
//         ll.insertatstart(102);
//         ll.insertatstart(103);
//         ll.display();
//     }
// }

//making insert at any index method
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static class LinkedList{
//         Node head=null;
//         Node tail=null;
//         int size=0;
//         void addatend(int data){
//             Node t=new Node(data);
//             if(head==null){
//                 head=tail=t;
//             }
//             tail.next=t;
//             tail=t;
//         }
    
//     void display(){
//         Node t=head;
//        while(t!=null){
//         System.out.println(t.data);
//         t=t.next;
//        }   
//     }
//     void insertatstart(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             addatend(data);;
//         }
//         temp.next=head;
//         head=temp;
//     }
//     int size(){
//         Node t=head;
        
//         while(t!=null){
//             size++;
//             t=t.next;
//         }
//         return size;
//     }
//     void insert(int i,int data){
//         if(i==size()){
//             addatend(data);
//             return;
//         }
//         if(i==0){
//             insertatstart(data);
//             return;
//         }
//         Node temp=head;
//         Node t=new Node(data);
//         for(int j=1;i<j;j++){
//             temp=temp.next;
//         }
//         t.next=temp.next;
//         temp.next=t;

//     }
// }
//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         ll.addatend(5);
//         ll.addatend(3);
//         ll.addatend(1);
//         ll.addatend(15);
//         ll.addatend(50);
//         //ll.display();
//         ll.insertatstart(100);
//         ll.insertatstart(101);
//         ll.insertatstart(102);
//         ll.insertatstart(103);
//         //ll.display();
//         ll.insert(2, 20);
//         ll.display();
//     }
// }

//getelement
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static class LinkedList{
//         Node head=null;
//         Node tail=null;
//         int size=0;
//         void addatend(int data){
//             Node t=new Node(data);
//             if(head==null){
//                 head=tail=t;
//             }
//             tail.next=t;
//             tail=t;
//         }
    
//     void display(){
//         Node t=head;
//        while(t!=null){
//         System.out.println(t.data);
//         t=t.next;
//        }   
//     }
//     void insertatstart(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             addatend(data);;
//         }
//         temp.next=head;
//         head=temp;
//     }
//     int size(){
//         Node t=head;
        
//         while(t!=null){
//             size++;
//             t=t.next;
//         }
//         return size;
//     }
//     void getelement(int i){
//         Node t=head;
//         for(int j=1;j<=i;j++){
//             t=t.next;
//         }
//         System.out.println(t.data);
//     }
// }
//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         ll.addatend(5);
//         ll.addatend(3);
//         ll.addatend(1);
//         ll.addatend(15);
//         ll.addatend(50);
//         //ll.display();
//         ll.insertatstart(100);
//         ll.insertatstart(101);
//         ll.insertatstart(102);
//         ll.insertatstart(103);
//         ll.display();
//         ll.getelement(2) ;
//     }
// }


//delete 
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static class LinkedList{
//         Node head=null;
//         Node tail=null;
//         int size=0;
//         void addatend(int data){
//             Node t=new Node(data);
//             if(head==null){
//                 head=tail=t;
//             }
//             tail.next=t;
//             tail=t;
//         }
    
//     void display(){
//         Node t=head;
//        while(t!=null){
//         System.out.println(t.data);
//         t=t.next;
//        }   
//     }
//     void insertatstart(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             addatend(data);;
//         }
//         temp.next=head;
//         head=temp;
//     }
//     int size(){
//         Node t=head;
        
//         while(t!=null){
//             size++;
//             t=t.next;
//         }
//         return size;
//     }
//     void delete(int idx){
//         Node t=head;
//         if(idx==0){
//             head=head.next;
//         }
//         for(int i=1;i<=idx-1;i++){
//             t=t.next;
//         }
//         t.next=t.next.next;
//         tail=t;
//         size--;
//     }
// }
//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         ll.addatend(5);
//         ll.addatend(3);
//         ll.addatend(1);
//         ll.addatend(15);
//         ll.addatend(50);
//         //ll.display();
//         ll.insertatstart(100);
//         ll.insertatstart(101);
//         ll.insertatstart(102);
//         ll.insertatstart(103);
//         ll.delete(2) ;
//         ll.display();

//     }
// }


//practice ques
//deleting a node given the node itself as parameter
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static class LinkedList{
//         Node head=null;
//         Node tail=null;
//         int size=0;
//         void addatend(int data){
//             Node t=new Node(data);
//             if(head==null){
//                 head=tail=t;
//             }
//             tail.next=t;
//             tail=t;
//         }
    
//     void display(){
//         Node t=head;
//        while(t!=null){
//         System.out.println(t.data);
//         t=t.next;
//        }   
//     }
//     void insertatstart(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             addatend(data);;
//         }
//         temp.next=head;
//         head=temp;
//     }
//     int size(){
//         Node t=head;
        
//         while(t!=null){
//             size++;
//             t=t.next;
//         }
//         return size;
//     }
//     void delete(int idx){
//         Node t=head;
//         if(idx==0){
//             head=head.next;
//         }
//         for(int i=1;i<=idx-1;i++){
//             t=t.next;
//         }
//         t.next=t.next.next;
//         tail=t;
//         size--;
//     }
//     void delete(Node val){
//         val.data=val.next.data;
//         val.next=val.next.next;
//     }
// }
//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         ll.addatend(5);
//         ll.addatend(3);
//         ll.addatend(1);
//         ll.addatend(15);
//         ll.addatend(50);
        

//     }
// }

//finding the nth node from the end
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static class LinkedList{
//         Node head=null;
//         Node tail=null;
//         int size=0;
//         void addatend(int data){
//             Node t=new Node(data);
//             if(head==null){
//                 head=tail=t;
//             }
//             tail.next=t;
//             tail=t;
//         }
    
//     void display(){
//         Node t=head;
//        while(t!=null){
//         System.out.println(t.data);
//         t=t.next;
//        }   
//     }
//     void insertatstart(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             addatend(data);;
//         }
//         temp.next=head;
//         head=temp;
//     }
//     int size(){
//         Node t=head;
        
//         while(t!=null){
//             size++;
//             t=t.next;
//         }
//         return size;
//     }
//     Node findingatend(int idx){
//         Node t=head;
//         int m=size()-idx+1;
//         for(int i=1;i<=m;i++){
//             t=t.next;
//         }
//         return t;
//     }
// }
//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         ll.addatend(5);
//         ll.addatend(3);
//         ll.addatend(1);
//         ll.addatend(15);
//         ll.addatend(50);
//         Node t=ll.findingatend(3);
//         System.out.println(t.data);

//     }
// }

//finding the nth node from the end in one traversal
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static class LinkedList{
//         Node head=null;
//         Node tail=null;
//         int size=0;
//         void addatend(int data){
//             Node t=new Node(data);
//             if(head==null){
//                 head=tail=t;
//             }
//             tail.next=t;
//             tail=t;
//         }
    
//     void display(){
//         Node t=head;
//        while(t!=null){
//         System.out.println(t.data);
//         t=t.next;
//        }   
//     }
//     void insertatstart(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             addatend(data);;
//         }
//         temp.next=head;
//         head=temp;
//     }
//     int size(){
//         Node t=head;
        
//         while(t!=null){
//             size++;
//             t=t.next;
//         }
//         return size;
//     }
//     Node findingatend(int idx){
//         Node slow=head;
//         Node fast=head;
//         for(int i=1;i<=idx;i++){
//             fast=fast.next;
//         }
//         while(fast!=null){
//         slow=slow.next;
//         fast=fast.next;}
//         return slow;
//     }
// }
//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         ll.addatend(5);
//         ll.addatend(3);
//         ll.addatend(1);
//         ll.addatend(15);
//         ll.addatend(50);
//         Node t=ll.findingatend(3);
//         System.out.println(t.data);

//     }
// }

//removing nth node from the ed of linked list
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static class LinkedList{
//         Node head=null;
//         Node tail=null;
//         int size=0;
//         void addatend(int data){
//             Node t=new Node(data);
//             if(head==null){
//                 head=tail=t;
//             }
//             tail.next=t;
//             tail=t;
//         }
    
//     void display(){
//         Node t=head;
//        while(t!=null){
//         System.out.println(t.data);
//         t=t.next;
//        }   
//     }
//     void insertatstart(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             addatend(data);;
//         }
//         temp.next=head;
//         head=temp;
//     }
//     int size(){
//         Node t=head;
        
//         while(t!=null){
//             size++;
//             t=t.next;
//         }
//         return size;
//     }
//     Node remove(int idx){
//         Node slow=head;
//         Node fast=head;
//         for(int i=1;i<=idx;i++){
//             fast=fast.next;
//         }
//         if(fast==null){
//             head=head.next;
//             return head;
//         }
//         while(fast.next!=null){
//             slow=slow.next;
//             fast=fast.next;
//         }
//         slow.next=slow.next.next;
//         return head;
//     }
// }
//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         ll.addatend(5);
//         ll.addatend(3);
//         ll.addatend(1);
//         ll.addatend(15);
//         ll.addatend(50);
//         ll.display();
//         ll.remove(5);
//         ll.display();

//     }
// }

//intersection
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static class LinkedList{
//         Node head=null;
//         Node tail=null;
//         int size=0;
//         void addatend(int data){
//             Node t=new Node(data);
//             if(head==null){
//                 head=tail=t;
//             }
//             tail.next=t;
//             tail=t;
//         }
    
//     void display(){
//         Node t=head;
//        while(t!=null){
//         System.out.println(t.data);
//         t=t.next;
//        }   
//     }
//     void insertatstart(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             addatend(data);;
//         }
//         temp.next=head;
//         head=temp;
//     }
//     int size(){
//         Node t=head;
        
//         while(t!=null){
//             size++;
//             t=t.next;
//         }
//         return size;
//     }
//     Node findingatend(int idx){
//         Node t=head;
//         int m=size()-idx+1;
//         for(int i=1;i<=m;i++){
//             t=t.next;
//         }
//         return t;
//     }
// }
//             static Node intersection(Node a,Node b,int sa,int sb){
//                 Node ta=a;
//                 Node tb=b;
//                 if(sa>sb){
//                     int step=sa-sb;
//                     for(int i=1;i<=step;i++){
//                         ta=ta.next;
//                     }
//                 }else{
//                     int step=sb-sa;
//                     for(int i=1;i<=step;i++){
//                         tb=tb.next;
//                     }
//                 }
//                 while(ta.data!=tb.data){
//                     ta=ta.next;
//                     tb=tb.next;
//                 }
//                 return ta;
//             }
//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         LinkedList l2=new LinkedList();
//         ll.addatend(5);
//         ll.addatend(3);
//         ll.addatend(1);
//         ll.addatend(15);
//         ll.addatend(50);
//         l2.addatend(100);
//         l2.addatend(101);
//         l2.addatend(102);
//         l2.addatend(1);
//         l2.addatend(1001);
//         l2.addatend(1000);
//         int sa=ll.size();
//         int sb=l2.size();
//         Node t=intersection(ll.head,l2.head,sa,sb);
//         System.out.println(t.data);
//     }
// }


//finding middle element of linked list
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static class LinkedList{
//         Node head=null;
//         Node tail=null;
//         int size=0;
//         void addatend(int data){
//             Node t=new Node(data);
//             if(head==null){
//                 head=tail=t;
//             }
//             tail.next=t;
//             tail=t;
//         }
    
//     void display(){
//         Node t=head;
//        while(t!=null){
//         System.out.println(t.data);
//         t=t.next;
//        }   
//     }
//     void insertatstart(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             addatend(data);;
//         }
//         temp.next=head;
//         head=temp;
//     }
//     int size(){
//         Node t=head;
        
//         while(t!=null){
//             size++;
//             t=t.next;
//         }
//         return size;
//     }
//     Node middle(Node head){
//         Node slow=head;
//         Node fast=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
//     }
// }

//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         LinkedList l2=new LinkedList();
//         ll.addatend(5);
//         ll.addatend(3);
//         ll.addatend(1);
//         ll.addatend(15);
//         ll.addatend(50);
//         Node t=ll.middle(ll.head);
//         System.out.println(t.data);
//     }
// }


//deleting the middle
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static class LinkedList{
//         Node head=null;
//         Node tail=null;
//         int size=0;
//         void addatend(int data){
//             Node t=new Node(data);
//             if(head==null){
//                 head=tail=t;
//             }
//             tail.next=t;
//             tail=t;
//         }
    
//     void display(){
//         Node t=head;
//        while(t!=null){
//         System.out.println(t.data);
//         t=t.next;
//        }   
//     }
//     void insertatstart(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             addatend(data);;
//         }
//         temp.next=head;
//         head=temp;
//     }
//     int size(){
//         Node t=head;
        
//         while(t!=null){
//             size++;
//             t=t.next;
//         }
//         return size;
//     }
//     Node deltemiddle(Node head){
//         if(head.next==null){
//             return null;
//         }
//         Node slow=head;
//         Node fast=head;
//         while(fast.next.next!=null && fast.next.next.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         slow.next=slow.next.next;
//         return head;
//     }
// }

//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
//         LinkedList l2=new LinkedList();
//         ll.addatend(5);
//         ll.addatend(3);
//         ll.addatend(1);
//         ll.addatend(15);
//         ll.addatend(50);
//         ll.deltemiddle(ll.head);
//         ll.display();
//     }
// }


//cycle in a linked list
// public class Linkedlist {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//         }
//     }
//     public static class LinkedList{
//         Node head=null;
//         Node tail=null;
//         int size=0;
//         void addatend(int data){
//             Node t=new Node(data);
//             if(head==null){
//                 head=tail=t;
//             }
//             tail.next=t;
//             tail=t;
//         }
    
//     void display(){
//         Node t=head;
//        while(t!=null){
//         System.out.println(t.data);
//         t=t.next;
//        }   
//     }
//     void insertatstart(int data){
//         Node temp=new Node(data);
//         if(head==null){
//             addatend(data);;
//         }
//         temp.next=head;
//         head=temp;
//     }
//     int size(){
//         Node t=head;
        
//         while(t!=null){
//             size++;
//             t=t.next;
//         }
//         return size;
//     }
//    boolean cycle(Node head){
//     if(head==null ||head.next==null){
//         return false;
//     }
//     Node slow=head;
//     Node fast=head;
//     while(fast!=null && fast.next!=null){
//         slow=slow.next;
//         fast=fast.next.next;
//         if(fast==slow) return true;
//     }
//     return false;
//    }
// }

//     public static void main(String[] args) {
//         LinkedList ll=new LinkedList();
        
//         ll.addatend(5);
//         ll.addatend(3);
//         ll.addatend(1);
//         ll.addatend(15);
//         ll.addatend(50);
//         ll.display();
//         System.out.println(ll.cycle(ll.head));
//     }
// }


//reverse a linked list and return its new head

