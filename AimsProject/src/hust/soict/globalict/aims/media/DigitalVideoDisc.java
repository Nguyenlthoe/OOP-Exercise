package hust.soict.globalict.aims.media;
public class DigitalVideoDisc extends Media{

    private String director;
    private int length;
    public DigitalVideoDisc() {
        super();
    }

    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category) {
        super(title,category);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void display() {
    	System.out.println(getTitle() + " - " + getCategory() + " - " + getDirector()+ " - " + getLength()+ " - " + getCost());
    }
}