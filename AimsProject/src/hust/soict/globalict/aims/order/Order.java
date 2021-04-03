package hust.soict.globalict.aims.order;

import java.util.ArrayList;
import java.util.Collection;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.utils.MyDate;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITED_ORDERS = 5;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
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
    public void addMedia(Media x) {
    	itemsOrdered.add(x);
    }
    public void removeMedia(Media x) {
    	while(itemsOrdered.contains(x) == true) {
    		itemsOrdered.remove(x);
    	}
    }
    
   public float totalCost() {
	   float sum = 0;
	   for(Media x : itemsOrdered) {
		   sum += x.getCost();
	   }
	   return sum;
   }
}
