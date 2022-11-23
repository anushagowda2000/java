package com.xworkz.chatshopapp.chatshop;

public class ChatshopDTOTester {
	public static void main(String[] args) {
		ChatshopDTO chat = new ChatshopDTO();
		chat.setName("bangarpet");
		chat.setLocation("bangalore");
		chat.setBranch("rajajinagar");
		System.out.println("the chatshop name is:" + chat.getName());
		System.out.println("the chatshop location is:" + chat.getLocation());
		System.out.println("the chatshop name is:" + chat.getBranch());
	}
}
