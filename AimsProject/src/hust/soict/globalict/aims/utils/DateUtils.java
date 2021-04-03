package hust.soict.globalict.aims.utils;
public class DateUtils {
    public static int compare(MyDate o1,MyDate o2){
        if(o1.getYear() > o2.getYear()){
            return 1;
        } else if(o1.getYear() == o2.getYear()){
            if(o1.getMonth() > o2.getMonth()){
                return 1;
            } else if(o1.getMonth() == o2.getMonth()){
                if(o1.getDate() > o2.getDate()){
                    return 1;
                } else if(o1.getDate() == o2.getDate()){
                    return 0;
                } else{
                    return -1;
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
    public static void sortday(MyDate []list){
        int snapped = 0;
        do{
            snapped = 0;
            for(int i = 0; i < list.length - 1; i++){
                if(compare(list[i],list[i+1]) == 1){
                    MyDate tmp = new MyDate();
                    tmp.setDate(list[i+1].getDate());
                    tmp.setMonth(list[i+1].getMonth());
                    tmp.setYear(list[i+1].getYear());
                    list[i+1].setYear(list[i].getYear());
                    list[i+1].setDate(list[i].getDate());
                    list[i+1].setMonth(list[i].getMonth());
                    list[i].setYear(tmp.getYear());
                    list[i].setDate(tmp.getDate());
                    list[i].setMonth(tmp.getMonth());
                    snapped = 1;
                }
            }
        } while (snapped == 1);
        for(int i = 0; i < list.length; i++){
            list[i].printt();
        }
    }
    public static void main(String args[]){
        MyDate a = new MyDate("twenty-fourth", "February", "2021");

        MyDate c = new MyDate();
        c.setDate(12);
        c.setMonth(7);
        c.setYear(2021);

        MyDate b = new MyDate("February 20th 2021");
        MyDate d = new MyDate("January 20th 2021");
        MyDate e = new MyDate("March 18th 2021");
        MyDate f = new MyDate("March 11th 2021");
        MyDate g = new MyDate("February 17th 2021");
        MyDate[] listdate = new MyDate[7];
        listdate[0] = a;
        listdate[1] = b;
        listdate[2] = c;
        listdate[3] = d;
        listdate[4] = e;
        listdate[5] = f;
        listdate[6] = g;
        sortday(listdate);
    }
}
