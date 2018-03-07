package com.uclaextension.mammalproject;

public class BarbaryLion extends Lion {
	
	private static String region = "South Africa";
	
	public BarbaryLion(String animalId, String name, String gender, int age){
		super(animalId, name, gender, age, region);
	}
	
}
