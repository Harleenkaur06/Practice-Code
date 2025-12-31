//taking input from user and printing of 2d array;
// import java.util.*;
// public class MultiDArrays {
//     public static void main(String[] args) {
//         int[][] arr=new int[3][3];
//         Scanner sc=new Scanner(System.in);
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//addition of 2 matrices
// import java.util.*;
// public class MultiDArrays {
//     public static int[][] add(int[][] a,int[][] b){
//         int r=a.length;
//         int c=a[0].length;
//         if(a.length != b.length || a[0].length != b[0].length){
//             System.out.println("Can't add these matrices");
//             return null;
// }

//         int[][] res=new int[r][c];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 res[i][j]=a[i][j]+b[i][j];
//             }
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[][] arr=new int[3][3];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         int[][] arr2=new int[3][3];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 arr2[i][j]=sc.nextInt();
//             }
//         }
//         int[][] res=add(arr,arr2);
//         if(res!=null){
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 System.out.print(res[i][j]+" ");
//             }
//             System.out.println();
//         }}
//     }
// }


//multiplication
// import java.util.*;
// public class MultiDArrays {
//     public static void multiply(int[][] a,int[][] b,int r1,int c1,int r2,int c2){
//         if(c1!=r2){
//             System.out.println("can't multiply");
//             return;
//         }
//         int[][] mul=new int[r1][c2];
//         for(int i=0;i<r1;i++){
//             for(int j=0;j<c2;j++){
//                 for(int k=0;k<r2;k++){
//                     /*
//                     mul[i][j]=ith row of a matrix and jth col of a matrix;
//                      */
//                     mul[i][j]+=a[i][k]*b[k][j];
//                 }
//             }
//         }
//         for(int i=0;i<r1;i++){
//             for(int j=0;j<c2;j++){
//                 System.out.print(mul[i][j]+"  ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int r1=sc.nextInt();
//         int c1=sc.nextInt();
//         int[][] arr=new int[r1][c1];
//         for(int i=0;i<r1;i++){
//             for(int j=0;j<c1;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         int r2=sc.nextInt();
//         int c2=sc.nextInt();
//         int[][] arr2=new int[r2][c2];
//         for(int i=0;i<r2;i++){
//             for(int j=0;j<c2;j++){
//                 arr2[i][j]=sc.nextInt();
//             }
//         }
//         multiply(arr,arr2,r1,c1,r2,c2);
        
//     }
// }

//transpose of a matrix
// import java.util.*;
// public class MultiDArrays {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int r1=sc.nextInt();
//         int c1=sc.nextInt();
//         int[][] arr=new int[r1][c1];
//         for(int i=0;i<r1;i++){
//             for(int j=0;j<c1;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         int[][] t=new int[c1][r1];
//         for(int i=0;i<c1;i++){
//             for(int j=0;j<r1;j++){
//                 t[i][j]=arr[j][i];
//             }
//         }
//         for(int i=0;i<c1;i++){
//             for(int j=0;j<r1;j++){
//                 System.out.print(t[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//in place for square matrix
// import java.util.*;
// public class MultiDArrays {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int r1=sc.nextInt();
//         int c1=sc.nextInt();
//         int[][] arr=new int[r1][c1];
//         for(int i=0;i<r1;i++){
//             for(int j=0;j<c1;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
        
//         for(int i=0;i<c1;i++){
//             for(int j=i;j<r1;j++){
//                 int temp=arr[i][j];
//                 arr[i][j]=arr[j][i];
//                 arr[j][i]=temp;
//             }
//         }
//         for(int i=0;i<c1;i++){
//             for(int j=0;j<r1;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//given a sq matrix turn it by 90 degree clockwise
//find tranpose and then reverse the rows
// import java.util.*;
// public class MultiDArrays {
//     public static void reverse(int[] a){
//         int i=0,j=a.length-1;
//         while(i<j){
//             int t=a[i];
//             a[i]=a[j];
//             a[j]=t;
//             i++;
//             j--;
//         }
//     } 
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[][] arr=new int[n][n];//sq matrix
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 int temp=arr[i][j];
//                 arr[i][j]=arr[j][i];
//                 arr[j][i]=temp;
//             }
//         }
//         for(int i=0;i<n;i++){
//             /*arr[i]represents a whole row */
//             reverse(arr[i]);
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//pascals triangle
//each no. is sum of numbers exactly above it
//p[i][j]=p[i-1][j]+p[i-1][j-1];
//every row first and last element is one
//jagged 2d arrays(different no. of cols in rows)
// import java.util.*;
// public class MultiDArrays {
//     public static int[][] pascal(int n){
//         int[][] arr=new int[n][];//because column is not fix
//         for(int i=0;i<n;i++){
//             arr[i]=new int[i+1];
//             arr[i][0]=arr[i][i]=1;
//             for(int j=1;j<i;j++){
//                 arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
//             }
//         }
//         return arr;
//     } 
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[][] ans=pascal(n);
        
//         for(int i=0;i<n;i++){
//             for(int j=0;j<ans[i].length;j++){
//                 System.out.print(ans[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//spiral order in matrix
// top row ,rightmost col,last row, leftmost, againn top,right,last,left
import java.util.*;
public class MultiDArrays { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int top=0,bottom=r-1,leftcol=0,rightcol=c-1;
        int totalelements=0;
        while(totalelements<=(r*c)) { 
            //top row->left to right
            for(int i=leftcol;i<=rightcol;i++){
                System.out.println(arr[top][i]);
                totalelements++;
            }
            top++;
            //right col-> top to bottom
            for(int j=top;j<=bottom;j++){
                System.out.println(arr[j][rightcol]);
                totalelements++;
            }
            rightcol--;
            //bottom->right to left
            for(int k=rightcol;k>=leftcol;k--){
                System.out.println(arr[bottom][k]);
                totalelements++;
            }
            bottom--;
            // left->bottom to top
            for(int l=bottom;l>=top;l--){
                System.out.println(arr[l][leftcol]);
                totalelements++;
            }
            leftcol++;
        }
    }
}