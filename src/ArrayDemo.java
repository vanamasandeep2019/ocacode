
public class ArrayDemo {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3 };
		int y[] = { 8, 5, 6 };
		new ArrayDemo().go(x, y);
	}

	void go(int[]... z) {
		for (int[] a : z)
			System.out.print(a[0]);
	}
}
