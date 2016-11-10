$(function(){
   $(".sweetshop-detail").hide();

   function getsweetShop(){
      $.ajax({
         url:"/api/sweetShop/list",
         method: "GET"
      }).done(function(result){
            for (var i=0;i<result.length;i++) {
                  var sweetShopId = result[i].sweetShopId;
                 var sweetShopProduct = result[i].sweetShopProduct;
                 var sweetShopPrice = result[i].sweetShopPrice;
                 var sweetShopPath = result[i].sweetShopPath;


                 var sweetShopCombo = "<div class='snack-menuList'>";
                 sweetShopCombo += "<img sweetShopId='" + sweetShopId +"' class='sweetShoplink' width ='400' height='400' src="+sweetShopPath+"><br>";
                 sweetShopCombo += "<br><br><span class='product'>" +sweetShopProduct+"</span><br>"+"가격"+sweetShopPrice+"</div>";
                 $(".snack-menu").append(sweetShopCombo);

            }

            $(".sweetShoplink").on("click", function(){
               var sweetShopId = $(this).attr("sweetShopId");
               $(".snack-menu").hide();
               $(".snack-logo").hide();

               $.ajax({
                  url:"/api/sweetShop/detail",
                  method: "GET",
                  data:{
                     sweetShopId:sweetShopId
                  }

               }).done(function(result){
                   var sweetShopId = result.sweetShopId;
                     var sweetShopProduct = result.sweetShopProduct;
                     var sweetShopPrice = result.sweetShopPrice;
                     var sweetShopPath = result.sweetShopPath;
                    var sweetShopComponent =  result.sweetShopComponent;
                    var sweetShopUsingLimit = result.sweetShopUsingLimit;

                    var sweetShopDetail = "<div class='snack-Detail'>";
                    sweetShopDetail += "<div class='snack-Detail-left'><img width ='400' height='400' src='"+sweetShopPath+"'>";
                    sweetShopDetail += "<br><br><br>구성품 : "+sweetShopComponent;
                    sweetShopDetail += "<br>제품이름 : "+sweetShopProduct;
                    sweetShopDetail += "<br>가격 : "+sweetShopPrice;
                    sweetShopDetail += "<br>사용기한 : "+sweetShopUsingLimit+"</div>";
                    sweetShopDetail += "<div class='snack-Detail-right'><div class='btnPayment'>결제하기</div><br><br>";
                    sweetShopDetail += "<div class='btnShoppingBasket'>장바구니담기</div><br><br><div class='back'>돌아가기</div></div></div>";
                    $(".sweetshop-content").append(sweetShopDetail);
                    $(".btnPayment").on("click", function(){
                       alert("결제되었습니다.");
                       location.href = "/";
                    });

                    $(".back").on("click", function(){
                       location.href = "/sweetShop";
                    });

                    $(".btnShoppingBasket").on("click", function(){


                       $.ajax({
                          url: "/api/sweetShop/shoppingbasket",
                           method: "GET",
                           data:{
                              sweetShopId:sweetShopId
                            }

                       }).done(function(){
                          location.href = "/shoppingBasket";
                       });



                    });

               });

               $(".sweetshop-detail").show();

               });



         });
      }

   getsweetShop();


      });
