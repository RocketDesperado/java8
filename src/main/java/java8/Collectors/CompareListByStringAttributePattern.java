package java8.Collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import objectsToTests.Person;

public class CompareListByStringAttributePattern {

	public static void main(String[] args) {
		Person person1 = new Person("Leha");
		Person person2 = new Person("Sergey");
		Person person3 = new Person("Andrew");
		Person person4 = new Person("Serardo");

		List<Person> listOfPersons = new ArrayList<Person>();
		listOfPersons.add(person1);
		listOfPersons.add(person2);
		listOfPersons.add(person3);
		listOfPersons.add(person4);

		listOfPersons.forEach(x -> System.out.print(x.getName() + " "));
		System.out.println();

		List<Person> listOfPersons2 = listOfPersons.stream()
				.sorted(Comparator.<Person, Boolean>comparing(s -> s.getName().contains("Ser")).reversed()
						.thenComparing((x1, x2) -> x1.getName().compareTo(x2.getName())))
				.collect(Collectors.toList());
		listOfPersons2.forEach(x -> System.out.print(x.getName() + " "));

	}

}
