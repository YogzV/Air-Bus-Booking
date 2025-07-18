package Bus_Reservation;

import java.util.*;

public class Login {
     
    public int validateLogin(Map<Integer,List<String>> hmap ,int id,String pass)
    {
        Scanner sc =  new Scanner(System.in);
       
        if(hmap.containsKey(id))
        {
            if(hmap.get(id).get(0).equals(pass))
            {
                System.out.println("Login Sucessfull!!");
                return 1;
            }else{
                System.out.println("Wrong Password! Retry");
                System.out.println("1)Enter password again ");
                System.out.println("2)Go back to Register");
                int back = Integer.parseInt(sc.nextLine().trim());
                if(back == 1)
                {
                    return 0;
                }
               
                return -1;
            }
        }else{
            System.out.println("No User Found! Try to Register");
            return -1;
        }
        
        
    }

}
