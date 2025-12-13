// import java.util.*;
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
import java.util.*;
public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> temp=new LinkedList<>();
        while(q.size()>0){
            System.out.print(q.peek()+" ");
            temp.add(q.remove());
        }
        while(temp.size()>0){
            q.add(temp.poll());
        }
    }
    
}