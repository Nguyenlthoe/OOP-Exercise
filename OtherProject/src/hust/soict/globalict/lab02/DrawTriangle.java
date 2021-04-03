package hust.soict.globalict.lab02;
import java.util.Scanner;
public class DrawTriangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap n:");
		int num = keyboard.nextInt();
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for(int j= 0 ; j < 2*i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
