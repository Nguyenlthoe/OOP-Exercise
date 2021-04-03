package hust.soict.globalict.aims.media;

import java.awt.image.TileObserver;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media{

	private List<String> author = new ArrayList<String>();
	public Book() {

	}
	
	public Book(String title) {
		super(title);
	}
	public Book(String title, String category) {
		super(title,category);
	}
	public List<String> getAuthor() {
		return author;
	}
	public void setAuthor(List<String> author) {
		this.author = author;
	}
	
	public void addAuthor(String authorName) {
		if(this.author.contains(authorName) == true) {
			return ;
		} else {
			this.author.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		if(this.author.contains(authorName) == true) {
			this.author.remove(authorName);
		}
	}
	public void display() {
		System.out.println(getTitle() + " - " + getCategory() + " - " + getAuthor()+ " - " + getCost());
	}
}
