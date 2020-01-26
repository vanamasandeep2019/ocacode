
public class EnumDemo {
	
	public enum Colors {RED,GREEN,BLUE};
	
	public static void main(String[] args) {
		
		Colors [] c=Colors.values();
		
		System.out.println(c[2]);
		
	}
}
