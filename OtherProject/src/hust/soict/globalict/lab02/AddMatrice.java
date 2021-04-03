package hust.soict.globalict.lab02;
import java.util.Scanner;

public class AddMatrice {
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        int n,m;
        System.out.println("Nhap so hang: ");
        n = key.nextInt();
        System.out.println("Nhap so cot: ");
        m = key.nextInt();
        int[][] matrice1 = new int[n][m];
        int[][] matrice2 = new int[n][m];
        int[][] sum = new int[n][m];
        System.out.println("Nhap cac phan tu ma tran 1");
        for(int i = 0; i < matrice1.length;i++){
            for(int j = 0 ; j < matrice1[0].length; j++){
                System.out.println("Matric1[" + (i+1) +"][" + (j+1) + "] = ");
                matrice1[i][j] = key.nextInt();
            }
        }
        System.out.println("Nhap cac phan tu ma tran 2");
        for(int i = 0; i < matrice2.length;i++){
            for(int j = 0 ; j < matrice2[0].length; j++){
                System.out.println("Matric2[" + (i+1) +"][" + (j+1) + "] = ");
                matrice2[i][j] = key.nextInt();
            }
        }
        for(int i = 0; i < matrice1.length;i++){
            for(int j = 0 ; j < matrice1[0].length; j++){
                sum[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }
        System.out.println("In mang 1: ");
        ShowMang(matrice1);
        System.out.println("In mang 2: ");
        ShowMang(matrice2);
        System.out.println("Tong cua 2 mang vua nhap: ");
        ShowMang(sum);
    }
    public static void ShowMang(int[][] a){
        for(int i = 0; i < a.length;i++){
            for(int j = 0 ; j < a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
