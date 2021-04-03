package hust.soict.globalict.aims.order;

import hust.soict.globalict.aims.disc.*;
import hust.soict.globalict.aims.utils.*;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITED_ORDERS = 5;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    private static int nbOrders = 0;
    private MyDate dateOrderd;

    public Order(MyDate dateOrderd) {
        if(nbOrders == MAX_LIMITED_ORDERS){
            System.out.print("Can not creat new Order: ");
            dateOrderd.print();
        } else {
            this.dateOrderd = dateOrderd;
            nbOrders++;
        }
    }
    public Order(){

    }
    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }


    public void addDigitalVideoDisc(DigitalVideoDisc dvd){
        if(qtyOrdered >= 10){
            System.out.println("The disc has not been added because the order is full");
        } else {
            itemsOrdered[qtyOrdered] = dvd;
            System.out.println(dvd.getTitle() + " has been added");
            qtyOrdered++;
            if(qtyOrdered >= 10){
                System.out.println("The order is almost full");
            }
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc []list){
        for(int i = 0; i < list.length;i++){
            if(qtyOrdered >= 10){
                System.out.println("The disc list is not added:");
                for(int j = i; j < list.length; j++){
                    System.out.println(list[j].getTitle() + " ");
                }
                break;
            } else {
                itemsOrdered[qtyOrdered] = list[i];
                System.out.println(list[i].getTitle() + " has been added");
                qtyOrdered++;
                if(qtyOrdered >= 10){
                    System.out.println("The order is almost full");
                }
            }
        } 
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if(qtyOrdered >= 10){
            System.out.println("No disc has been added because the order is full");
        } else {
            itemsOrdered[qtyOrdered] = dvd1;
            System.out.println(dvd1.getTitle() + " has been added");
            qtyOrdered++;
            if(qtyOrdered >= 10){
                System.out.println(dvd2.getTitle() + " has not been added");
                System.out.println("The order is almost full ");
            } else {
                itemsOrdered[qtyOrdered] = dvd2;
                System.out.println(dvd2.getTitle() + " has been added");
                qtyOrdered++;
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd, int max){
        itemsOrdered[qtyOrdered] = dvd;
        System.out.println(dvd.getTitle() + " has been added");
        qtyOrdered++;
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc dvd){
        if(qtyOrdered == 0){
            return ;
        }
        for(int i = 0; i < qtyOrdered; i++){
            if(itemsOrdered[i] == dvd){
                for(int j = i; j < qtyOrdered - 1;j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                qtyOrdered--;
                break;
            }
        }
    }

    public float totalCost(){
        float sum = 0;
        for(int i = 0; i < qtyOrdered; i++){
            sum+=itemsOrdered[i].getCost();
        }
        return sum;
    }

    public void printOrder(){
        System.out.println("***********************************Order*********************************");
        this.dateOrderd.print();
        for(int i = 0; i < qtyOrdered; i++){
            System.out.println((i + 1) + "DVD - " +
                    itemsOrdered[i].getTitle() + " - " +
                    itemsOrdered[i].getCategory() + " - " +
                    itemsOrdered[i].getDirector() + " - " +
                    itemsOrdered[i].getLength() + " : " +
                    itemsOrdered[i].getCost());
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("*************************************************************************");
    }

    public DigitalVideoDisc getALuckyItem(){
        double doublenumber = Math.random();
        int luckynumber = (int) doublenumber;
        luckynumber = luckynumber%qtyOrdered;
        itemsOrdered[luckynumber].setCost(0);
        return itemsOrdered[luckynumber];
    }
}
