package hust.soict.globalict.test.media;

import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class TestMediaCompareTo {

	public static void main(String args[]) {
		java.util.Collection collection = new java.util.ArrayList();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",null,87,21.5f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","direction",null,124,23.59f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation",null,90,21.5f);
		collection.add(dvd2);
		collection.add(dvd1);
		collection.add(dvd3);
		
		java.util.Iterator iterator = collection.iterator();
		System.out.println("-------------------------------------------");
		System.out.println("The DVDs currently in the order are: ");
		
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
			
		}
		
		java.util.Collections.sort((java.util.List)collection);
		
		iterator = collection.iterator();
		System.out.println("-------------------------------------------");
		System.out.println("The DVDs is sorted order are: ");
		
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
			
		}
		
	}

}
