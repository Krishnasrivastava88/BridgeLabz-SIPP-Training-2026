
interface StreamingService{
 void stream();
 default void showSubscriptionDetails(){System.out.println("Streaming Plan");}
}
interface GamingService{
 void play();
 default void showSubscriptionDetails(){System.out.println("Gaming Plan");}
}
class SmartTV implements StreamingService,GamingService{
 public void stream(){System.out.println("Streaming");}
 public void play(){System.out.println("Gaming");}
 public void showSubscriptionDetails(){
   StreamingService.super.showSubscriptionDetails();
   GamingService.super.showSubscriptionDetails();
 }
 public static void main(String[]a){new SmartTV().showSubscriptionDetails();}
}
