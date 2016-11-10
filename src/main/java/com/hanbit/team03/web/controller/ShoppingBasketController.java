package com.hanbit.team03.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanbit.team03.core.service.ShoppingBasketService;
import com.hanbit.team03.core.session.Session;
import com.hanbit.team03.core.session.SessionHelper;
import com.hanbit.team03.core.vo.ShoppingBasketVO;

@Controller
public class ShoppingBasketController {

   private static final Logger LOGGER = LoggerFactory.getLogger(ShoppingBasketController.class);

   @Autowired
   private ShoppingBasketService shoppingBasketService;

   @RequestMapping("/shoppingBasket")
   public String list(){
	   Session session = SessionHelper.getSession();
	   if(session.isLoggedIn()){
			return "shoppingbasket/shoppingBasket";
		}else return "member/login";
   }

   @RequestMapping(value="/api/shoppingBasket/list", method=RequestMethod.GET)
   @ResponseBody
   public List<ShoppingBasketVO> getBasketList(){
      LOGGER.debug("장바구니리스트불러오기");

      int memberId = SessionHelper.getSession().getMemberId();

      return shoppingBasketService.getBasketList(memberId);
   }

   @RequestMapping(value="/api/shoppingBasket/modify", method=RequestMethod.POST)
   @ResponseBody
   public Map modifyShoppingBasket(@RequestParam("orderBasketQuantity") int orderBasketQuantity,
         @RequestParam("orderBasketId") int orderBasketId){

      Session session = SessionHelper.getSession();
      Map result = new HashMap();
      result.put("memberId", session.getMemberId());
      result.put("orderBasketQuantity", orderBasketQuantity);
      result.put("orderBasketId", orderBasketId);

      int memberId = session.getMemberId();

      LOGGER.debug(result.toString());

      shoppingBasketService.modifyShoppingBasket(orderBasketQuantity,orderBasketId,memberId);

      return result;
   }


   @RequestMapping(value="/api/shoppingBasket/delete", method=RequestMethod.POST)
   @ResponseBody
   public Map deleteShoppingBasket(@RequestParam("orderBasketId") int orderBasketId){

      Map result = new HashMap();
       result.put("orderBasketId", orderBasketId);
       shoppingBasketService.deleteShoppingBasket(orderBasketId);

      return result;

   }

   @RequestMapping(value="/api/shoppingBasket/deleteall", method=RequestMethod.POST)
   @ResponseBody
   public Map deleteAllShoppingBasket(){
	   LOGGER.debug("전체삭제");
      Map result = new HashMap();
      int memberId = SessionHelper.getSession().getMemberId();
       result.put("memberId", memberId);

       shoppingBasketService.deleteAllShoppingBasket(memberId);

      return result;



   }

}