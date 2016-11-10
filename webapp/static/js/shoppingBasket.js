$(function(){



   function getShoppingBasket(){

      $.ajax({
         url:"/api/shoppingBasket/list",
         method: "GET"

      }).done(function(result){
         for(var i=0;i<result.length;i++){
            var orderBasketId = result[i].orderBasketId;
            var orderBasketQuantity = result[i].orderBasketQuantity;
            var orderBasketTotal = result[i].orderBasketTotal;
            var sweetShopProduct = result[i].sweetShopProduct;

            var orders = "<tr><td>"+orderBasketId+"</td><td>"+sweetShopProduct+"</td><td>"
               orders += "<input class='quantity' type='text' size='1' value='"+orderBasketQuantity+"'></input></td>"
               orders += "<td class='btnModify' orderBasketId='"+orderBasketId+"'>수정</td><td>"+orderBasketTotal+"원</td>"
               orders += "<td class='btnDelete' orderBasketId='"+orderBasketId+"'>삭제하기</td></tr>";

            $(".orderDetail").append(orders);

         }

         $(".btnPayment").on("click", function(){
            alert("결제되었습니다 주문확인페이지로 이동합니다.");
            location.href = "/";
         });

         $(".btnModify").on("click", function(){

            var orderBasketId = $(this).attr("orderBasketId");
            var orderBasketQuantity = $(this).parents("tr").find(".quantity").val();

            $.ajax({
               url : "/api/shoppingBasket/modify",
               method: "POST",
               data: {
                  orderBasketId:orderBasketId ,
                  orderBasketQuantity:orderBasketQuantity
               }

            }).done(function(){
               alert("수정되었습니다.");
               location.href = "/shoppingBasket";
            });

         });


         $(".btnDelete").on("click", function(){
            var orderBasketId = $(this).attr("orderBasketId");

            $.ajax({
               url : "/api/shoppingBasket/delete",
               method: "POST",
               data: {
                  orderBasketId:orderBasketId ,
               }

            }).done(function(){
               alert("삭제되었습니다.");
               location.href = "/shoppingBasket";

            });


         });


         $(".allDelete").on("click", function(){

             $.ajax({
                url : "/api/shoppingBasket/deleteall",
                method: "POST"


             }).done(function(){
                alert("삭제되었습니다.");
                location.href = "/shoppingBasket";

             });

         });



      });


   }


   getShoppingBasket();


});