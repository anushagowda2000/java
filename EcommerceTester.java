class EcommerceTester{
  public static void main(String ecommerce[]){
  
   Ecommerce.setEcommerceId(34242);
   System.out.println("the id is :" + Ecommerce.getEcommerceId());
  
   Ecommerce.setTax("400rs");
   System.out.println("the ecommerce tax is :" + Ecommerce.getTax());
  
   Ecommerce.setShipping("dispatched");
   System.out.println("the shipping is :" + Ecommerce.getShipping());
  
   Ecommerce.setCoupon("valid");
   System.out.println("the coupon is :" + Ecommerce.getCoupon());
  

}
}