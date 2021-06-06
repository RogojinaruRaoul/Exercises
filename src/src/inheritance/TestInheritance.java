package inheritance;

/**
 * Class that test's the functions of Walker, Talker, Swimmer
 * 
 * @author Raul
 *
 */
public class TestInheritance {

	public static void main(String[] args) {

		Walker w = new Walker();
		Talker t = new Talker();
		Swimmer s = new Swimmer();

		System.out.println(w.breathe() + w.walk());
		System.out.println(t.breathe() + t.talk());
		System.out.println(s.breathe() + s.swim() + s.walk() + s.getTalker());

	}

}
