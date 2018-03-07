import java.util.Comparator;

public class LengthComparator implements Comparator<String> {
	   public int compare(String first, String second) {
			// ascending order
		       return first.length() - second.length();
		       
		   // descending order
		    // return second.length() - first.length();
	   }

	   
}
