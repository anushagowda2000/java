package com.xworkz.humanapp;

import com.xworkz.humanapp.humanbeing.DialougeWriter;
import com.xworkz.humanapp.humanbeing.anusha.Ammu;

public class DialogeWriterTester {
	public static void main(String[] args) {
		DialougeWriter dialougeWriter = new DialougeWriter();
		dialougeWriter.toWrite();

		Ammu ammu = new Ammu();
		ammu.toWrite();
	}
}
