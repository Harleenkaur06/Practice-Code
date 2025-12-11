// public class Stackk {
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
import  java.util.*;
class Stackk{
    public static void pushatbottom(int x,Stack<Integer> st){
        if(st.size()==0){
            st.push(x);
            return ;
        }
        int top=st.pop();
        pushatbottom(x, st);
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        st.push(5);
        st.push(23);
        st.push(90);
        st.push(80);
        int x=sc.nextInt();
        pushatbottom(x,st);
        System.out.println(st);
        
    }
}