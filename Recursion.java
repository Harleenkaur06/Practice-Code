//a prog to print all natural no. from 1 to n
import java.util.*;
public class Recursion {
    public static void print(int n){
        if(n==1){
            System.out.println(1);
            return;}
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}
