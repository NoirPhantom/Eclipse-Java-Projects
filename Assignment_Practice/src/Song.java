
public class Song {
	private String title;
	private int duration;

	public Song(String title, int duration) {
		this.title = title;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDruration() {
		return duration;
	}

	public void setDruration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [druration = " + duration + ", title = " + title + "]";
	}

	public Object get(int i) {
		return null;
	}

}
