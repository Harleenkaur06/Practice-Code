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

//stringbuilder and basic function
// import java.util.*;
// public class Strings {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         StringBuilder str=new StringBuilder("hello");
//         str.append("world");
//         System.out.println(str);
//         str.setCharAt(0,'m');//melloworld
//         System.out.println(str);
//         str.insert(2, 'y');
//         System.out.println(str);//meylloworld
//         str.deleteCharAt(2);
//         System.out.println(str);//melloworld
//         str.delete(0, 2);//2 not included
//         System.out.println(str);//lloworld
//     }
// }

//reverse
// import java.util.*;
// public class Strings {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         StringBuilder str=new StringBuilder("hello");
//         // str.reverse();
//         // System.out.println(str);

//     }
// }

//the letter in upper to lower and lower to upper
//with stringbuilder
// import java.util.*;
// public class Strings {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         StringBuilder str=new StringBuilder(sc.nextLine());
//         //toggle
//         //pHYsics;
//         for(int i=0;i<str.length();i++){
//             int f=0;
//             char ch=str.charAt(i);
//             int ascii=(int)ch;
//             if(ch==' '){
//                 continue;
//             }
//             if(ascii>=97){
//                 f=1;//small letter
//             }
//             if(f==0){
//                 ascii+=32;
//                 char dh=(char)ascii;
//                 str.setCharAt(i, dh);
//             }else{
//                 ascii-=32;
//                 char sh=(char)ascii;
//                 str.setCharAt(i, sh);
//             }
//         }
        
//         System.out.println(str);
//     }
// }

//toggle using string
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //toggle
        //pHYsics;
        for(int i=0;i<str.length();i++){
            int f=0;
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ch==' '){
                continue;
            }
            if(ascii>=97){
                f=1;//small letter
            }
            if(f==0){
                ascii+=32;
                char dh=(char)ascii;
                str=str.substring(0,i)+dh+str.substring(i+1);
            }else{
                ascii-=32;
                char sh=(char)ascii;
                str=str.substring(0,i)+sh+str.substring(i+1);
            }
        }
        
        System.out.println(str);
    }
}