package hust.soict.globalict.aims.order;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Track;
import hust.soict.globalict.aims.utils.MyDate;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITED_ORDERS = 5;
    private List<Media> itemsOrdered = new ArrayList<Media>();
    public List<Media> getItemsOrdered() {
		return itemsOrdered;
	}

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
    public void removeMedia(int id) {
    	itemsOrdered.remove(id);
    }
   public float totalCost() {
	   float sum = 0;
	   for(Media x : itemsOrdered) {
		   sum += x.getCost();
	   }
	   return sum;
   }
   
   public void Display() {
	   for(Media x : itemsOrdered) {
		   x.display();
	   }
   }
   public void sortMedia() {
	   Collections.sort(itemsOrdered, new Comparator<Media>() {
		   public int compare(Media a,Media b) {
			   return a.getTitle().compareTo(b.getTitle());
		   }

	});
   }
}
