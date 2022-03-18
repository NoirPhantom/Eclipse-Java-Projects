import java.util.ArrayList;
import java.util.HashSet;

public class Collections {
    public static void main(String[] args) {

        ArrayList<String> tvShows = new ArrayList<String>();

        tvShows.add("Prison Break");
        tvShows.add("Blue Collar");
        tvShows.add("Friends");
        tvShows.add("Blue Collar");

        System.out.println(tvShows);

        HashSet<String> uniqueTvShows = new HashSet<String>(tvShows);

        System.out.println(uniqueTvShows);

    }
}
