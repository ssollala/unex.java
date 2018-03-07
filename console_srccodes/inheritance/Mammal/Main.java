package com.uclaextension.mammalproject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Mammal> mammals = new ArrayList<>();			// ArrayList that includes all kinds of mammals
		
		List<Lion> lions = new ArrayList<>();
		List<Dolphin> dolphins = new ArrayList<>();
		
		Lion myLion1 = new BarbaryLion("Lion01", "Shizi","F", 2);
		Lion myLion2 = new BarbaryLion("Lion02", "Zira", "M", 4);
		Lion myLion3 = new TransvaalLion("Lion03", "Puma", "M", 5);
		Lion myLion4 = new TransvaalLion("Lion04", "Leo", "F", 4);
		Lion myLion5 = new TransvaalLion("Lion05", "Saja", "M", 1);
		Dolphin myDolphin1 = new Delphinidae("myDolphin01", "Jojo", "F", 10, "Killer Whale");
		Dolphin myDolphin2 = new Delphinidae("myDolphin02", "Dolgorea", "M",  8, "Pilot Whale");
		Dolphin myDolphin3 = new Delphinidae("myDolphin03", "Delfin","F",  2, "Baiji");
		Dolphin myDolphin4 = new Platanistidae("myDolphin04", "Haitun", "M", 4, "Baiji");
		Dolphin myDolphin5 = new Delphinidae("myDolphin05", "Happy", "F", 2, "Pilot Whale");
		Dolphin myDolphin6 = new Delphinidae("myDolphin06", "Whalley", "F", 1, "UnKnown");
		
		lions.add(myLion1);
		lions.add(myLion2);
		lions.add(myLion3);
		lions.add(myLion4);
		lions.add(myLion5);
		dolphins.add(myDolphin1);
		dolphins.add(myDolphin2);
		dolphins.add(myDolphin3);
		dolphins.add(myDolphin4);
		dolphins.add(myDolphin5);
		dolphins.add(myDolphin6);

		// Set the last clean date for each mammal's cage
		Lion.setLastCleanedDate(LocalDate.of(2017, 10, 30));
		Dolphin.setLastCleanedDate(LocalDate.of(2017, 10, 30));

		mammals.addAll(lions);
		mammals.addAll(dolphins);
		
		System.out.println("Total number of mammals: " + mammals.size());
		
		System.out.println("\nMammals not sorted:");
//		System.out.println(mammals);
		for(int i = 0; i < mammals.size(); i++){
			System.out.println(mammals.get(i));
		}
		
		// Sorting Data
		System.out.println("\nMammals sorted by names (alphabetical order):");
		mammals.sort((Mammal m1, Mammal m2) -> m1.getName().compareTo(m2.getName()));
		System.out.println(mammals);
		
		System.out.println("\nLions sorted by ages (ascending) :" );
		lions.sort((Lion l1, Lion l2) -> l1.getAge() - l2.getAge());
		System.out.println(lions);
		
		System.out.println("\nLions sorted by region:" );
		lions.sort((Lion l1, Lion l2) -> l1.getRegion().compareTo(l2.getRegion()));
		System.out.println(lions);
		
		System.out.println("\nDolphins sorted by age (ascending) :");
		dolphins.sort((Dolphin d1, Dolphin d2) -> d1.getAge() - d2.getAge());
		System.out.println(dolphins);

		// If the cage needs cleaning, clean the cage, update the last clean date, and display for cleaning
		for(Mammal mammal: mammals){
			mammal.clean();
		}
		
		// Display dates when the cages last cleaned
		System.out.println("\nLion's cage was last cleaned on  " + Lion.getLastCleanedDate());
		System.out.println("\nDolphin's cage was last cleaned on " + Dolphin.getLastCleanedDate()); 
					
	}

}
