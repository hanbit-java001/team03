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

import com.hanbit.team03.core.service.SweetShopService;
import com.hanbit.team03.core.session.Session;
import com.hanbit.team03.core.session.SessionHelper;
import com.hanbit.team03.core.vo.SweetShopVO;


@Controller
public class SweetShopController {

   private static final Logger LOGGER = LoggerFactory.getLogger(SweetShopController.class);

   @Autowired
   private SweetShopService sweetShopService;

   @RequestMapping("/sweetShop")
   public String list() {

      return "sweetshop/sweetShopList";
   }

   @RequestMapping(value="/api/sweetShop/list", method=RequestMethod.GET)
   @ResponseBody
   public List<SweetShopVO> getSweetShop(){
      LOGGER.debug("스위트샵컨트롤러임당");
      return sweetShopService.getSweetShop();
   }

   @RequestMapping(value="/api/sweetShop/detail", method=RequestMethod.GET)
   @ResponseBody
   public SweetShopVO getSweetShopDetails(@RequestParam("sweetShopId") int sweetShopId){
      SweetShopVO result = sweetShopService.getSweetShopDetails(sweetShopId);
      return result;
   }

   @RequestMapping(value="/api/sweetShop/shoppingbasket", method=RequestMethod.GET)
   @ResponseBody
   public Map insertShoppingBasket(@RequestParam("sweetShopId") int sweetShopId){
      LOGGER.debug("여기까지들어오나");

      Session session = SessionHelper.getSession();
      Map result = new HashMap();
      result.put("memberId", session.getMemberId());
      result.put("sweetShopId", sweetShopId);

      System.out.println(session.getMemberId());

      int memberId = session.getMemberId();

      sweetShopService.insertShoppingBasket(memberId, sweetShopId);

      return result;
   }

}