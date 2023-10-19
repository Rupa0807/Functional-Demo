package Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTut {
	
	public static void main(String[] args) {

	String[] arr = { "A", "B", "C", "D" };
	Stream.of(arr).forEach(System.out::print);

	Stream<String> stream = Arrays.stream(arr);
	stream.forEach(System.out::println);
	
	
	ArrayList<Integer> numbersList
	= new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
	}
}
