package Bus_Reservation;

import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Bus {
     static int busId = 3;
     String driverName;
     String driverAge;
     int capacity;
     LocalDate date;
     DateTimeFormatter dateFor = DateTimeFormatter.ofPattern("dd-MM-yyyy");
   
     Bus(){ }

     Bus(String driverName,String driverAge,String date,int capacity)
     {
          
          this.driverName = driverName;
          this.driverAge = driverAge;
          this.capacity = capacity;
          this.date = LocalDate.parse(date,dateFor);

     } 

     public void getDetails(Map<Integer,Bus> busMap){
          for(Map.Entry<Integer,Bus> entry : busMap.entrySet())
          {
              System.out.println("Bus Id : "+entry.getKey());
              System.out.println("Bus Info : ");
              Bus bus = entry.getValue();
              System.out.println("Driver's Name : "+bus.driverName);
              System.out.println("Driver's Age : "+bus.driverAge);
              System.out.println("Available Seats : "+bus.capacity);
              System.out.println("Availabe On : "+bus.date.format(dateFor));
          }
     }

}
