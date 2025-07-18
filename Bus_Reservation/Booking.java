package Bus_Reservation;
import java.util.*;

public class Booking {
     Scanner sc = new Scanner(System.in);

     int busId;
     String status;
     Booking(){}

     Booking(int busId,String status)
     {
          
          this.busId  = busId;
          this.status = status;
     }
     Booking(int busId,Map<Integer,ArrayList<Booking>> bookMap){
        
       System.out.print("Enter Your Id : ");
       int u  = Integer.parseInt(sc.nextLine().trim());
       System.out.println();
       
        if(bookMap.containsKey(u))
        {
             ArrayList<Booking> arr = bookMap.get(u);
             arr.add(new Booking(busId,"Confirmed"));
             bookMap.replace(u,arr);
            
        } else{
          ArrayList<Booking> arr = new ArrayList<>();
          arr.add(new Booking(busId,"Confirmed"));
          bookMap.put(u,arr);
         
        }

     }

     public void displayBooking(Map<Integer,ArrayList<Booking>> bookMap)
    {
     System.out.print("Enter your Id : ");
     int user = Integer.parseInt(sc.nextLine().trim());
     System.out.println();
     if(bookMap.containsKey(user))
     {
         ArrayList<Booking> arr = bookMap.get(user);
         for(Booking book : arr)
         {
            System.out.println("Bus Id :" +book.busId+" "+"Status : "+book.status);

         }
     }else{
          System.out.println("No Booking Found !");
     }
    }
}
