package hust.soict.globalict.aims;

import hust.soict.globalict.aims.utils.*;
import hust.soict.globalict.aims.order.*;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.media.DigitalVideoDisc;


public class Aims {
	public static void main(String[] args) {
		MyDate firstday = new MyDate(11,7,2020);
		Order anOrder = new Order(firstday);
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George lucas");
		dvd2.setLength(124);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		
		Book book1 = new Book("Harry Potter");
		book1.addAuthor("J.K.Rowling");
		book1.setCost(27.3f);
		anOrder.addMedia(dvd2);
		anOrder.addMedia(dvd3);
		anOrder.addMedia(dvd1);
		anOrder.addMedia(book1);
		anOrder.addMedia(dvd2);
		
		System.out.println("Total cost is: " + anOrder.totalCost());
		anOrder.removeMedia(dvd2);
		System.out.println("Total cost is: " + anOrder.totalCost());
	}
}
	
