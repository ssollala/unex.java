package com.dasolkwon.usecdenum;

import java.util.EnumSet;

public class Main {

	public static void main(String[] args) {
		for(CD cd: CD.values()){
			System.out.println("ID=" + cd + ", Title="+ cd.getTitle() +
					", Artist=" + cd.getArtist());
		}
		
		System.out.println("\nCD enum data from ID JDPFCC to ID THLC");
		
		for(CD cd: EnumSet.range(CD.JDPFCC, CD.THLC)){
			System.out.println("ID=" + cd + ", Title="+ cd.getTitle() +
					", Artist=" + cd.getArtist());
		}
	}

}
