package WildcardGenericsExample.Unbounded;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 7);
        List<String> words = Arrays.asList("apple", "banana", "pear");
        printList(words);
        printList(numbers);
    }

    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    
}
