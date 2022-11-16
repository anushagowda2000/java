package com.xworkz.festivalapp.deepawali;

import com.xworkz.festivalapp.festival.Festival;

public class Deepawali extends Festival {
	public static void main(String[] args) {
		Deepawali family = new Deepawali();
		family.toInvite(50);
		System.out.println("my family inviting" + family.expenditure);
		
		Deepawali friend = new Deepawali();
		friend.toInvite(20);
		System.out.println("my family inviting" + friend.expenditure);
		
		family.toCelebrate(20.00,friend);
		System.out.println("my family inviting" + family.expenditure);
		System.out.println("my family inviting" + friend.expenditure);
	}
	}


