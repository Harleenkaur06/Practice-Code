// import java.util.*;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
//         for(int i=0;i<5;i++){
//             arr[i]=sc.nextInt();
//                }
//         for(int i:arr){//for each element of array for(variable name: array name)
//             System.out.println(i);
//         }
//     }
    
// }

//shallow copy of array 
// import java.util.*;
// public class Arrays {
//     public static void print(int[] arr){
//         for(int i=0;i<5;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
//         int[] arr2=arr;
//         for(int i=0;i<5;i++){
//             arr[i]=sc.nextInt();
//         }
//         print(arr);
//         print(arr2);
//         arr2[1]=0;//doing this it will change original array as well;
//         print(arr2);
       

//     }
    
// }

//count of insertion sort 
// import java.util.Scanner;
// // Other imports go here
// // Do NOT change the class name
// class Arrays
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

        
//         int insert=0;
//         for(int i=0;i<n;i++){
//             int j=i;
//             int s=0;
//             while(j>0 && arr[j-1]>arr[j]){
//                 int temp=arr[j-1];
//                 arr[j-1]=arr[j];
//                 arr[j]=temp;
//                 j--;
//                 s++;
//             }
//             if(s>0){
//                 insert+=s+1;
//             }
//         }
        
//         System.out.println(insert);
//     }
//     }

//count of odd frequency number in array
//import java.util.*; 
// Do NOT change the class name
// class Arrays
// {
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
        
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int max=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         int f=max+1;
//         int[] freq=new int[f];
//         for(int i=0;i<n;i++){
//             freq[arr[i]]++;
//         }
//         int c=0;
//         for(int i=0;i<f;i++){
//             if(freq[i]%2!=0){
//                 c++;
//             }
//         }
//         System.out.println(c);
        
//     }
//     }


//find the number of pairs in the array whose sum to x;
// import java.util.*;
// class Arrays{
//     public static void main(String[] args) {
//         int count=0;
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[10];
        
//         int x=sc.nextInt();
//         for(int i=0;i<10;i++){
//             arr[i]=sc.nextInt();
//         }
//         for (int i = 0; i < 10; i++) {
//             for(int j=i+1;j<10;j++){
//                 if(arr[i]+arr[j]==x){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
//     }

//no of triplets whose sum is equal to x
// import java.util.*;
// class Arrays{
//     public static void main(String[] args) {
//         int count=0;
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[6];
        
//         int x=sc.nextInt();
//         for(int i=0;i<6;i++){
//             arr[i]=sc.nextInt();
//         }
//         for (int i = 0; i < 6; i++) {
//             for(int j=i+1;j<6;j++){
//                 for(int k=j+1;k<6;k++){
//                 if(arr[i]+arr[j]+arr[k]==x){
//                     count++;
//                 }
//             }
//         }}
//         System.out.println(count);
//     }
//     }

//finding the unique value in the array
// import java.util.*;
// class Arrays{
//     public static void main(String[] args) {
//         int count=0;
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[10];
        
//         int x=sc.nextInt();
//         for(int i=0;i<10;i++){
//             arr[i]=sc.nextInt();
//         }
        
//         for (int i = 0; i < 10; i++) {
//     boolean unique = true;

//     for (int j = 0; j < 10; j++) {
//         if (i != j && arr[i] == arr[j]) {
//             unique = false;
//             break;
//         }
//     }

//     if (unique) {
//         System.out.println(arr[i]);
//     }
// }}
//     }
    
//reversing a array
import java.util.*;
class Arrays{
    public static int[] rev(int[] a){
        int[] ans=new int[a.length];
        int j=0;
        for(int i=a.length-1;i>=0;i--){
            ans[j++]=a[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int[] res= rev(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+ " ");
        }
        }
    }
