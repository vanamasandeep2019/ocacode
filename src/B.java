
public class B extends A{
	
	public void show(){
		System.out.println("Iam in class B");
	}
	
	public static void main(String[] args) {
		B b =new B();
		b.show();
		A a=new B();
		a.show();
	}
}
