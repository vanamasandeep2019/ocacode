import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		//System.out.println(test(i -> i == 10));
		//System.out.println(test((i) -> i == 10));
		//System.out.println(test(i -> {i == 10;}));
		//System.out.println(test((int i) -> i == 10);
		//System.out.println(test((int i) -> {return i == 5;}));
		System.out.println(test((i) -> {return i == 10;}));
	}

	private static boolean test(Predicate<Integer> p) {
		return p.test(10);
	}

}
