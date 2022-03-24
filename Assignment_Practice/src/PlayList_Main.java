import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlayList_Main {

	private static LinkedList<PlayList> songs = new LinkedList<>();

	public static void main(String[] args) {

		PlayList songs = new PlayList("Kill Em All", "ACDC");
		songs.addSong("Seek & Destory", 12);
		songs.addSong("Ride The Lightin", 13);
		songs.addSong("Seek & Destory", 14);
		songs.add(songs);

		songs = new PlayList("Death Magnectis", "Metallica");
		songs.addSong("The Day That Never Comes", 123);
		songs.addSong("All NIghtmare Long", 123);
		songs.addSong("Blood and scared", 123);
		songs.add(songs);

	}

	public static void play(LinkedList<Song> playlist) {

		Scanner scanner = new Scanner(System.in);
		boolean forward = true;
		boolean isQuit = false;

		ListIterator<Song> listIterator = playlist.listIterator();

		if (playlist.size() == 0) {
			System.out.println("NO SONG IN PLAYLIST");
		} else {
			System.out.println("NOW PLAYING " + listIterator.next().toString());
			printMenu();
		}

		while (!isQuit) {
			int choose = scanner.nextInt();
			scanner.nextLine();

			switch (choose) {
				case 0:
					System.out.println("Playlist is Done");
					isQuit = true;
					break;
				case 1:
					if (!forward) {
						if (listIterator.hasNext()) {
							listIterator.next();
						}
						forward = true;
					}
					if (listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next().toString());
					} else {
						System.out.println("We have reached the end of the playlist");
						forward = false;
					}
					break;
				case 2:
					if (forward) {
						if (listIterator.hasPrevious()) {
							listIterator.previous();
						}
						forward = false;
					}
					if (listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous().toString());
					} else {
						System.out.println("We are at the start of the playlist");
						forward = true;
					}
					break;
				case 3:
					if (forward) {

						if (listIterator.hasPrevious()) {
							System.out.println("Now replaying " + listIterator.previous().toString());
							forward = false;
						} else {
							System.out.println("We are at the start of the list");
						}
					} else {
						if (listIterator.hasNext()) {
							System.out.println("Now replaying " + listIterator.next().toString());
							forward = true;
						} else {
							System.out.println("We have reached the end of the list");
						}
					}
					break;
				case 4:
					printListPlaylist(playlist);
					break;
				case 5:
					printMenu();
					break;

				case 6:
					if (playlist.size() > 0) {
						listIterator.remove();
						if (listIterator.hasNext()) {
							System.out.println("Now playing " + listIterator.next());
						} else if (listIterator.hasPrevious()) {
							System.out.println("Now playing " + listIterator.previous());
						}
					}
					break;
			}
		}
		scanner.close();
	}

	public static void printListPlaylist(LinkedList<Song> playlist) {
		System.out.println("============ playlist =================");

		Iterator<Song> i = playlist.iterator();
		int j = 0;
		while (i.hasNext()) {

			j++;
			Song currentSong = i.next();
			System.out.println(j + ": " + currentSong.getTitle());
		}
		System.out.println("=============================");

	}

	private static void printMenu() {
		System.out.println("Available actions:\npress");
		System.out.println("0 - to quit\n" +
				"1 - to play next song\n" +
				"2 - to play previous song\n" +
				"3 - to replay the current song\n" +
				"4 - list songs in the playlist\n" +
				"5 - print available actions.\n" +
				"6 - delete current song from playlist");
	}
}
