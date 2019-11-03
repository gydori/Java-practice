package stream;

import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 3, 5, 7, 9);
        Stream<String> stringStream = Stream.of("kolbasz", "Szalonna", "Virsli");
        char c = 'c';
        Stream<Character> characterStream = Stream.of('a', 'b', c);
    }
}
