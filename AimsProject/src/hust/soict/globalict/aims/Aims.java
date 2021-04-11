package hust.soict.globalict.aims;

import hust.soict.globalict.aims.utils.*;
import hust.soict.globalict.aims.order.*;

import java.util.Scanner;

import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.media.DigitalVideoDisc;


public class Aims {
	public static void main(String[] args) {
//		Scanner keybroad = new Scanner(System.in);
//		int a = 0;
//		int choose;
//		Order anOrder = null;
//		while(a == 0) {
//			showMenu();
//			choose = keybroad.nextInt();
//			keybroad.nextLine();
//			switch(choose) {
//				case 1:
//					anOrder = new Order();
//					System.out.println("New order was created!");
//					break;
//				case 2:
//					int k;
//					System.out.println("DigitalVideoDisc or Book: \n1.DigitalVideoDisc \n2.Book\n3.Media\nPlease choose a number: 1-2-3 ");
//					k = keybroad.nextInt();
//					keybroad.nextLine();
//					if(k==1) {
//						DigitalVideoDisc media = new DigitalVideoDisc();
//						System.out.println("Enter title:");
//						media.setTitle(keybroad.nextLine());
//						System.out.println("Enter category:");
//						media.setCategory(keybroad.nextLine());
//						System.out.println("Enter cost:");
//						media.setCost(keybroad.nextFloat());
//						keybroad.nextLine();
//						System.out.println("Enter length:");
//						media.setLength(keybroad.nextInt());
//						keybroad.nextLine();
//						System.out.println("Enter directory:");
//						media.setDirector(keybroad.nextLine());
//						anOrder.addMedia(media);
//					} else if(k==2) {
//						Book media = new Book();
//						System.out.println("Enter title:");
//						media.setTitle(keybroad.nextLine());
//						System.out.println("Enter category:");
//						media.setCategory(keybroad.nextLine());
//						System.out.println("Enter cost:");
//						media.setCost(keybroad.nextFloat());
//						keybroad.nextLine();
//						System.out.println("Enter author: ");
//						media.addAuthor(keybroad.nextLine());
//						anOrder.addMedia(media);
//					} else {
//						Media media = new Media();
//						System.out.println("Enter title:");
//						media.setTitle(keybroad.nextLine());
//						System.out.println("Enter category:");
//						media.setCategory(keybroad.nextLine());
//						System.out.println("Enter cost:");
//						keybroad.nextLine();
//						anOrder.addMedia(media);
//					}
//					break;
//				case 3:
//					int id;
//					System.out.println("Enter item for delete by id: ");
//					id = keybroad.nextInt();
//					keybroad.nextLine();
//					anOrder.removeMedia(id);
//					break;
//				case 4:
//					System.out.println("Your order: ");
//					anOrder.Display();
//					break;
//				case 0:
//					a = 1;
//					break;
//			}
//		}
//		MyDate firstday = new MyDate(11,7,2020);
//		Order anOrder = new Order(firstday);
//		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
//		dvd1.setCategory("Animation");
//		dvd1.setCost(19.95f);
//		dvd1.setDirector("Roger Allers");
//		dvd1.setLength(87);
//
//		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
//		dvd2.setCategory("Science Fiction");
//		dvd2.setCost(24.95f);
//		dvd2.setDirector("George lucas");
//		dvd2.setLength(124);
//
//		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
//		dvd3.setCategory("Animation");
//		dvd3.setCost(18.99f);
//		dvd3.setDirector("John Musker");
//		dvd3.setLength(90);
//		
//		Book book1 = new Book("Harry Potter");
//		book1.addAuthor("J.K.Rowling");
//		book1.setCost(27.3f);
//		anOrder.addMedia(dvd2);
//		anOrder.addMedia(dvd3);
//		anOrder.addMedia(dvd1);
//		anOrder.addMedia(book1);
//		anOrder.addMedia(dvd2);
//		
//		System.out.println("Total cost is: " + anOrder.totalCost());
//		anOrder.removeMedia(dvd2);
//		System.out.println("Total cost is: " + anOrder.totalCost());
	}
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
}
	
