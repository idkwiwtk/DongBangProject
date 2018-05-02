package book;

public class Book {
	private String author;
	private String publisher;
	private int pages;
	private String title;
	private String category;
	private int level;
	// setter method
	public void setAuthor(String author) {this.author = author;}
	public void setPublisher(String publisher) {this.publisher = publisher;}
	public void setPages(int pages) {this.pages = pages;}
	public void setTitle(String title) {this.title = title;}
	public void setCategory(String category) {this.category = category;}
	public void setLevel(int level) {this.level= level;}
	//  getter method
	public String getAuthor() {return author;}
	public String getPublisher() {return publisher;}
	public int getPages() {return pages;}
	public String getTitle() {return title;}
	public String getCategory() {return category;}
	public int getLevel() {return level;}
	// constructor
	public Book(String author, String publisher, int pages, String title, String category, int level)
	{
		this.author = author;
		this.publisher = publisher;
		this.pages = pages;
		this.title = title;
		this.category = category;
		this.level = level;
	}
}
