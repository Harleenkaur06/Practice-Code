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
// import java.util.*;
// class Arrays{
//     public static int[] rev(int[] a){
//         int[] ans=new int[a.length];
//         int j=0;
//         for(int i=a.length-1;i>=0;i--){
//             ans[j++]=a[i];
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[10];
//         for(int i=0;i<10;i++){
//             arr[i]=sc.nextInt();
//         }
//         int[] res= rev(arr);
//         for(int i=0;i<res.length;i++){
//             System.out.print(res[i]+ " ");
//         }
//         }
//     }

//optimized reversing code(in -place)
// import java.util.*;
// class Arrays{
//     public static int[] rev(int[] a){
//         int i=0;
//         int j=a.length-1;
//         while(i<j){
//             int t=a[i];
//             a[i]=a[j];
//             a[j]=t;
//             i++;
//             j--;
//         }
//         return a;
//     }
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[10];
//         for(int i=0;i<10;i++){
//             arr[i]=sc.nextInt();
//         }
//         int[] res= rev(arr);
//         for(int i=0;i<res.length;i++){
//             System.out.print(res[i]+ " ");
//         }
//         }
//     }

// rotate array by k steps k can be greater than length of array
// import java.util.*;
// class Arrays{
    
//     public static int[] rotate(int[] a,int k){
//         int n=a.length;
//         k=k%n;
//         int[] ans=new int[n];
//         int j=0;
//         for(int i=n-k;i<n;i++){
//             ans[j++]=a[i];
//         }
//         for(int i=0;i<n-k;i++){
//             ans[j++]=a[i];
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[10];
//         for(int i=0;i<10;i++){
//             arr[i]=sc.nextInt();
//         }
//         int k=sc.nextInt();

//         int[] res= rotate(arr,k);
//         for(int i=0;i<res.length;i++){
//             System.out.print(res[i]+ " ");
//         }
//         }
//     } 

//optimized (in-place) rotate array by k steps k can be greater than length of array
// import java.util.*;
// class Arrays{
//     public static void reverse(int[] a,int i,int j){
//         while(i<j){
//             int t=a[i];
//             a[i]=a[j];
//             a[j]=t;
//             i++;
//             j--;
//         }
//     }
//     public static void rotate(int[] a,int k){
//         int n=a.length;
//         k=k%n;
//         reverse(a, 0, n-k-1);
//         reverse(a, n-k, n-1);
//         reverse(a, 0, n-1);  
       
//     }
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[10];
//         for(int i=0;i<10;i++){
//             arr[i]=sc.nextInt();
//         }
//         int k=sc.nextInt();

//         rotate(arr,k);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+ " ");
//         }
//         }
//     } 

//given q queries, check whether if the given number is present in the array or not
//numbers in the array can be upto 10^5
// import java.util.*;
// class Arrays{
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[10];
//         for(int i=0;i<10;i++){
//             arr[i]=sc.nextInt();
//         }
//         int[] freq=new int[100005];
//         for(int i=0;i<arr.length;i++){
//                 freq[arr[i]]++;
//         }
//         int q=sc.nextInt();//no. queries
//         while(q>0){
//             int x=sc.nextInt();
//             if(freq[x]>0){
//                 System.out.println("yes");
//             }else{
//                 System.out.println("no");
//             }
//             q--;
//         }
//         }
//     } 

//sort an array consiting 0 and 1
// import java.util.*;
// class Arrays{
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[10];
//         for(int i=0;i<10;i++){
//             arr[i]=sc.nextInt();
//         }
//         int c=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==0){
//                 c++;
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             if(i<c){
//                 arr[i]=0;
//             }else{
//                 arr[i]=1;
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         }
//     } 

//in one traverse
// import java.util.*;
// class Arrays{
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[10];
//         for(int i=0;i<10;i++){
//             arr[i]=sc.nextInt();
//         }
//         int i=0,j=arr.length-1;
//         while(i<j){
//             if(arr[i]==1 && arr[j]==0){
//                 int t=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=t;
                
//             }
//             if(arr[i]==0){
//                 i++;
//             }
//             if(arr[j]==1){
//                 j--;
//             }
            
//         }
//         for(int k=0;k<arr.length;k++){
//             System.out.print(arr[k]+" ");
//         }
//         }
//     } 

//bring all the even integer in the starting of array 
// import java.util.*;
// class Arrays{
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[10];
//         for(int i=0;i<10;i++){
//             arr[i]=sc.nextInt();
//         }
//         int i=0,j=arr.length-1;
//         while(i<j){
//             if(arr[i]%2!=0 && arr[j]%2==0){
//                 int t=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=t;
                
//             }
//             if(arr[i]%2==0){
//                 i++;
//             }
//             if(arr[j]%2!=0){
//                 j--;
//             }
            
//         }
//         for(int k=0;k<arr.length;k++){
//             System.out.print(arr[k]+" ");
//         }
//         }
//     }  

//given an array in non-decreaing order,return the sq of those number in non-decreasing order 
// import java.util.*;
// class Arrays{
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[10];
//         for(int i=0;i<10;i++){
//             arr[i]=sc.nextInt();
//         }
//         int[] ans=new int[10];
//         int l=0,r=arr.length-1;
//         int i=0;
//         while(l<=r){
//             if(Math.abs(arr[l])>Math.abs(arr[r])){
//                 ans[i++]=arr[l]*arr[l];
//                 l++;
//             }else{
//                 ans[i++]=arr[r]*arr[r];
//                 r--;
//             }
//         }
//         for(int k=ans.length-1;k>=0;k--){
//             System.out.print(ans[k]+" ");
//         }
//         }
//     }  

//prefix sum of an array
// import java.util.*;
// class Arrays{
//     public static void prefix(int[] a){
//         int[] ans=new int[a.length];
//         int s=0;
//         for(int i=0;i<a.length;i++){
//             s+=a[i];
//             ans[i]=s;
//         }
//         for(int i=0;i<ans.length;i++){
//             System.out.print(ans[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[10];
//         for(int i=0;i<10;i++){
//             arr[i]=sc.nextInt();
//         }
//         prefix(arr);
//         }
//     }  

//prefix sum in-place approach
// import java.util.*;
// class Arrays{
//     public static int[] prefix(int[] a){
       
//         for(int i=1;i<a.length;i++){
//            a[i]=a[i-1]+a[i];
//         }
//         return a;
//     }
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         prefix(arr);
//         for(int x:arr){
//             System.out.print(x+" ");
//         }
//         }
//     }  

//check if a array can be divided in two subarrays of same sum;
//we can check if sum of prefix is equal to suffix of i+1;
import java.util.*;
class Arrays{
    public static int[] prefix(int[] a){
        int[] ans=new int[a.length];
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
            ans[i]=s;
        }
        return ans;
    }
    public static int[] suffix(int[] a){
        int[] ans=new int[a.length];
        int s=0;
        for(int i=a.length-1;i>=0;i--){
            s+=a[i];
           ans[i]=s;
           
        }
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] pref=prefix(arr);
        int[] suf=suffix(arr);
        boolean found=false;
        for(int i=0;i<n-1;i++){
            if(pref[i]==suf[i+1]){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        }
    }
