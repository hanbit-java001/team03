package com.hanbit.team03.core.vo;

public class EventVO {

   private int eventId;
   private String eventName;
   private String eventPath;
   private String eventDetailPath;

   public String getEventDetailPath() {
      return eventDetailPath;
   }
   public void setEventDetailPath(String eventDetailPath) {
      this.eventDetailPath = eventDetailPath;
   }
   public int getEventId() {
      return eventId;
   }
   public void setEventId(int eventId) {
      this.eventId = eventId;
   }
   public String getEventName() {
      return eventName;
   }
   public void setEventName(String eventName) {
      this.eventName = eventName;
   }
   public String getEventPath() {
      return eventPath;
   }
   public void setEventPath(String eventPath) {
      this.eventPath = eventPath;
   }

}