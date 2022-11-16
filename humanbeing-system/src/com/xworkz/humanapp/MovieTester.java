package com.xworkz.humanapp;

import com.xworkz.humanapp.humanbeing.Movie;
import com.xworkz.humanapp.humanbeing.anusha.Kantara;

public class MovieTester {
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.toWatch();

		Kantara kantara = new Kantara();
		kantara.toWatch();
	}
}
