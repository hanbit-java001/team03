package com.hanbit.team03.core.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.team03.core.vo.ShoppingBasketVO;
@Repository
public class ShoppingBasketDAO {

   private static final Logger LOGGER = LoggerFactory.getLogger(ShoppingBasketDAO.class);

   @Autowired
   private SqlSession sqlSession;

   public List<ShoppingBasketVO> selectShoppingBasket(int memberId){
      LOGGER.debug("장바구니불러오기");
      List<ShoppingBasketVO> result = sqlSession.selectList("shoppingBasket.selectShoppingBasket", memberId);
      return result;
   }

   public int modifyShoppingBasket(int orderBasketQuantity, int orderBasketId,int memberId){
      LOGGER.debug("장바구니 수정");

      Map param = new HashMap();
      param.put("memberId", memberId);
      param.put("orderBasketQuantity", orderBasketQuantity);
      param.put("orderBasketId", orderBasketId);

      return sqlSession.update("shoppingBasket.updateShoppingBasket",param);

   }

   public int deleteShoppingBasket(int orderBasketId){
      return sqlSession.delete("shoppingBasket.deleteShoppingBasket",orderBasketId);
   }

   public int deleteAllShoppingBasket(int memberId){
	      return sqlSession.delete("shoppingBasket.deleteAllShoppingBasket",memberId);
	   }


}