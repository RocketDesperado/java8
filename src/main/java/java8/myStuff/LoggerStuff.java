package java8.myStuff;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The levels in descending order are:

SEVERE (highest value)
WARNING
INFO
CONFIG
FINE
FINER
FINEST (lowest value)

 * @author User
 *
 */

public class LoggerStuff {
	Logger log = Logger.getLogger(this.getClass().getName());
	
	public static Logger getLogger(Class<?> classId) {
		return Logger.getLogger(classId.getClass().getName());
	}
	
	public LoggerStuff() {
		log.info("constructor");
		log.log(Level.INFO, "info");
		log.log(Level.WARNING, "warning");
	}
	
	public static void main(String[] args) {
		new LoggerStuff();
	}
}
