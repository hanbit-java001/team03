$(function(){

   function getevents(){

      $(".eventDetail").hide();

      $.ajax({
         url:"/api/event/list",
         method: "GET"
      }).done(function(result){
            for (var i=0;i<result.length;i++) {
                  var eventId = result[i].eventId;
                 var eventName = result[i].eventName;
                 var eventPath = result[i].eventPath;
                 var eventHTML ="<div class='col-sm-4'>";
                    eventHTML +="<div class='thumbnail'>";
                    eventHTML += "<img eventId='" + eventId +"' class='eventlink' height='220' width='180' src="+eventPath+"><br></div></div>";

                 $(".eventMain").append(eventHTML);
            }


            $(".eventlink").on("click", function(){
               $(".eventMain").hide();
               var eventId = $(this).attr("eventId");
               $.ajax({
                  url:"/api/event/detail",
                  method: "GET",
                  data:{
                     eventId:eventId
                  }
               }).done(function(result){
                  var details = "<div class='eventdetails'><img height='1500' width='600' src="+result.eventDetailPath+"></div>";
                  $(".eventDetail").append(details);

                  var back = "<br><br><br><br><div class='back'>이벤트 목록 보기</div>";
                  $(".eventDetail").append(back);
                  $(".eventDetail").show();


                  $(".back").on("click", function(){
                     location.href = "/event";

                  });
               });

            });
      });
   }

   getevents();


   });


