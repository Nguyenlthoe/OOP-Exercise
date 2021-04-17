package hust.soict.globalict.aims.media;

public class Track implements Playable,Comparable<Track>{


	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	public Track() {
		// TODO Auto-generated constructor stub
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	public boolean equals(Track a) {
		if(this.title.equals(a.getTitle()) && this.length == a.getLength()) {
			return true;
		} else return false;
	}

	@Override
	public int compareTo(Track c) {
		// TODO Auto-generated method stub
		return title.compareTo(c.getTitle());
	}
}
