package java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Execute {

	public static void main(String[] args) {

//		Logger logger = LoggerFactory.getLogger(Test.class);

//		Stream.generate(Math::random).limit(5).forEach(x -> {
//			x = x*10;
//			System.out.println(x.intValue());;
//		});

		List<String> strList = Arrays.asList("aaac", "b", "ttte", "diplo", "wer", "aaaabee");

		Consumer<String> printer = System.out::println;

//		strList.stream().sorted((x, y) -> {
//			return Integer.compare(x.length(), y.length());
//		}).forEach(printer);

//		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

//		strList.stream().sorted(Comparator.naturalOrder()).sorted(Comparator.reverseOrder()).forEach(printer);
//		strList.stream()

//		strList.stream().map(String::length).forEach(System.out::println);

//		strList.forEach(action);

	}
}
