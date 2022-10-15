class Ecommerce{
 
 static int ecommerceId;
 static String tax;
 static String shipping;
 static String coupon;
 
 static void setEcommerceId(int id){
   ecommerceId = id;
 }
 static int getEcommerceId(){
   return ecommerceId;
 }

 static void setTax(String ta){
   tax = ta;
 }
 static String getTax(){
   return tax;
 }
 
 static void setShipping(String ship){
   shipping = ship;
 }
 static String getShipping(){
   return shipping;
 }
 
 static void setCoupon(String coup){
   coupon = coup;
 }
 static String getCoupon(){
   return coupon;
 }
}