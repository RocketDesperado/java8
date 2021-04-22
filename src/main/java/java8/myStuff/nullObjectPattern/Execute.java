package java8.myStuff.nullObjectPattern;

import java.util.stream.Stream;

public class Execute {

	public static void main(String[] args) {
		NullObjectPattern obj = NullObjectPattern.dummy;
		
		Stream.generate(Math::random).limit(10).forEach(System.out::println);
	}
	
}
