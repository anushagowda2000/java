package com.xworkz;

import com.xworkz.festivalapp.deepawali.Deepawali;
import com.xworkz.festivalapp.festival.Festival;

public class FestivalTester {
public static void main(String[] args) {
	Festival family = new Festival();
	family.toInvite(50);
	System.out.println("my family inviting" + family.expenditure);
	
	Festival friend = new Festival();
	friend.toInvite(20);
	System.out.println("my family inviting" + friend.expenditure);
	
	family.toCelebrate(20.00,friend);
	System.out.println("my family inviting" + family.expenditure);
	System.out.println("my family inviting" + friend.expenditure);
	
	Deepawali deepawali = new Deepawali();
	deepawali.toInvite(50);
	System.out.println("my family inviting" + family.expenditure);
	
	Deepawali deepawali1= new Deepawali();
	deepawali1.toInvite(20);
	System.out.println("my family inviting" + friend.expenditure);
	
	deepawali.toCelebrate(20.00,deepawali1);
	System.out.println("my family inviting" + family.expenditure);
	System.out.println("my family inviting" + friend.expenditure);
}
}
