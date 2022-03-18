import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map.Entry;

public class Weather {
    public static void main(String[] args) {
        HashMap<String, Float> weather = new HashMap<>();

        weather.put("Wind", 55f);
        weather.put("minTemperature", 20.5f);
        weather.put("maxTemperature", 50.8f);
        weather.put("humidity", 50.0f);
        weather.put("airPressure", 12f);

        // for (HashMap.Entry<String, Float> set : weather.entrySet()) {
        // System.out.println(set.getKey() + " : " + set.getValue());
        // }

        weather.forEach((key, value) -> System.out.println(key + " : " + value));

        // Iterator<Entry<String, Float>> new_Iterator = weather.entrySet().iterator();

        // while (new_Iterator.hasNext()) {
        // HashMap.Entry<String, Float> new_HashMap = (HashMap.Entry<String, Float>)
        // new_Iterator.next();
        // System.out.println(new_HashMap.getKey() + " : " + new_HashMap.getValue());
        // }

        // weather.forEach((key, value) -> System.out.println(key + " : " + value));

        weather.put("Wind", 32f);
        weather.remove("airPressure");

        System.out.println(weather);

        weather.clear();

        System.out.println(weather);
    }
}
