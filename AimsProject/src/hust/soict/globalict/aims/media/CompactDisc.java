package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
		super();
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
	public void play() {
		for(Track i : tracks) {
			i.play();
		}
	}
}
