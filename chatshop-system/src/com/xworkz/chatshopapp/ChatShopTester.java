package com.xworkz.chatshopapp;
import com.xworkz.chatshopapp.chatshop.ChatShop;
public class ChatShopTester {
	 public static void main(String[] args) {
		 String chatMenu[] = new String [5];
		 chatMenu[0] = "pani puri";
		 chatMenu[1] = "bele puri";
		 chatMenu[2] = "masala puri";
		 chatMenu[3] = "tikki";
		 chatMenu[4] = "sev";
		 
		 String juiceMenu[] = new String [6];
		 juiceMenu[0] = "orange";
		 juiceMenu[1] = "apple";
		 juiceMenu[2] = "grapes";
		 juiceMenu[3] = "butterfruit";
		 juiceMenu[4] = "watermelon";
		 juiceMenu[5] = "kiwi";
		 
		 String chineseMenu[] = new String[5];
		 chineseMenu[0] = "gopi munchuri";
		 chineseMenu[1] = "noodles";
		 chineseMenu[2] = "panner munchuri";
		 chineseMenu[3] = "mushroom dry";
		 chineseMenu[4] = "fench fry";
		 
		ChatShop chat = new ChatShop("bangarpet","Banglore",chatMenu,juiceMenu,chineseMenu);
		chat.menu();
	}
}

