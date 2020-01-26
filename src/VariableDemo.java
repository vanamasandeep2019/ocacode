
public class VariableDemo {
	static int a=10;
	static int b=20;
	
	public static void main(String[] args) {
		VariableDemo v=new VariableDemo();
		System.out.println(VariableDemo.a);
		System.out.println(v.display(5));
		System.out.println(v.b);
	}
	
	public Integer display(int a)
	{
		a=15;
		b=25;
		return a;
	}
}
