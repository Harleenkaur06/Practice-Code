
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<>();
//         st.size();
//         System.out.println(st.size());//0
//         st.push(5);
//         st.push(3);
//         st.push(18);
//         st.push(9);
//         st.push(100);
//         System.out.println(st.size());//5
//         System.out.println(st);
//         st.pop();
//         st.pop();//100 and 9 removed
//         System.out.println(st.size());//3
//         System.out.println(st);//5 3 18     
    
// }
// }
 
//copy a stack
// public class Stackk {
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<>();
//         st.push(5);
//         st.push(3);
//         st.push(18);
//         st.push(9);
//         st.push(100);
//         System.out.println(st);
//         Stack<Integer> temp =new Stack<>();
//         while(st.size()>0){
//             temp.push(st.pop());
//         }
//         System.out.println(temp);//reversed stack
//         Stack <Integer> st2 =new Stack<>();
//         while(temp.size()>0){
//             st2.push(temp.pop());
//         }
//         System.out.println(st2);//copied
// }
// }


//printing all the elements through function
// import java.util.*;
// public class Stackk{
//     public static void display(Stack st){
//         while(st.size()>0){
//             System.out.println(st.pop());
//         }
//     }
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<>();
//         st.push(5);
//         st.push(3);
//         st.push(10);
//         st.push(90);
//         st.push(100);
//         display(st);



//     }
// }

//printing by making another stack bottom to top
// import java.util.*;
// public class Stackk{
    
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<>();
//         st.push(5);
//         st.push(3);
//         st.push(10);
//         st.push(90);
//         st.push(100);
//         Stack<Integer> temp=new Stack<>();
//         while(st.size()>0){
//             temp.push(st.pop());
//         }
//         while(temp.size()>0){
//             int x=temp.pop();
//             System.out.println(x);
//             st.push(x);
//         }

//     }
// }

//printing through array from bottom to top
// import java.util.*;
// public class Stackk{
    
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<>();
//         st.push(5);
//         st.push(3);
//         st.push(10);
//         st.push(90);
//         st.push(100);
//         int n=st.size();
//         int[] arr=new int[n];
//         for(int i=n-1;i>=0;i--){
//             arr[i]=st.pop();
//         }
//         for(int i=0;i<n;i++){
//             System.out.println(arr[i]);
//             st.push(arr[i]);
//         }
//     }
// }

//printing recursively from top to bottom
// import java.util.*;
// public class Stackk{
//     public static void display(Stack<Integer> st){
//         if(st.size()==0) return;
//         int top=st.pop();
//         System.out.println(top);
//         display(st);
//         st.push(top);

//     }
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<>();
//         st.push(5);
//         st.push(3);
//         st.push(10);
//         st.push(90);
//         st.push(100);
//         display(st);
        
        
//     }
// }


//recursive from bottom to top
// import java.util.*;
// public class Stackk{
//     public static void display(Stack<Integer> st){
//         if(st.size()==0) return;
//         int top=st.pop();
//         display(st);
//         System.out.println(top);
//         st.push(top);

//     }
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<>();
//         st.push(5);
//         st.push(3);
//         st.push(10);
//         st.push(90);
//         st.push(100);
//         display(st);
            
//     }
// }

//reverse a stack
// import java.util.*;
// public class Stackk{
   
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<>();
//         st.push(5);
//         st.push(3);
//         st.push(10);
//         st.push(90);
//         st.push(100);
//         System.out.println(st);
//         Stack<Integer> temp=new Stack<>();
//         while(st.size()>0){
//             temp.push(st.pop());
//         }
//         System.out.println(temp);
//         Stack<Integer> st2=new Stack<>();
//         while(temp.size()>0){
//             st2.push(temp.pop());
//         }
//         System.out.println(st2);
//         while(st2.size()>0){
//             st.push(st2.pop());
//         }
//         System.out.println(st);
//     }
// }

//reversing a stack recursively
// import java.util.*;
// public class Stackk{
//     public static void pushatbottom(int x,Stack<Integer>st){
//         Stack<Integer> temp=new Stack<>();
//         while(st.size()>0){
//             temp.push(st.pop());
//         }
//         st.push(x);
//         while(temp.size()>0){
//             st.push(temp.pop());
//         }

//     }
//     public static void reversestack(Stack<Integer> st){
//         if(st.size()==1) return ;
//         int top=st.pop();
//         reversestack(st);
//         pushatbottom(top,st);

//     }
   
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<>();
//         st.push(5);
//         st.push(3);
//         st.push(10);
//         st.push(90);
//         st.push(100);
//         System.out.println(st);
//         reversestack(st);
//         System.out.println(st);
//     }
// }

//insert at bottom;
// import  java.util.*;
// class Stackk{
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<>();
//         Scanner sc=new Scanner(System.in);
//         st.push(5);
//         st.push(23);
//         st.push(90);
//         st.push(80);
       
//         System.out.println(st);
//         Stack<Integer> temp=new Stack<>();
//         while(st.size()!=0){
//             temp.push(st.pop());
//         }
//         System.out.println(temp);
//         int n=sc.nextInt();
//         st.push(n);
        
//         while(temp.size()!=0){
//             st.push(temp.pop());
//         }
//         System.out.println(st);
//     }
// }

//insert at any index
// import  java.util.*;
// class Stackk{
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<>();
//         Scanner sc=new Scanner(System.in);
//         st.push(5);
//         st.push(23);
//         st.push(90);
//         st.push(80);
       
//         System.out.println(st);
//         Stack<Integer> temp=new Stack<>();
//         int idx=sc.nextInt();
//         int n=sc.nextInt();
//         while(st.size()>idx){
//             temp.push(st.pop());
//         }
        
//         st.push(n);

//         //st.push(n);
        
//         while(temp.size()!=0){
//             st.push(temp.pop());
//         }
//         System.out.println(st);
//     }
// }

//reversing a stack using a extra stack
// import  java.util.*;
// class Stackk{
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<>();
//         Scanner sc=new Scanner(System.in);
//         st.push(5);
//         st.push(23);
//         st.push(90);
//         st.push(80);
       
//         System.out.println(st);
//         Stack<Integer> temp=new Stack<>();
//         while(st.size()>0){
//             temp.push(st.pop());
//         }
//         System.out.println(temp);
//         Stack<Integer> st2=new Stack<>();
//         while(temp.size()>0){
//             st2.push(temp.pop());
//         }
//         System.out.println(st2);
//         while(st2.size()>0){
//             st.push(st2.pop());
//         }
//         System.out.println(st);
//     }
// }

//push at bottom recursively
// import  java.util.*;
// class Stackk{
//     public static void pushatbottom(int x,Stack<Integer> st){
//         if(st.size()==0){
//             st.push(x);
//             return ;
//         }
//         int top=st.pop();
//         pushatbottom(x, st);
//         st.push(top);

//     }
//     public static void main(String[] args) {
//         Stack<Integer> st=new Stack<>();
//         Scanner sc=new Scanner(System.in);
//         st.push(5);
//         st.push(23);
//         st.push(90);
//         st.push(80);
//         int x=sc.nextInt();
//         pushatbottom(x,st);
//         System.out.println(st);
        
//     }
// }

//  implementing stack using array
//   class Stackk{
//     public static class Stack{
//         int arr[]=new int[10];
//         int idx=0;
//         void push(int x){
//             if(isFull()){
//                 System.out.println("stack is full");
//                 return;
//             }
//             arr[idx]=x;
//             idx++;
//         }
//         int peek(){
//             if(idx==0) return -1;
//             return arr[idx-1];
//         }
//         int pop(){
//             if(idx==0) return -1;
//             int top=arr[idx-1];
//             arr[idx-1]=0;
//             idx--;
//             return top;
//         }
//         void display(){
//             for(int i=0;i<=idx-1;i++){
//                 System.out.print(arr[i]+" ");
//             }
//             System.out.println();
//         }
//         int size(){
//             return idx;
//         }
//         boolean isEmpty(){
//             if(idx==0) return true;
//             return false;
//         } 
//         boolean isFull(){
//             if(idx==size()) return true;
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         Stack st=new Stack();
//         st.push(1);
//         st.push(2);
//         st.push(3);
//         st.push(4);
//         st.push(5);
//         st.display();//1 2 3 4 5 bottom to top
//         System.out.println(st.size());
//         st.pop();
//         st.pop();
//         st.peek();
//         st.display();//1 2 3 
//         System.out.println(st.size());

//     }
//   }


//implementing stack using linked list
// class Stackk{
//     public static class Node{
//         int data;
//         Node next;
//          Node(int data){
//             this.data=data;
//         }
//     }
//     public static class Stack{
//         private Node head=null;
//         private int size=0;
//         void push(int x){
//             Node temp=new Node(x);
//             temp.next=head;
//             head=temp;
//             size++;
//         }
//         int pop(){
//             if(head==null){ 
//                 System.out.println("Stack is empty");
//                 return -1;
//             }
//             int top=head.data;
//             head=head.next;
//             size--;
//             return top;
//         }
//         int peek(){
//             if(head==null){ 
//                 System.out.println("Stack is empty");
//                 return -1;
//             }
//             return head.data;
//         }
//         void displayreverse(){
//             Node temp=head;
//             while(temp!=null){
//                 System.out.print(temp.data+" ");
//                 temp=temp.next;
//             }
//             System.out.println();
//         }
//         void displayrecursively(Node h){
            
//             if(h==null) return ;
//             displayrecursively(h.next);
//             System.out.print(h.data+" ");

//         }
//         void display(){
//             displayrecursively(head);
//             System.out.println();
//         }
//         int size(){
//             return size;
//         }
//         boolean isEmpty(){
//             if(size==0) return true;
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         Stack ll=new Stack();
//         ll.push(10);  
//         ll.push(20);
//         ll.push(30);
//         ll.push(40);
//         ll.push(50);
//         System.out.println(ll.size());
//         ll.display();// 10 20 30 40 50
//         ll.pop();
//         ll.pop();
//         System.out.println(ll.size());
//         System.out.println(ll.peek());//30 
//         ll.display();//10 20 30 

//     }
// }


//practice questionsss

//check whether a give bracket sequence is balanced or not

// import java.util.*;
// class Stackk{
//     public static boolean balance(String s){
//         Stack<Character> st=new Stack<>();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch=='('){
//                 st.push(ch);
//             }else{
//                 if(st.size()==0) return false;
//                 if(st.peek()=='(') {
//                     st.pop();
//                 }
//             }
//         }
//         if(st.size()>0) return false;
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         boolean t=balance(str);
//         if(t){
//             System.out.println("balanced");
//         }else{
//             System.out.println("not");
//         }
//     }
// }

//find the number of bracket we need to remove to make the given bracket sequence balanced 
// import java.util.*;
// class Stackk{
//     public static int balance(String s){
//         Stack<Character> st=new Stack<>();
//         int c=0;
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch=='('){
//                 st.push(ch);
//             }else{
//                 if(st.size()==0 ){
//                     c++;
//                 }else{
//                     st.pop();
//                 }
//             }
//         }
//         int result=c+st.size();
//         return result;
       
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         int t=balance(str);
//         System.out.println(t);
//     }
// }

//remove consecutive subsequences
// import java.util.*;
// class Stackk{
//     public static int[] remove(int[] arr){
//         Stack<Integer> st=new Stack<>();
//         int x=arr.length;
//         for(int i=0;i<x;i++){
//             if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);
//             else if(st.peek()==arr[i]){
//                 if(i==x-1 || arr[i]!=arr[i+1]){
//                     st.pop();
//                 }
//             }
//         }
//         int n=st.size();
//         int[] r=new int[n];
//         int m=r.length;
//         for(int i=m-1;i>=0;i--){
//             r[i]=st.pop();
//         }
//         return r;
//     }
//     public static void main(String[] args) {
//         int[] arr={1,2,2,3,2,2};
//         int[] result=remove(arr);
//         for(int i=0;i<result.length;i++){
//             System.out.print(result[i]+" ");
//         }
//     }
// }

//next greater element using 2 loops
//the problem will time complexity
// class Stackk{
//     public static void main(String[] args) {
//         int[] arr={1,3,2,1,8,6,3,4};
//         int[] res=new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//             res[i]=-1;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]<arr[j]){
//                     res[i]=arr[j];
//                     break;
//                 }
//             }
//         }
//         for(int i=0;i<res.length;i++){
//             System.out.print(res[i]+" ");
//         }
//     }
// }

//next greater with stack 
import java.util.*;
class Stackk{
    public static int[] greater(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0) res[i]=-1;
            else{res[i]=st.peek();}
            st.push(arr[i]);
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr={1,5,3,2,1,6,3,4};
        int[] res=greater(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
