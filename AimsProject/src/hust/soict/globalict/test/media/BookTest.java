package hust.soict.globalict.test.media;

import hust.soict.globalict.aims.media.Book;

public class BookTest {

	public static void main(String args[]) {
		Book a = new Book("Harry Potter","Aventure",32.3f);
		a.setContent("The cat didnt move It just gave him a stern look Was this normal cat behavior Mr Dursley wondered Trying to pull himself together he let himsel into the house He was still determined not to mention anything to his wife");
		a.processContent();
		System.out.println(a.toString());
	}
}
