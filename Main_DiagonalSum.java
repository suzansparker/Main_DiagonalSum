import java.util.Scanner;

public class Main_DiagonalSum {
    public static int diagonalSum(int arr[][],int n) {
        int sum=0;
        for(int i=0;i<n;i++) {
            sum=sum+arr[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int value=diagonalSum(arr,n);
        System.out.println(value);

    }

}