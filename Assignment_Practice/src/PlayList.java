
import java.util.LinkedList;

public class PlayList {
	private String name;
	private String artist;
	LinkedList<Song> playList = new LinkedList<>();

	public PlayList(String name, String artist) {
		this.name = name;
		this.artist = artist;
		System.out.println("New song added to playlist");
	}

	public LinkedList<Song> getPlayList() {
		return playList;
	}

	public void setPlayList(LinkedList<Song> playList) {
		this.playList = playList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addSong(String name, int duration) {
		playList.add(new Song(name, duration));
		System.out.println("new song " + name + ": " + duration + "s" + " added to album " + this.name);
	}

	public void getSongsFromInside() {

		for (int i = 0; i < this.playList.size(); i++) {
			System.out.println("    " + this.playList.get(i).getTitle());
		}
	}

	private Song findSong(String name) {

		for (Song checkedSong : this.playList) {
			if (checkedSong.getTitle().equals(name)) {
				return checkedSong;
			}
		}
		return null;
	}

	public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {

		int index = trackNumber - 1;
		if ((index > 0) && (index <= this.playList.size())) {

			playlist.add(this.playList.get(index));
			return true;
		}
		System.out.println("this album does not contain track no: " + trackNumber);
		return false;
	}

	public boolean addToPlaylist(String songTitle, LinkedList<Song> playlist) {

		Song checkedSong = findSong(songTitle);
		if (checkedSong != null) {

			playlist.add(checkedSong);
			System.out.println("Song " + songTitle + " added to playlist");
			return true;
		}
		System.out.println("Can not find song");
		return false;
	}

	public void add(PlayList songs) {
	}

	public PlayList get(int i) {
		return null;
	}
}
