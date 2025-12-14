// import java.util.*;
// public class Strings {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str="hello world!";
//         String str2=sc.nextLine();
//         System.out.println(str);
//         System.out.println(str2);
//         System.out.println(str.length());
//         System.out.println(str2.length());
//         System.out.println(str.charAt(8));
//         System.out.println(str2.charAt(7));
//     }
// }

import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder("hello");
        str.append("world");
        System.out.println(str);
        str.setCharAt(0,'m');//melloworld
        System.out.println(str);
        str.insert(2, 'y');
        System.out.println(str);//meylloworld
        str.deleteCharAt(2);
        System.out.println(str);//melloworld
        str.delete(0, 2);//2 not included
        System.out.println(str);//lloworld
    }
}