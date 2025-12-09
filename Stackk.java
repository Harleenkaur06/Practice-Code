import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.size();
        System.out.println(st.size());//0
        st.push(5);
        st.push(3);
        st.push(18);
        st.push(9);
        st.push(100);
        System.out.println(st.size());//5
        System.out.println(st);
        st.pop();
        st.pop();//100 and 9 removed
        System.out.println(st.size());//3
        System.out.println(st);//5 3 18     
    
}
}