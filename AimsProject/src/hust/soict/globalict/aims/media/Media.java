package hust.soict.globalict.aims.media;

public class Media {
	private String title;
	private String category;
	private float cost;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Media() {
		// TODO Auto-generated constructor stub
	}

	public Media(String title) {
		this.title = title;
	}

	public Media(String title, String category) {
		this.title = title;
		this.category = category;
	}
}