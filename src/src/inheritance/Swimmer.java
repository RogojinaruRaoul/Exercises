package inheritance;

/**
 * Class in charge with swimming
 * 
 * @author Raul
 *
 */
public class Swimmer extends Walker {

	/**
	 * Instance of Talker class
	 */
	private Talker talker = new Talker();

	/**
	 * Method for geting Talker's value
	 * 
	 * @return
	 */
	public Talker getTalker() {
		return talker;
	}

	/**
	 * Method for swimming
	 * 
	 * @return
	 */
	public String swim() {
		return "Can swim.";
	}

}
