package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		super();
	}
	public CompactDisc(String title,String category,float cost) {
		super(title,category,cost);
	}
	public CompactDisc(String title, String category, String director,float cost,String artist) {
		super(title,category,director,cost);
		this.artist = artist;
	}
	public CompactDisc(String artist) {
		super();
		this.artist = artist;
	}
	public void addTrack(Track a) {
		if(tracks.contains(a) == true) {
			return ;
		} else {
			tracks.add(a);
		}
	}
	public void removeTrack(Track a) {
		if(tracks.contains(a) == true) {
			tracks.remove(a);
		}
	}
	public int getLength() {
		int sum = 0;
		for(Track a : tracks) {
			sum += a.getLength();
		}
		return sum;
	}
	public String getArtist() {
		return artist;
	}
	public void play() {
		for(Track i : tracks) {
			i.play();
		}
	}
	public void display() {
		System.out.println("CompactDisc: " + getTitle() +  " - " + getCategory() + " - " + getDirector() + " - " + getArtist() + " - " + getLength()  + " : " + getCost());
	}
}
