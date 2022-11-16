package com.xworkz.searchapp.searchengine;

public class SearchEngine {
 int searchEngineId;
 String type;
 String keywords;
 
 public double users;
 public double toSearch(double computerCustomers) {
	 this.users = this.users - computerCustomers;
	 return computerCustomers;
 }
 public double toKnow(double computerCustomers) {
	 this.users = this.users - computerCustomers;
	 return computerCustomers;
 }
 
 public void toGainKnowledge(double computerCustomers, SearchEngine cousin ) {
	 System.out.println("to search information");
	 toSearch(computerCustomers);
	 cousin.toKnow(computerCustomers);
	 System.out.println("searching completed..");
 }
}
