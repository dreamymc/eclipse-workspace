import java.util.*;
public class HashSet16 {
// removes duplicate items from the main list
	public static void main(String[] args) {
		
		String[] things = {"apple", "bob", "ham", "bob", "bacon"};
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s ", list);
		System.out.println();
		
		Set<String> set = new HashSet<String>(list);
		System.out.printf("%s ", set);

	}

}
