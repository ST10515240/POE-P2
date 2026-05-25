package com.mycompany.mavenproject2;


import java.util.Scanner;

public class Username {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Username : ");
        String Username = input.nextLine();
        
         if(isValidUsername(Username)){
       System.out.println("username successfully captured");
        
        
        
        
    }
            
   
}

    private static boolean isValidUsername(String Username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }   
       }
            
    
