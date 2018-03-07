package com.dasolkwon.usecdenum;

public enum CD {
	// Declare enum contents
	BSLD("Live in Dublic", "Bruce Springsteen"),
	JDPFCC("Favorite Cello", "Concertos Jacqueline Du Pre"),
	DKLIP("Live in Paris", "Diana Krall"),
	THLC("Little Creatures", "Talking Heads");
	
	private final String title;
	private final String artist;

	CD(String title, String artist){
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}
	
	
}
