import java.util.ArrayList;
//import java.util.ListIterator;

public class TVShows {
    public static void main(String[] args) {

        ArrayList<String> tvShows = new ArrayList<String>();

        tvShows.add("The Office");
        tvShows.add("Brooklyn Nine-Nine");
        tvShows.add("Suits");
        tvShows.add("Lucifer");
        tvShows.add("SWAT");
        tvShows.add("Good Doctor");
        tvShows.add("NCIS");
        tvShows.add("Blue Collar");

        // for (int i = 0; i <= tvShows.size() - 1; i++) {
        // System.out.println(tvShows.get(i));
        // }

        for (String show : tvShows) {
            System.out.println(show);
        }

        // ListIterator iterate = tvShows.listIterator();
        // while (iterate.hasNext()) {
        // System.out.println(iterate.next());
        // }

        // tvShows.forEach(tvShow -> System.out.println(tvShow));

        System.out.println(tvShows);
        System.out.println(tvShows.contains("Friends"));
        System.out.println(tvShows.get(0));
        System.out.println(tvShows.get(tvShows.size() - 1));

        tvShows.set(5, "Supernatural");
        System.out.println(tvShows);

        tvShows.add(0, "The Nanny");
        System.out.println(tvShows);

        System.out.println(tvShows.isEmpty());
        System.out.println("TV Shows Array List size is: " + tvShows.size());
    }
}
