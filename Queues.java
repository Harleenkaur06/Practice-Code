
// public class Queues {
//     public static void main(String[] args) {
//         Queue<Integer> q=new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         System.out.println(q);//1 2 3 4 5
//         q.remove();
//         System.out.println(q);//2 3 4 5
//         System.out.println(q.element());
//         System.out.println(q.size());
//     }
    
// }


//print all the elemet using queue
// import java.util.*;
// public class Queues {
//     public static void main(String[] args) {
//         Queue<Integer> q=new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         Queue<Integer> temp=new LinkedList<>();
//         while(q.size()>0){
//             System.out.print(q.peek()+" ");
//             temp.add(q.remove());
//         }
//         while(temp.size()>0){
//             q.add(temp.poll());
//         }
//     }
    
// }

//array implementation of queue
// class Queues{
//     public static class AQueue{
//         int[] arr=new int[10];
//         int f=-1;
//         int r=-1;
//         int s=0;
//         void add(int val){
//             if(f==-1){
//                 f=0;
//                 arr[++r]=val;
//             }else{
//                 arr[++r]=val;
//             }
//             s++;
//         }
//         int remove(){
//             if(s==0) return -1;
//             f++;
//             s--;
//             return arr[f-1];
//         }
//         int peek(){
//             if(s==0) return -1;
//             return arr[f];
//         }
//         void display(){
//             if(s==0){
//                 System.out.println("queue is empty");
//             }
//             for(int i=f;i<=r;i++){
//                 System.out.print(arr[i]+" ");
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String[] args) {
//         AQueue q=new AQueue();
//         q.add(5);
//         q.add(3);
//         q.add(1);
//         q.add(8);
//         q.add(9);
//         q.display();
//         q.remove();
//         q.remove();
//         q.display();
//         System.out.println(q.peek());

//     }
// }

//implementing queue using linkedlist
 class Queues{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LQueue{
        Node head=null;
        Node tail=null;
        int s=0;
        void add(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
            s++;
        }
        int peek(){
            if(s==0) return -1;
            return head.data;
        }
        int remove(){
            if(s==0) return -1;
            int top=head.data;
            head=head.next;
            s--;
            return top;
        }
        void display(){
            if(head==null){
                System.out.println("queue is empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        LQueue q=new LQueue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.remove();
        q.display();
        System.out.println(q.peek());

        
    }
 }