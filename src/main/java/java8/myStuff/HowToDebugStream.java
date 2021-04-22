package java8.myStuff;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Logger;
/**
 * PEEK
 * @author User
 *
 */
public class HowToDebugStream {
	
	private static Logger log = Logger.getLogger(HowToDebugStream.class.getName());
	
	public static void main(String[] args) {
		List<String> listOfStr = Arrays.asList("ds", "assdzx", "12ss", "ss1", "123dd");
		
		Consumer<String> logConsumer = x -> log.info("curr string: " +x);
		
		listOfStr.stream().peek(logConsumer).sorted(Comparator.comparingInt(String::length)).forEach(logConsumer);
	}

}
