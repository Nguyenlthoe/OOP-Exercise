package hust.soict.globalict.test.utils;

import hust.soict.globalict.aims.utils.*;
import hust.soict.globalict.test.utils.*;
public class DateTest {
    public static void main(String[] args){
        MyDate a = new MyDate("twenty-fourth", "February", "2021");
        a.print();

        MyDate c = new MyDate();
        c.setDate(12);
        c.setMonth(7);
        c.setYear(2021);
        c.printtt();
//        MyDate d = new MyDate();
//        d.setMonth(4);
//        d.setDate(31);
//        d.setYear(2000);
//        d.print();

//        MyDate b = new MyDate();
//        b.accept();
//        b.printtt();
    }

}
