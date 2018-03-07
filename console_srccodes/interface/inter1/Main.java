package com.dasol.calcengine;

public class Main {

	public static void main(String[] args) {

        System.out.println("Using Interface: ");
        String[] statement2 = {
                "add 25.0 92.0",
                "power 5.0 2.0",
                "multiply 5.0 3.0"
        };

        DynamicHelper dynamicHelper = new DynamicHelper(new MathProcess[]{
                new Adder(),
                new PowerOf(),
                new Multiply()
        });

        for(String statement: statement2){
            String output = dynamicHelper.process(statement);
            System.out.println(output);
        }

		
		
	}

}
