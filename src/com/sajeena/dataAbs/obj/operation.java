/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.dataAbs.obj;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public abstract class operation {
       Scanner input= new Scanner(System.in);
     public int inputx()
     {  
         
         System.out.print("Enter x:");
         int x= input.nextInt();
         return x;
                
     }
      public int inputy()
     {  
         
        System.out.print("Enter y:");
         int y= input.nextInt();
         return y;
                
     }
      
     public abstract void operate(int x, int y);
     
     
    
    
}
