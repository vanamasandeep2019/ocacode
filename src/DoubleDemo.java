import java.text.NumberFormat;
import java.util.Locale;

public class DoubleDemo {

	public static void main(String[] args) {
		double d = 8.12345;
		NumberFormat nf = NumberFormat.getInstance(Locale.CANADA);
		String b;
		b=nf.format(d);
		System.out.println(b);
		
	}

}
