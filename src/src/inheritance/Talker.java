package inheritance;

/**
 * Class in charge with talking
 * 
 * @author Raul
 *
 */
public class Talker extends Human {

	/**
	 * Method for talking
	 * 
	 * @return
	 */
	public String talk() {
		return "Can talk.";
	}

	/**
	 * Method that overrides the object's String
	 */
	@Override
	public String toString() {
		return talk();
	}
}
