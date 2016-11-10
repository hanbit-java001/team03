package com.hanbit.team03.core.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.team03.core.dao.SweetShopDAO;
import com.hanbit.team03.core.vo.SweetShopVO;
import com.hanbit.team03.web.controller.SweetShopController;


@Service
public class SweetShopService {

   private static final Logger LOGGER = LoggerFactory.getLogger(SweetShopService.class);

   @Autowired
   private SweetShopDAO sweetShopDAO;

   public List<SweetShopVO> getSweetShop(){
      return sweetShopDAO.selectSweetShop();
   }

   public SweetShopVO getSweetShopDetails(int sweetShopId){
      return sweetShopDAO.selectSweetShopDetails(sweetShopId);
   }

   public int insertShoppingBasket(int memberId, int sweetShopId){
      return sweetShopDAO.insertShoppingBasket(memberId, sweetShopId);
   }

}