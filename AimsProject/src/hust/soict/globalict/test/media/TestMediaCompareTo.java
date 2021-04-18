package hust.soict.globalict.test.media;

import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Track;

public class TestMediaCompareTo {

	public static void main(String args[]) {
		java.util.Collection collection = new java.util.ArrayList();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",null,87,21.5f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","direction",null,124,27.59f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation",null,90,19.7f);
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
//		test sort CompactDisc		
//		java.util.Collection collection = new java.util.ArrayList();
//		CompactDisc cd1 = new CompactDisc("IBM Symphony");
//		cd1.addTrack(new Track("Warmup",3));
//		
//		CompactDisc cd2 = new CompactDisc("He He");
//		cd2.addTrack(new Track("Introduction",6));
//		cd1.addTrack(new Track("Scales",4));
//		cd1.addTrack(new Track("minerswiper", 5));
//		collection.add(cd1);
//		collection.add(cd2);
//		java.util.Collections.sort((java.util.List)collection);
//		java.util.Iterator iterator = collection.iterator();
//		iterator = collection.iterator();
//		System.out.println("-------------------------------------------");
//		System.out.println("The CD is sorted order are: ");
//		
//		while(iterator.hasNext()) {
//			System.out.println(((CompactDisc)iterator.next()).getArtist());
//			
//		}
	}

}
