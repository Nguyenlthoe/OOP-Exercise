package hust.soict.globalict.aims;

import hust.soict.globalict.aims.utils.*;
import hust.soict.globalict.aims.order.*;
import hust.soict.globalict.aims.disc.*;


public class Aims {
	public static void main(String[] args) {
		MyDate firstday = new MyDate(11,7,2020);
		Order anOrder = new Order(firstday);
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George lucas");
		dvd2.setLength(124);
		anOrder.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd3);

//		System.out.print("Total Cost is: ");
//		System.out.println(anOrder.totalCost());
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Bo gia");
		dvd4.setCost(13.3f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Fast and furius");
		dvd5.setCost(15.36f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Frozen");
		dvd6.setCost(24.31f);
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Avegers: Endgame");
		dvd7.setCost(19.33f);
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Spiderman: Far from home");
		dvd8.setCost(23.33f);
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Aquaman");
		dvd9.setCost(24.3f);
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("Doraemon and Nobita");
		dvd10.setCost(24.3f);
		DigitalVideoDisc dvd11 = new DigitalVideoDisc("Star War");
		dvd11.setCost(24.3f);
		DigitalVideoDisc[] listdvd = new DigitalVideoDisc[8];
		listdvd[0] = dvd4;
		listdvd[1] = dvd5;
		listdvd[2] = dvd6;
		listdvd[3] = dvd7;
		listdvd[4] = dvd8;
		listdvd[5] = dvd9;
		listdvd[6] =dvd10;
		listdvd[7] = dvd11;
//		anOrder.addDigitalVideoDisc(listdvd);
//		anOrder.printOrder();
//		anOrder.removeDigitalVideoDisc(dvd2);
//		System.out.println("The number of Disc in the Order is: " + anOrder.getQtyOrdered());
		MyDate seconday = new MyDate(31,7,2021);
		Order oder2 = new Order(seconday);
		for(int i = 0; i < 3; i++){
			oder2.addDigitalVideoDisc(listdvd[i]);
		}
		MyDate thirday = new MyDate(17,7,2021);
		Order oder3 = new Order(thirday);
		for(int i = 3; i < 4; i++){
			oder3.addDigitalVideoDisc(listdvd[i]);
		}
		MyDate fourday = new MyDate(12,7,2021);
		Order oder4 = new Order(seconday);
		for(int i = 4; i < 5; i++){
			oder4.addDigitalVideoDisc(listdvd[i]);
		}
		MyDate fiveday = new MyDate(23,7,2021);
		Order oder5 = new Order(seconday);
		for(int i = 5; i < 7; i++){
			oder5.addDigitalVideoDisc(listdvd[i]);
		}
		MyDate sixday = new MyDate(20,7,2021);
		Order oder6 = new Order(seconday);
		oder2.printOrder();
		oder3.printOrder();
		oder4.printOrder();
		oder5.printOrder();
	}
}
