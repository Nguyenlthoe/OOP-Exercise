package hust.soict.globalict.aims.utils;
import java.util.Scanner;

public class MyDate {

    public MyDate() {
        super();
    }

    public MyDate(int date, int month, int year) {
        super();
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public MyDate(String a){
        String strMonth="";
        String strDate="";
        String strYear="";
        int i = 0;
        for(i = i; i < a.length();i++){
            if(a.charAt(i) == ' '){
                break;
            } else {
                strMonth+=a.charAt(i);
            }
        }
        switch (strMonth){
            case "January":
                this.month = 1;
                break;
            case "February":
                this.month =2;
                break;
            case "March":
                this.month =3;
                break;
            case "April":
                this.month =4;
                break;
            case "May":
                this.month =5;
                break;
            case "June":
                this.month =6;
                break;
            case "July":
                this.month =7;
                break;
            case "August":
                this.month =8;
                break;
            case "September":
                this.month =9;
                break;
            case "October":
                this.month =10;
                break;
            case "November":
                this.month =11;
                break;
            case "December":
                this.month =12;
                break;
            default:
                System.out.println("Thang nhap khong dung");
                break;
        }
        for (i = i+1; i < a.length();i++){
            if(a.charAt(i) == ' '){
                break;
            } else if(a.charAt(i) == '0' || a.charAt(i) == '1' ||a.charAt(i) == '2' ||a.charAt(i) == '3' ||a.charAt(i) == '4' ||a.charAt(i) == '5' ||a.charAt(i) == '6' ||a.charAt(i) == '7' ||a.charAt(i) == '8' ||a.charAt(i) == '9'){
                strDate+=a.charAt(i);
            } else {
                continue;
            }
        }
        this.date= Integer.valueOf(strDate);
        for(i = i+1; i < a.length();i++){
            strYear += a.charAt(i);
        }
        this.year = Integer.valueOf(strYear);
    }

    public MyDate(String strDate, String strMonth,String strYear){
        switch (strDate){
            case "first":
                date = 1;
                break;
            case "second":
                date = 2;
                break;
            case "third":
                date = 3;
                break;
            case "fourth":
                date = 4;
                break;
            case "fifth":
                date = 5;
                break;
            case "sixth":
                date = 6;
                break;
            case "seventh":
                date = 7;
                break;
            case "eighth":
                date = 8;
                break;
            case "ninth":
                date = 9;
                break;
            case "tenth":
                date = 10;
                break;
            case "eleventh":
                date = 11;
                break;
            case "twelfth":
                date = 12;
                break;
            case "thirteenth":
                date = 13;
                break;
            case "fourteenth":
                date = 14;
                break;
            case "fifteenth":
                date = 15;
                break;
            case "sixteenth":
                date = 16;
                break;
            case "seventeenth":
                date = 17;
                break;
            case "eighteenth":
                date = 18;
                break;
            case "nineteenth":
                date = 19;
                break;
            case "twentieth":
                date = 20;
                break;
            case "twenty-first":
                date = 21;
                break;
            case "twenty-second":
                date = 22;
                break;
            case "twenty-third":
                date = 23;
                break;
            case "twenty-fourth":
                date = 24;
                break;
            case "twenty-fifth":
                date = 25;
                break;
            case "twenty-sixth":
                date = 26;
                break;
            case "twenty-seventh":
                date = 27;
                break;
            case "twenty-eighth":
                date = 28;
                break;
            case "twenty-nighth":
                date = 29;
                break;
            case "thirieth":
                date = 30;
                break;
            case "thirty-first":
                date = 31;
                break;
            default:
                break;
        }
        switch (strMonth){
            case "January":
                this.month = 1;
                break;
            case "February":
                this.month =2;
                break;
            case "March":
                this.month =3;
                break;
            case "April":
                this.month =4;
                break;
            case "May":
                this.month =5;
                break;
            case "June":
                this.month =6;
                break;
            case "July":
                this.month =7;
                break;
            case "August":
                this.month =8;
                break;
            case "September":
                this.month =9;
                break;
            case "October":
                this.month =10;
                break;
            case "November":
                this.month =11;
                break;
            case "December":
                this.month =12;
                break;
            default:
                System.out.println("Thang nhap khong dung");
                break;
        }
        year = Integer.valueOf(strYear);
    }
    private int date;
    private int month;
    private int year;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        if(date <= 0 || date > 31){
            System.out.println("Date is not valid");
        } else if(date == 31){
            if(this.month == 2 ||this.month == 4 ||this.month == 6 ||this.month == 9 ||this.month == 11){
                System.out.println("Date is not valid");
            }
        } else if(date == 29){
            if(this.month == 2 && this.year % 4 != 0 || this.month == 2 && this.year % 100 == 0 && this.year % 400 != 0){
                System.out.println("Date is not valid");
            }
        } else if(date==30){
            if(this.month == 2){
                System.out.println("Date is not valid");
            }
        }
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month <= 0 || month > 12){
            System.out.println("Date is not valid");
        } else if(month == 2){
            if(this.date > 29){
                System.out.println("Date is not valid");
            } else if(this.date == 29 && this.year %4 != 0 ||this.date == 29 && this.year %400 != 0 && this.year %100 ==0){
                System.out.println("Date is not valid");
            }
        } else if(this.date ==31){
            if(month == 4 || month ==6 || month == 9 || month ==11){
                System.out.println("Date is not valid");
            }
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 0){
            System.out.println("Date is not valid");
        } else if(this.date == 29 && this.month == 2){
            if(year % 4 != 0 || year % 400 != 0 && year % 100 == 0){
                System.out.println("Date is not valid");
            }
        }
        this.year = year;
    }

    public void printt(){

        if(date < 10){
            System.out.print("Date(dd/mm/yyyy): 0" + date + "/");
        } else {
            System.out.print("Date(dd/mm/yyyy): " + this.date + "/");
        }
        if(month < 10){
            System.out.println("0" + month + "/" + year);
        }else {
            System.out.println(month + "/" + year);
        }
    }

    public void accept(){
        Scanner keyboard = new Scanner(System.in);
        String strDay;
        System.out.println("Enter the date(Ex: February 18th 2021): ");
        strDay = keyboard.nextLine();
        MyDate day = new MyDate(strDay);
        this.date = day.getDate();
        this.month = day.getMonth();
        this.year = day.getYear();
    }

    public void print(){
        switch (month){
            case 1:
                System.out.print("January ");
                break;
            case 2:
                System.out.print("February ");
                break;
            case 3:
                System.out.print("March ");
                break;
            case 4:
                System.out.print("April ");
                break;
            case 5:
                System.out.print("May ");
                break;
            case 6:
                System.out.print("June ");
                break;
            case 7:
                System.out.print("July ");
                break;
            case 8:
                System.out.print("August ");
                break;
            case 9:
                System.out.print("September ");
                break;
            case 10:
                System.out.print("October ");
                break;
            case 11:
                System.out.print("November ");
                break;
            default:
                System.out.print("December ");
                break;
        }
        switch (date%10){
            case 1:
                System.out.println(date + "st " + year);
                break;
            case 2:
                System.out.println(date + "nd " + year);
                break;
            case 3:
                System.out.println(date + "rd " + year);
                break;
            default:
                System.out.println(date + "th " + year);
                break;
        }
    }

    public void printtt(){
        if(month < 10){
            System.out.print(year + "-0" + month + "-");
        }else {
            System.out.print(year + "-" + month + "-");
        }
        if(date < 10){
            System.out.println("0" + date);
        } else {
            System.out.print(date);
        }
    }
}