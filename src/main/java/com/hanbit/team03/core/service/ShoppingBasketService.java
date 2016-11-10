package com.hanbit.team03.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.team03.core.dao.ShoppingBasketDAO;
import com.hanbit.team03.core.vo.ShoppingBasketVO;

@Service
public class ShoppingBasketService {

   @Autowired
   private ShoppingBasketDAO shoppingBasketDAO;

   public List<ShoppingBasketVO> getBasketList(int memberId){
      return shoppingBasketDAO.selectShoppingBasket(memberId);
   }

   public int modifyShoppingBasket(int orderBasketQuantity, int orderBasketId,int memberId){
      return shoppingBasketDAO.modifyShoppingBasket(orderBasketQuantity,orderBasketId,memberId);
   }

   public int deleteShoppingBasket(int orderBasketId){
      return shoppingBasketDAO.deleteShoppingBasket(orderBasketId);
   }

   public int deleteAllShoppingBasket(int memberId){
	      return shoppingBasketDAO.deleteAllShoppingBasket(memberId);
	   }

}