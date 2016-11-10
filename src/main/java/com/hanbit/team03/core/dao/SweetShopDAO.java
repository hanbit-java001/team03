package com.hanbit.team03.core.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.team03.core.vo.SweetShopVO;

@Repository
public class SweetShopDAO {

   private static final Logger LOGGER = LoggerFactory.getLogger(SweetShopDAO.class);

   @Autowired
   private SqlSession sqlSession;

   public List<SweetShopVO> selectSweetShop(){
      LOGGER.debug("스위트샵스낵 이미지 불러오기");
      List<SweetShopVO> result = sqlSession.selectList("sweetShop.selectSweetShop");
      return result;
   }

   public SweetShopVO selectSweetShopDetails(int sweetShopId){
      LOGGER.debug("스낵디테일 불러오기");
      return sqlSession.selectOne("sweetShop.selectSweetShopDetails", sweetShopId);
   }

   public int insertShoppingBasket(int memberId, int sweetShopId){
      LOGGER.debug("장바구니저장");

      Map param = new HashMap();
      param.put("memberId", memberId);
      param.put("sweetShopId", sweetShopId);

      return sqlSession.insert("sweetShop.insertShoppingBasket", param);
   }

}