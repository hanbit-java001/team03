package com.hanbit.team03.core.vo;

public class ShoppingBasketVO {

   private int orderBasketId;
   private int orderBasketQuantity;
   private int orderBasketTotal;
   private int memberId;
   private int sweetShopId;
   private String sweetShopProduct;


   public String getSweetShopProduct() {
      return sweetShopProduct;
   }
   public void setSweetShopProduct(String sweetShopProduct) {
      this.sweetShopProduct = sweetShopProduct;
   }
   public int getOrderBasketId() {
      return orderBasketId;
   }
   public void setOrderBasketId(int orderBasketId) {
      this.orderBasketId = orderBasketId;
   }
   public int getOrderBasketQuantity() {
      return orderBasketQuantity;
   }
   public void setOrderBasketQuantity(int orderBasketQuantity) {
      this.orderBasketQuantity = orderBasketQuantity;
   }
   public int getOrderBasketTotal() {
      return orderBasketTotal;
   }
   public void setOrderBasketTotal(int orderBasketTotal) {
      this.orderBasketTotal = orderBasketTotal;
   }
   public int getMemberId() {
      return memberId;
   }
   public void setMemberId(int memberId) {
      this.memberId = memberId;
   }
   public int getSweetShopId() {
      return sweetShopId;
   }
   public void setSweetShopId(int sweetShopId) {
      this.sweetShopId = sweetShopId;
   }





}