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
import java.util.*;
public class MultiDArrays {
    public static int[][] add(int[][] a,int[][] b){
        int r=a.length;
        int c=a[0].length;
        if(a.length != b.length || a[0].length != b[0].length){
            System.out.println("Can't add these matrices");
            return null;
}

        int[][] res=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] arr2=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int[][] res=add(arr,arr2);
        if(res!=null){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }}
    }
}
