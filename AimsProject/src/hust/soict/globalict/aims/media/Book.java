package hust.soict.globalict.aims.media;


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
	public Book(String title, String category,float cost) {
		super(title,category,cost);
	}
	public void getAuthor() {
		for(String x : author) {
			System.out.print(x + "/");
		}
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
		System.out.print("Book: "+getTitle() + " - " + getCategory() + " - ");
		getAuthor();
		System.out.println(" : " + getCost());
	}
}
