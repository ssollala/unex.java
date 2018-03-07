package myEnumType;
import java.util.Scanner;
import java.util.EnumSet;

public class TestEnum {
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("What size do you want? ");
		String input = sc.nextLine().toUpperCase();
		// converse of toString = s sets to Size.<inputvalue>
		Size s = Enum.valueOf(Size.class, input);
		
		System.out.print("You wanted ");
		System.out.println("Size = " + s);
		System.out.println("Abbreviation = " + s.getAbb());
		System.out.println("How many " + s + " size we have? " + s.getCount());
		
		s.reduceOne();
		
		System.out.println();
		
		System.out.println("\nTotal(updated):");
		for(Size s2: Size.values()){
			System.out.print(s2);
			System.out.println("\tAbbreviation = " + s2.getAbb());
			System.out.println("\tCount = " + s2.getCount());
			
		}
		
		System.out.println("\nNow for the range of constants:");
		for(Size s3: EnumSet.range(Size.SMALL, Size.LARGE)){
			System.out.print(s3);
			System.out.println("\tAbbreviation = " + s3.getAbb());
			System.out.println("\tCount = " + s3.getCount());
		}
	}
}
