import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		
		int[] array = {10,20,30};
		List<Integer> list = new ArrayList<>();
		list.add(array[0]);
		list.add(array[1]);
		list.set(2, array[2]);
		list.remove(0);
		System.out.println(list);

		
	}

}
