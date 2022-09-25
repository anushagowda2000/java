class Swiggy1{
public static String takeOrder(String item){
 if(item == "pizza"){
 System.out.println("thank you for ordering = " + item);
 return item ;
 }
if(item == "mosaruanna"){
 System.out.println("thank you for ordering = " + item);
 return  item;
 }
 if(item == "southindia"){
 System.out.println("thank you for ordering = " + item);
 return item;
 }
 if(item == "pasteries"){
 System.out.println("thank you for ordering = " + item);
 return item;
 }
 return item;
}

public static double takeOrder(String item, double price){
 if(item == "pizza"){
 System.out.println("thank you for ordering = " + item +"the price of the order is = " + price);
 return 99.00 ;
 }
if(item == "mosaruanna"){
 System.out.println("thank you for ordering = " + item +"the price of the order is = " + price);
 return  48.00;
 }
 if(item == "southindia"){
 System.out.println("thank you for ordering = " + item +"the price of the order is = " + price);
 return 130.00;
 }
 if(item == "pasteries"){
 System.out.println("thank you for ordering = " + item +"the price of the order is = " + price);
 return 80.00;
 }
 return 0.00;
}

}