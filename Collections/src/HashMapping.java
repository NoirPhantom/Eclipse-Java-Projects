import java.util.HashMap;

public class HashMapping {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Vishal", 10);
        map.put("Sachin", 30);
        map.put("Vaibhav", 20);

        System.out.println("Size of map is: " + map.size());

        System.out.println(map);

        if (map.containsKey("Vishal")) {
            Integer a = map.get("Vishal");

            System.out.println("Value for key " + "Vishal is: " + a);
        }
    }
}
