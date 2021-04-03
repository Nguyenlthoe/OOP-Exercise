package hust.soict.globalict.lab02;
import java.util.Scanner;

public class NumberOfDayOfMonth {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int month = -2,year;
        String strmonth;
        System.out.println("Nhap thang:");
        strmonth = keyboard.nextLine();
        System.out.println("Nhap nam:");
        year = keyboard.nextInt();
        keyboard.nextLine();
        switch (strmonth){
            case "January","Jan.","Jan","1":
                month = 1;
                break;
            case "February","Feb.","Feb","2":
                month = 2;
                break;
            case "April","Apr","Apr.","4":
                month = 4;
                break;
            case "March","Mar","Mar.","3":
                month = 3;
                break;
            case "June","Jun.", "Jun","6":
                month = 6;
                break;
            case "May","May.","5":
                month = 5;
                break;
            case "July","Jul","Jul.","7":
                month = 7;
                break;
            case "August","Aug.","Aug","8":
                month = 8;
                break;
            case "September","Sept.","Sep","9":
                month = 9;
                break;
            case "November","Nov.","Nov","11":
                month = 11;
                break;
            case "October","Oct","Oct.","10":
                month =10;
                break;
            case "December","Dec.","Dec","12":
                month =12;
                break;
            default:
                month =13;
                break;
        }
        while (month > 12 || month <= 0 || year < 0){
            System.out.println("Dau vao khong hop le");
            System.out.println("Nhap lai thang:");
            strmonth = keyboard.nextLine();
            System.out.println("Nhap lai nam:");
            year = keyboard.nextInt();
            keyboard.nextLine();
            switch (strmonth){
                case "January","Jan.","Jan","1":
                    month = 1;
                    break;
                case "February","Feb.","Feb","2":
                    month = 2;
                    break;
                case "April","Apr","Apr.","4":
                    month = 4;
                    break;
                case "March","Mar","Mar.","3":
                    month = 3;
                    break;
                case "June","Jun.", "Jun","6":
                    month = 6;
                    break;
                case "May","May.","5":
                    month = 5;
                    break;
                case "July","Jul","Jul.","7":
                    month = 7;
                    break;
                case "August","Aug.","Aug","8":
                    month = 8;
                    break;
                case "September","Sept.","Sep","9":
                    month = 9;
                    break;
                case "November","Nov.","Nov","11":
                    month = 11;
                    break;
                case "October","Oct","Oct.","10":
                    month =10;
                    break;
                case "December","Dec.","Dec","12":
                    month =12;
                    break;
                default:
                    month =13;
                    break;
            }
        }
        switch (month){
            case 1,3,5,7,8,10,12:
                System.out.println("So ngay trong thang " + month + " nam " + year + " la: 31");
                break;
            case 2:
                if(year % 4 != 0){
                    System.out.println("So ngay trong thang " + month + " nam " + year + " la: 28");
                } else {
                    if(year % 100 == 0 && year % 400 != 0){
                        System.out.println("So ngay trong thang " + month + " nam " + year + " la: 28");
                    } else {
                        System.out.println("So ngay trong thang " + month + " nam " + year + " la: 29");
                    }
                }
                break;
            default:
                System.out.println("So ngay trong thang " + month + " nam " + year + " la: 30");
                break;
        }
    }
}
