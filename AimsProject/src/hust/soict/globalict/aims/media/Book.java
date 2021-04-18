package hust.soict.globalict.aims.media;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Book extends Media{
	private String content;
	private List<String> contentTokens;
	private Map<String,Integer> wordFrequency = new HashMap<String,Integer>();
	public String getContent() {
		return content;
	}


	public  void processContent() {
		contentTokens = Arrays.asList(content.toUpperCase().split(" "));
		Collections.sort(contentTokens,new Comparator<String>() {
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});
		for(String w : contentTokens) {
			if(wordFrequency.containsKey(w) == true) {
				wordFrequency.put(w, wordFrequency.get(w) + 1);
			} else {
				wordFrequency.put(w, 1);
			}
		}
	}
	public void setContent(String content) {
		this.content = content;
		//processContent();
		
	}
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
	public String toString() {
		String a = "";
		a += getTitle() + "\n";
		a += getCategory() + "\n";
		a +="Length of content : " + getContent().length() + "\n";
		Set<String> set = wordFrequency.keySet();
		for(String w : set) {
			a += w + ": " + wordFrequency.get(w) + "\n";
		}
		return a;
	}
}
