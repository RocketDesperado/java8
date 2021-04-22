package java8.immutableLists;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Execute {
	
	public static void main(String[] args) {
		List<String> immutableList = Arrays.asList("a","W","C","b");
		Comparator<String> strComparator = (h1, h2) -> h1.toLowerCase().compareTo(h2.toLowerCase());
		immutableList.stream().sorted(strComparator).forEach(System.out::println);
		immutableList.sort(strComparator);
		Collections.sort(immutableList);
		
		immutableList.stream().forEach(System.out::println);
	}

}
