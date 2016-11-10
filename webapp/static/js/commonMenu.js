$(function(){
     $.ajax({
        url:"/api/member/isLogined",
        method: "GET"

     }).done(function(result){
        if(result.name != ""){
           //로그인 된상태
           $(".common-login").css("display", "none");
           $(".common-logined").css("display", "inline-block");

        }else{
           //로그인 안된상태
           $(".common-logined").css("display", "none");
           $(".common-login").css("display", "inline-block");
        }


        });


   $(".common-login li").on("click", function(){
      var loginMenu = $(this).attr("id");

      if(loginMenu == "login"){
         location.href = "/member/login";
      }
      else if(loginMenu == "join"){
         location.href = "/member/join";
      }
      else if(loginMenu == "shoppingBasket"){
         location.href = "/shoppingBasket";
      }
      else if(loginMenu == "contact"){
         location.href = "/contact";
      }

      });



   $(".common-logined li").on("click", function(){
         var loginMenu = $(this).attr("id");

         if(loginMenu == "loginout"){
            location.href = "/member/logout";
         }
         else if(loginMenu == "ticketCheck"){
            location.href = "/reservation/reservationList";
         }
         else if(loginMenu == "shoppingBasket"){
            location.href = "/shoppingBasket";
         }
         else if(loginMenu == "contact"){
            location.href = "/contact";
         }


      });


   $(".common-main-menu ul li").on("click", function(){
      var mainMenu = $(this).attr("id");
      if (mainMenu== "reservation"){
         location.href = "/reservation";
      }
      else if (mainMenu== "movie"){
         location.href = "/movie/now";
      }
      else if (mainMenu== "cinema"){
         location.href = "/cinema/theater";
      }
      else if (mainMenu== "sweetShop"){
         location.href = "/sweetShop";
      }
      else if (mainMenu== "event"){
         location.href = "/event";
      }

   });

   $(".logo ,.center-block").on("click", function(){
      location.href = "/";
   });

   $(".btnLoginCancel").on("click", function() {
      hideLoginDialog();
   });



});
