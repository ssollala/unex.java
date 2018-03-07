import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		String[] friends = { "Peter", "Paul", "Mary", "Jasmine" };
		Arrays.sort(friends);
		System.out.println(Arrays.toString(friends));
		
		Comparator<String> comp = new LengthComparator();
		String[] friends2 = { "Peter", "Paul", "Mary", "Jasmine" };
		Arrays.sort(friends2, comp);
		System.out.println(Arrays.toString(friends2));

	}

}
