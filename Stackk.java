import java.util.Stack;

//push pop peek size
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
public class Stackk {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(3);
        st.push(18);
        st.push(9);
        st.push(100);
        System.out.println(st);
        Stack<Integer> temp =new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        System.out.println(temp);//reversed stack
        Stack <Integer> st2 =new Stack<>();
        while(temp.size()>0){
            st2.push(temp.pop());
        }
        System.out.println(st2);//copied
}
}
