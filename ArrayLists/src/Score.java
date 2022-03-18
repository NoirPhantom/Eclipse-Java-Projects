import java.util.ArrayList;

public class Score {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<Integer>();

        System.out.println(scores.size());

        scores.add(2);

        scores.add(5);

        scores.add(2);

        scores.add(3);

        scores.add(0, 56);

        System.out.println(scores.size());

        // For-each loop
        for (Integer a : scores) {

            System.out.println("Index value: " + a);
        }

        System.out.println(scores.isEmpty());

        // int[] scoresArray = new int[5];
        // System.out.println(scoresArray.length);

        ArrayList<String> planets = new ArrayList<String>();

        System.out.println(planets.size());

        planets.add("Earth");

        planets.add(0, "Mercury");

        planets.add(1, "Venus");

        planets.add("Mars");

        planets.add("Jupiter");

        planets.add("Uranus");

        planets.add(5, "Saturn");

        planets.add("Neptune");

        planets.add("Pluto");

        System.out.println(planets.size());

        for (String planet : planets) {
            System.out.println("Planet: " + planet);
        }

        System.out.println(planets.isEmpty());

    }
}
