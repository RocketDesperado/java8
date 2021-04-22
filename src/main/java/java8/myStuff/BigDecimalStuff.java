package java8.myStuff;

import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BigDecimalStuff {
	
	private static Logger log = Logger.getLogger(BigDecimalStuff.class.getName());

	private static void reduceSum() {
		List<BigDecimal> listOfBD = Stream.iterate(BigDecimal.ONE, val -> val.add(new BigDecimal("3"))).limit(20)
				.collect(Collectors.toList());

		BigDecimal result = listOfBD.stream().reduce(BigDecimal.ZERO, (val1, val2) -> {
			log.info("val1: " + val1 + " val2: " + val2);
			return val1.add(val2);
		});

		log.info("result: " + result);
	}

	public static void main(String[] args) {

		BigDecimalStuff.reduceSum();
	}

}
