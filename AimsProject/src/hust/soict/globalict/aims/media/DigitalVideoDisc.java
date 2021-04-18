package hust.soict.globalict.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{
    public DigitalVideoDisc(String title, String category,String director,int lenght,float cost) {
    	super(title,category,director,lenght,cost);
    }
    public DigitalVideoDisc(String title) {
        super(title);
    }
    
    public DigitalVideoDisc(String title, String category) {
        super(title,category);
    }

    
    public void display() {
    	System.out.println("DigitalVideoDisc: "+getTitle() + " - " + getCategory() + " - " + getDirector()+ " - " + getLength()+ " : " + getCost());
    }
    public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public void play() {
    	System.out.println("Playing DVD: " + this.getTitle());
    	System.out.println("DVD length: " + this.getLength());
    }
	public int compareTo(Media a) {
		return (int)(this.getCost() - a.getCost());
	}
}