
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
//  class Queues{
//     public static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//         }
//     }
//     public static class LQueue{
//         Node head=null;
//         Node tail=null;
//         int s=0;
//         void add(int val){
//             Node temp=new Node(val);
//             if(head==null){
//                 head=tail=temp;
//             }else{
//                 tail.next=temp;
//                 tail=temp;
//             }
//             s++;
//         }
//         int peek(){
//             if(s==0) return -1;
//             return head.data;
//         }
//         int remove(){
//             if(s==0) return -1;
//             int top=head.data;
//             head=head.next;
//             s--;
//             return top;
//         }
//         void display(){
//             if(head==null){
//                 System.out.println("queue is empty");
//                 return;
//             }
//             Node temp=head;
//             while(temp!=null){
//                 System.out.print(temp.data+" ");
//                 temp=temp.next;
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String[] args) {
//         LQueue q=new LQueue();
//         q.display();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.display();
//         q.remove();
//         q.remove();
//         q.display();
//         System.out.println(q.peek());
//     }
//  }

 //array implementation of circular queue
//  class  Queues{
//     public static class Aqueue{
//         int f=-1;
//         int r=-1;
//         int s=0;
//         int[] arr=new int[10];
//         void add(int val){
//             if (s == arr.length) {
//                 System.out.println("queue is full");
//                 return;
//             }
//             if(s==0){
//                 f=r=0;
//                 arr[0]=val;
                
//             }
//             else if(r<=arr.length-1){
//                 arr[++r]=val;
//             }else if(r==arr.length-1){
//                 r=0;
//                 arr[r]=val; 
//             }
//             s++;
//         }
//         int remove() throws Exception{
//             if(s==0) {
//                 throw new Exception("queue is empty");
//             }
            
//             else {
//                 int t=arr[f];
//                 if(f==arr.length-1) f=0;
                
//                 else f++;
//                 s--;
//                 return t;
//             }
//         }
//         void display(){
//             if(s==0){
//                 System.out.println("queue is empty");
//                 return;
//             }else if(f<=r){
//                 for(int i=f;i<=r;i++){
//                     System.out.print(arr[i]+" ");
//                 }
//             }else{
//                 for(int i=f;i<=arr.length-1;i++){
//                     System.out.print(arr[i]+" ");
//                 }
//                 for(int i=0;i<=r;i++){
//                     System.out.print(arr[i]+" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String[] args) throws Exception{
//         Aqueue q=new Aqueue();
//         //q.remove();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.display();
//         q.remove();
//          q.remove();
//         q.display();
        


//     }

//  }


//practice ques
//reversing a queue
// import java.util.*;
// class Queues{
//     public static void main(String[] args) {
//         Queue<Integer> q=new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         Stack<Integer> st=new Stack<>();
//         System.out.println(q);
//         while(q.size()>0){
//             st.push(q.poll());
//         }
//         while(st.size()>0){
//             q.add(st.pop());
//         }
//         System.out.println(q);

//     }
// }

//reversing a queue by k elements
// import java.util.*;
// class Queues{
//     public static void main(String[] args) {
//         Queue<Integer> q=new LinkedList<>();
//         Scanner sc=new Scanner(System.in);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         Stack<Integer> st=new Stack<>();
//         int k=sc.nextInt();
//         System.out.println(q);
//         for(int i=1;i<=k;i++){
//             st.push(q.poll());
//         }
//         while(st.size()>0){
//             q.add(st.pop());
//         }
//         int n=q.size();
//         for(int i=0;i<n-k;i++){
//             q.add(q.poll());
//         }
//         System.out.println(q);
//     }
// }

//implement stack using queues

import java.util.*;

class Queues{
    public static class SQueue{
        Queue<Integer> q1=new LinkedList<>();
        void push(int val){
            q1.add(val);
        }
        int peek(){
            for(int i=1;i<=q1.size()-1;i++){
                q1.add(q1.remove());
            }
            int x=q1.peek();
            q1.add(q1.remove());
            return x;
        }
        int pop(){
            for(int i=1;i<=q1.size()-1;i++){
                q1.add(q1.remove());
            }
            int x=q1.poll();
            return x;
        }
        void display(){
            for(int i=0;i<q1.size();i++){
                int x=q1.poll();
                System.out.print(x+" ");
                q1.add(x);
            }
            System.out.println();
        }
         
    }
    public static void main(String[] args) {
        SQueue q=new SQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.display();
        q.pop();
        q.pop();
        q.display();
    }
}