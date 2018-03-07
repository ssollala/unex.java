package com.dasol.interfaces;

public interface DrawColor {
	// constants
	int BLACK = 0;
	int WHITE = 1;
	int RED = 2;
	int BLUE = 3;
	int GREEN = 4;
	
	// abstract methods(all methods are abstract and default to public)
	void draw(int color);
}
