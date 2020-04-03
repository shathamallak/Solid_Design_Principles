package solid.singleresponsibility.wrong;

public class Book {
	
	private String title;
	private int version;
	
	private String author1Name;
	private String author1Email;
	private Gender author1Gender;
	
	
	private String author2Name;
	private String author2Email;
	private Gender author2Gender;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getAuthor1Name() {
		return author1Name;
	}
	public void setAuthor1Name(String author1Name) {
		this.author1Name = author1Name;
	}
	public String getAuthor1Email() {
		return author1Email;
	}
	public void setAuthor1Email(String author1Email) {
		this.author1Email = author1Email;
	}
	public Gender getAuthor1Gender() {
		return author1Gender;
	}
	public void setAuthor1Gender(Gender author1Gender) {
		this.author1Gender = author1Gender;
	}
	public String getAuthor2Name() {
		return author2Name;
	}
	public void setAuthor2Name(String author2Name) {
		this.author2Name = author2Name;
	}
	public String getAuthor2Email() {
		return author2Email;
	}
	public void setAuthor2Email(String author2Email) {
		this.author2Email = author2Email;
	}
	public Gender getAuthor2Gender() {
		return author2Gender;
	}
	public void setAuthor2Gender(Gender author2Gender) {
		this.author2Gender = author2Gender;
	}
	
	

}
