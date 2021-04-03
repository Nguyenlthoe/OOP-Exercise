package hust.soict.globalict.test.disc;

import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
public class TestPassingParameter {
    public static void main(String args[]){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cindernella");

        swap(jungleDVD, cinderellaDVD);

        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD,cinderellaDVD.getTitle());

        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
    public static void swap(Object o1,Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void swap(DigitalVideoDisc o1,DigitalVideoDisc o2){
        DigitalVideoDisc tmp = new DigitalVideoDisc(o1.getTitle());
        o1.setTitle(o2.getTitle());
        o2.setTitle(tmp.getTitle());
    }
    public static void changeTitle(DigitalVideoDisc dvd,String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
