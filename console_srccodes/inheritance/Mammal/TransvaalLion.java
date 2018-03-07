package com.uclaextension.mammalproject;

public class TransvaalLion extends Lion {

	private static String region = "North Africa";
	
	public TransvaalLion(String animalId, String name, String gender, int age) {
		super(animalId, name, gender, age, region);
	}

}
