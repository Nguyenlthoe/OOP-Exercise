package hust.soict.globalict.aims.media;

public class Disc extends Media {
	
	private int lenght;
	private String director;
	public int getLenght() {
		return lenght;
	}
	public String getDirector() {
		return director;
	}
	public Disc() {
		// TODO Auto-generated constructor stub
	}
	public Disc(int lenght, String director) {
		super();
		this.lenght = lenght;
		this.director = director;
	}
	public Disc(String title) {
		super(title);
	}
	public Disc(String title, String category) {
		super(title, category);
	}

}
