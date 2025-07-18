package Bus_Reservation;
import java.util.*;

public class loginPage{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Map<Integer,List<String>> hmap = new HashMap<>();
        hmap.put(1,Arrays.asList("Hello@123","Raj","25","Male"));
        hmap.put(2,Arrays.asList("Js@123","Dharani","20","Female"));


        Map<Integer,Bus> busMap = new HashMap<>();
        busMap.put(1,new Bus("Muthu","45","23-08-2025",2));
        busMap.put(2,new Bus("Baasha","54","09-08-2025",1));

        Map<Integer,ArrayList<Booking>> bookMap = new HashMap<>();

        int proceed=0;
        while(proceed==0){  
        System.out.println("***********************************");
        System.out.println("Welcome to Air Bus Booking");
        System.out.println("***********************************");
        System.out.println("1 ) Login");
        System.out.println("2 ) Register");
        System.out.print("Choose the option : ");

        int userOpt;
        userOpt = Integer.parseInt(sc.nextLine().trim());
        System.out.println();
        if(userOpt==1)
        { 
            Login log = new Login();
            System.out.print("Enter Your UserId : ");
            int id = Integer.parseInt(sc.nextLine().trim());
            System.out.println();
            String pass;
            int logged;
            boolean status = false;
            do{
            System.out.print("Enter Your Password : ");
             pass = sc.nextLine().trim();
             logged = log.validateLogin(hmap,id,pass);
             
             if(logged == 1)
             {
                proceed = 1;
                 status = true;
             }else if(logged == 0)
             {
                status =false;
             }else{
                status= true;
             }

            }while(!status);             
           
            if(logged == -1)
            {
                continue;
            }
            if(status = true && logged ==0)
            {
                proceed = 1;
            }
           
        }else if(userOpt == 2){
            new Register(hmap);
            proceed = 1;
        }else{
            break;
        }
        
    }
    while(proceed == 1)
    {
        System.out.println("***********************************************");
        System.out.println("            Bus Booking Menu  ");
        System.out.println("***********************************************");
        int bookOpt;
        System.out.println("1) Book a Bus ");
        System.out.println("2) View Booking ");
        System.out.println("3) Display Bus details ");
        System.out.println("4) Exit ");
        bookOpt = Integer.parseInt(sc.nextLine().trim());
        if(bookOpt==1)
        {
            new Bus().getDetails(busMap);
            System.out.print("Enter the BusId for Booking : ");
            int id = Integer.parseInt(sc.nextLine().trim());
            System.out.println();
            if(busMap.containsKey(id))
            {
                    Bus bus = busMap.get(id);
                    if(bus.capacity == 0)
                    {
                        System.out.println("No seats Available");
                    }else{
                        bus.capacity--;
                        new Booking(id,bookMap);
                    System.out.println("Successfully Booked!");
                    }

            }else{
                System.out.println("Select a valid BusId");
            }

        }else if(bookOpt == 2)
        {
            new Booking().displayBooking(bookMap);

        }else if(bookOpt == 3)
        {
            new Bus().getDetails(busMap);

        }else{
            proceed = 0;
        }

    }
    




        
    
        
    }
}