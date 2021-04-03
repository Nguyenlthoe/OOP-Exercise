package hust.soict.globalict.lab01;

import java.util.Scanner;

public class Bai6SolveEquation {
	public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        int a;
        System.out.println("1.Phuong trinh bac nhat 1 an" +
                "\n2.He Phuong trinh bac nhat 2 an" +
                "\n3.Phuong trinh bac 2 1 an" +
                "\nEnter your options: ");
        a = scaner.nextInt();
        switch (a){
            case 1:
                linerEquation1(scaner);
                break;
            case 2:
                linearEquation2(scaner);
                break;
            case 3:
                secondDegreeEquation(scaner);
                break;
        }

    }
    public static void linerEquation1(Scanner scanner){
        double a1,b;
        System.out.println("Phuong trinh dang: ax = b");
        System.out.println("Nhap a: ");
        a1 = scanner.nextDouble();
        System.out.println("Nhap b: ");
        b = scanner.nextDouble();

        if(a1 == 0){
            if(b == 0){
                System.out.println("Phuong trinh co vo so nghiem");
            } else{
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co 1 nghiem duy nhat x = " + (b/a1));
        }
    }
    public static void linearEquation2(Scanner scanner){
        double a,b,c,d,e,f,D,Dx,Dy;
        System.out.println("He phuong trinh 2 an dang:" +
                "\nax + by = c" +
                "\ndx + ey = f");
        System.out.println("Nhap a:");
        a = scanner.nextDouble();
        System.out.println("Nhap b:");
        b = scanner.nextDouble();
        System.out.println("Nhap c:");
        c = scanner.nextDouble();
        System.out.println("Nhap d:");
        d = scanner.nextDouble();
        System.out.println("Nhap e:");
        e = scanner.nextDouble();
        System.out.println("Nhap f:");
        f = scanner.nextDouble();
        D = a * e - b * d;
        Dx = c * e - b * f;
        Dy = a * f - d * c;
        if(D == 0){
            if(Dx == Dy && Dy == 0){
                System.out.println("He phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co cap nghiem:" +
                    "\nx = " + (Dx/D) +
                    "\ny = " + (Dy/D));
        }
    }
    public static void secondDegreeEquation(Scanner scanner){
        double a,b,c,delta;
        System.out.println("Phuong trinh dang: ax^2 + bx + c = 0");
        System.out.println("Nhap a:");
        a = scanner.nextDouble();
        System.out.println("Nhap b:");
        b = scanner.nextDouble();
        System.out.println("Nhap a:");
        c = scanner.nextDouble();
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("Phuong trinh co vo so nghiem");
                } else{
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co 1 nghiem duy nhat x = " + (-c/b));
            }
        } else {
            delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            } else if(delta == 0){
                System.out.println("Phuong trinh co 1 nghiem duy nhat x = " + (-b/(2*a)));
            } else {
                System.out.println("Phuong trinh co 2 nghiem");
                System.out.println("x1 = "+ (-b + Math.sqrt(delta))/(2*a));
                System.out.println("x2 = " + (-b - Math.sqrt(delta))/(2*a));
            }
        }

    }
}
