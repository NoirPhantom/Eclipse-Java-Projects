
public class EBook extends Book {

	private String link;
	private float fileSize;

	public EBook(long isbn, String title, String link, float fileSize) {
		super(isbn, title);
		this.link = link;
		this.fileSize = fileSize;
	}

	public EBook(long isbn, String title, String author, String link, float fileSize) {
		super(isbn, title, author);
		this.link = link;
		this.fileSize = fileSize;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public float getFileSize() {
		return fileSize;
	}

	public void setFileSize(float fileSize) {
		this.fileSize = fileSize;
	}

	public String ebookProvider() {

		return "Amazon Kindle";
	}

	@Override
	public String generateID() {

		return this.title + " - " + this.isbn + " - " + this.fileSize;
	}

}
