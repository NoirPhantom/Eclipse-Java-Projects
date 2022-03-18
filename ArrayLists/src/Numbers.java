import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(24);
        numbers.add(92);
        numbers.add(49);
        numbers.add(77);
        numbers.add(88);
        numbers.add(97);
        numbers.add(31);
        numbers.add(45);

        System.out.println("Before sorting: \n" + numbers);

        Collections.sort(numbers);

        System.out.println("After sorting: \n" + numbers);

        Iterator<Integer> numbersIterator = numbers.listIterator();
        Integer num;
        while (numbersIterator.hasNext()) {
            num = numbersIterator.next();
            if (num % 2 == 0) {
                numbersIterator.remove();
            }
        }

        Collections.sort(numbers);

        System.out.println("List after removing even numbers: \n" + numbers);

    }
}
