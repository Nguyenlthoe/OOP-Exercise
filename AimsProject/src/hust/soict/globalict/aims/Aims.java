package hust.soict.globalict.aims;

import hust.soict.globalict.aims.utils.*;
import hust.soict.globalict.aims.order.*;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.media.DigitalVideoDisc;


public class Aims {
	public static void main(String[] args) {
		MemoryDeamon deamon = new MemoryDeamon();
		Scanner keybroad = new Scanner(System.in);
		int a = 0;
		int choose;
		Order anOrder = null;
		while(a == 0) {
			deamon.run();
			showMenu();
			choose = keybroad.nextInt();
			keybroad.nextLine();
			switch(choose) {
				case 1:
					anOrder = new Order();
					System.out.println("New order was created!");
					break;
				case 2:
					int k;
					System.out.println("Choose your option: \n1.DigitalVideoDisc \n2.Book\n3.CompactDisc\nPlease choose a number: 1-2-3 ");
					k = keybroad.nextInt();
					keybroad.nextLine();
					if(k==1) {
						String title;
						String category;
						String director;
						int lenght;
						float cost;
						System.out.println("Enter the title: ");
						title = keybroad.nextLine();
						System.out.println("Enter the category: ");
						category = keybroad.nextLine();
						System.out.println("Enter the director: ");
						director = keybroad.nextLine();
						System.out.println("Enter the length: ");
						lenght = keybroad.nextInt();
						System.out.println("Enter the cost: ");
						cost = keybroad.nextFloat();
						keybroad.nextLine();
						DigitalVideoDisc dvd = new DigitalVideoDisc(title,category,director,lenght,cost);
						anOrder.addMedia(dvd);
						System.out.println("Do you like play this DigitalVideoDisc ?\n 1. Yes!\n 2. No, thanks!\nChoose your option: ");
						int m = keybroad.nextInt();
						keybroad.nextLine();
						if(m == 1) {
							dvd.play();
						}
					} else if(k==2) {
						String title;
						String category;
						float cost;
						String author;
						System.out.println("Enter the title: ");
						title = keybroad.nextLine();
						System.out.println("Enter the category: ");
						category = keybroad.nextLine();
						System.out.println("Enter the cost: ");
						cost = keybroad.nextFloat();
						keybroad.nextLine();
						Book book = new Book(title,category,cost);
						int b = 1;
						while(b == 1) {
							System.out.println("Add more author: \n1. Ok!\n2.No,thanks!\nEnter your option:");
							int c = keybroad.nextInt();
							keybroad.nextLine();
							if(c == 1) {
								System.out.println("Enter the author: ");
								author = keybroad.nextLine();
								book.addAuthor(author);
							} else {
								b = 0;
							}
						}
						anOrder.addMedia(book);
					} else {
						String title;
						String category;
						String artist;
						String director;
						float cost;
						System.out.println("Enter the title: ");
						title = keybroad.nextLine();
						System.out.println("Enter the category: ");
						category = keybroad.nextLine();
						System.out.println("Enter the cost: ");
						cost = keybroad.nextFloat();
						keybroad.nextLine();
						System.out.println("Enter the director: ");
						director = keybroad.nextLine();
						System.out.println("Enter the artist: ");
						artist = keybroad.nextLine();
						CompactDisc cpdvd = new CompactDisc(title,category,director,cost,artist);
						int b = 1;
						while(b == 1) {
							System.out.println("Add more track: \n1. Ok!\n2.No,thanks!\nEnter your option:");
							int c = keybroad.nextInt();
							keybroad.nextLine();
							if(c == 1) {
								System.out.println("Enter the title of track: ");
								String titleoftrack = keybroad.nextLine();
								System.out.println("Enter the lenght: ");
								int lenght = keybroad.nextInt();
								keybroad.nextLine();
								Track track = new Track(titleoftrack,lenght);
								cpdvd.addTrack(track);
							} else {
								b = 0;
							}
						}
						anOrder.addMedia(cpdvd);
						System.out.println("Do you like play this CompactDisc ?\n 1. Yes!\n 2. No, thanks!\nChoose your option: ");
						int m = keybroad.nextInt();
						keybroad.nextLine();
						if(m == 1) {
							cpdvd.play();
						}
					}
					break;
				case 3:
					int id;
					System.out.println("Enter item for delete by id: ");
					id = keybroad.nextInt();
					keybroad.nextLine();
					anOrder.removeMedia(id);
					break;
				case 4:
					System.out.println("Your order: ");
					anOrder.Display();
					break;
				case 5:
					anOrder.sortMedia();
					break;
				case 0:
					a = 1;
					deamon.run();
					break;
			}
			
		}
		System.out.println(anOrder.getItemsOrdered().get(0).getId());
		System.out.println(anOrder.getItemsOrdered().get(1).getId());
	}
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("5. Sort item");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
}
	
