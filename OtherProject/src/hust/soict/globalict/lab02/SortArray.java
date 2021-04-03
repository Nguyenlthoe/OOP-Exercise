package hust.soict.globalict.lab02;
import java.util.Scanner;


public class SortArray {
    public static void main(String[] args){
        int sum;
        double average;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = keyboard.nextInt();
        if(n <= 0){
            int[] a = {1,2,3,4,5};
            BubbleSort(a);
            ShowArray(a);
            sum = SumOfArray(a);
            System.out.println("Tong cac gia tri trong mang la: " + sum);
            average = 1.0* sum / a.length;
            System.out.println("Gia tri trung binh cua mang la: " + average);
        } else {
            int[] a = new int[n];
            for(int i = 0; i < n ; i++){
                System.out.println("Nhap a[" + i + "]:");
                a[i] = keyboard.nextInt();
            }
            BubbleSort(a);
            ShowArray(a);
            sum = SumOfArray(a);
            System.out.println("Tong cac gia tri trong mang la: " + sum);
            average = 1.0* sum / a.length;
            System.out.println("Gia tri trung binh cua mang la: " + average);
        }
    }
    public static void BubbleSort(int[] a){
        int snapped = 0;
        do{
            snapped = 0;
            for(int i = 0; i < a.length - 1; i++){
                if(a[i] > a[i+1]){
                    int k = a[i+1];
                    a[i+1] = a[i];
                    a[i] = k;
                    snapped = 1;
                }
            }
        } while (snapped == 1);
    }
    public static void ShowArray(int[] a){
        System.out.println("Cac gia tri trong mang la: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    public static int SumOfArray(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum+=a[i];
        }
        return sum;
    }

}
