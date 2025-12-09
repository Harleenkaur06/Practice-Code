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
import java.util.*;
public class Stackk{
    public static void display(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        System.out.println(top);
        display(st);
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(3);
        st.push(10);
        st.push(90);
        st.push(100);
        display(st);
        
        
    }
}