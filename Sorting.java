//bubble sort
// import java.util.*;
// public class Sorting {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int t=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=t;
//                 }
//             }
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

//optimized bubble sort
// import java.util.*;
// public class Sorting {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n-1;i++){
//             boolean swap=false;
//             for(int j=0;j<n-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int t=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=t;
//                     swap=true;
//                 }
//             }
//             if(!swap){
//                 break;
//             }
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

//selection sort
//select a element and put it in correct position
// import java.util.*;
// public class Sorting {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             int min=i;
//             for(int j=i;j<n;j++){
//                 if(arr[j]<arr[min]){
//                     min=j;
//                 }
//             }
//             int t=arr[i];
//             arr[i]=arr[min];
//             arr[min]=t;
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

//insertion sort
// import java.util.*;
// public class Sorting {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             int j=i;
//             while(j>0 && arr[j-1]>arr[j]){
//                 int t=arr[j-1];
//                 arr[j-1]=arr[j];
//                 arr[j]=t;
//                 j--;
//             }
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

//given an array move all the 0 at end and keep the relative order of the non-zero elements
// import java.util.*;
// public class Sorting {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){
//                 if(arr[j]==0 && arr[j+1]!=0){
//                     int t=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=t;
//                 }
//             }
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

//given an array of names of fruits you are supposed to sort it in lexicographical order
// import java.util.*;
// public class Sorting {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         String[] arr=new String[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.next();
//         }
//         for(int i=0;i<n;i++){
//             int min=i;
//             for(int j=i;j<n;j++){
//                 if(arr[j].compareTo(arr[min])<0){
//                     min=j;
//                 }
                
//             }
//             String t=arr[i];
//                 arr[i]=arr[min];
//                 arr[min]=t;
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

//Binary search
//finding target using binary search
import java.util.*;
class Sorting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int st=0,end=n-1;
       
        int found=-1;
        int target=sc.nextInt();
        while(st<=end){
             int mid=(st+end)/2;
            if(target==arr[mid]){
                found=mid;
                break;
            }else if(arr[mid]<target){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println("Index of the target in the array "+found);
    }
}
