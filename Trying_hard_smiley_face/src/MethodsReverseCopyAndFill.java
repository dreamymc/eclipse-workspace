//tutorial ten and eleven
import java.util.*;
public class MethodsReverseCopyAndFill {

	public static void main(String[] args) {
		
		//create am array and convert to list
		Character[] ray = {'p', 'w', 'n' }; 
		List<Character> l = Arrays.asList(ray);
		System.out.println("List is: ");
		output(l);
		
		//reverse and print out the list
		Collections.reverse(l);
		System.out.println("After reverse: ");
		output(l);
		
		//create a new array and a new list
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);
		
		//copy contents of list into list copy
		Collections.copy(listCopy, l);
		System.out.println("Copy of list: ");
		output(listCopy);
		
		//fill collection with crap
		Collections.fill(l, 'X');
		System.out.println("After filling the list: ");
		output(l);
	}
	
	//output method
	private static void output(List<Character> thelist) {
		for(Character thing : thelist)
			System.out.printf("%s ", thing);
		
		System.out.println();
	}

}
