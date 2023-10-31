public class DigitalVideoDisc {
	// các thuộc tính của lớp
	private String title;// Tên của đĩa
	private String category;// Thể loại của đĩa
	private String directory;//Đạo diễn của đĩa
	private int lenght;//Thời gian của đĩa
	private float cost;//Giá tiền của đĩa
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc( String category,String title, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String directory, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title, String category, String directory, int lenght, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.lenght = lenght;
		this.cost = cost;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getDirectory() {
		return directory;
	}
	public int getLenght() {
		return lenght;
	}
	public float getCost() {
		return cost;
	}

	
}