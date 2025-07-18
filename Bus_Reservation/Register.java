package Bus_Reservation;

import java.util.*;

public class Register {
   static int idCnt = 3;
    Scanner sc = new Scanner(System.in);
    Register(Map<Integer,List<String>> hmap)
    {
        String name,pass,gender,age;

        System.out.print("Enter your Name : ");
        name = sc.nextLine().trim(); 
        System.out.println();
        System.out.print("Enter your password : ");
        pass = sc.nextLine().trim();
        System.out.println();
        System.out.print("Enter your age : ");
        age = sc.nextLine().trim();
        System.out.println();
        System.out.print("Enter your Gender(male/female) : ");
        gender = sc.nextLine().trim();
        System.out.println();
        hmap.put(idCnt++,Arrays.asList(pass,name,age,gender));
        System.out.println("Successfully Registered!");

    }
}
