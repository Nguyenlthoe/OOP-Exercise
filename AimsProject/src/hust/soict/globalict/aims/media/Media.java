package hust.soict.globalict.aims.media;

public abstract class  Media implements Comparable<Media>{
	private static int rid = 0;
	private int id;
	private String title;
	private String category;
	private float cost;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public int getId() {
		return id;
	}
	public float getCost() {
		return cost;
	}
	public boolean equals(Media a) {
		if(a.getId() == this.id) {
			return true;
		} else return false;
	}
	public Media() {
		// TODO Auto-generated constructor stub
		id = rid;
		rid++;
	}

	public Media(String title) {
		this.title = title;
		id = rid;
		rid++;
	}

	public Media(String title, String category) {
		this.title = title;
		this.category = category;
		id = rid;
		rid++;
	}
	public Media(String title, String category,float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		id = rid;
		rid++;
	}
	public void display() {
		System.out.println(getTitle() + " - " + getCategory() + " - " + getCost());
	}
	public int compareTo(Media a) {
		return this.title.compareTo(a.getTitle());
	}
	public String strdisplay(){
		String a = getTitle() + " - " + getCategory() + " - " + getCost();
		return a;
	}
}
