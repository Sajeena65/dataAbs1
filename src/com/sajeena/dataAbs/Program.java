/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.dataAbs;
import com.sajeena.dataAbs.obj.operation;
import com.sajeena.dataAbs.obj.operationfactory;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner input=new Scanner(System.in);
       
       while(true)
       {
       System.out.println("1.Add");
       System.out.println("2.Sub");
       System.out.println("3.Mul");
       System.out.println("4.Div");
       System.out.println("5.Max");
       System.out.println("6.Min");
       System.out.println("7.Power");
       System.out.println("8.Exit");
       System.out.print("Enter your choice[1-8]:");
       int choice=input.nextInt();
       operation op;
       
       switch(choice)
               {
               case 1:
                     op= operationfactory.get("add");
                     calculation(op);
               break;
               case 2:
                  op= operationfactory.get("sub");
                  calculation(op);
               break;
               case 3:
                   op= operationfactory.get("mul");
                   calculation(op);
               break;
               case 4:
                   op= operationfactory.get("div");
                   calculation(op);
                    break;
               case 5:
                   op= operationfactory.get("max");
                   calculation(op);
                    break;
               case 6:
                   op= operationfactory.get("min");
                   calculation(op);
                    break;
               case 7:
                   op= operationfactory.get("power");
                   calculation(op);
                    break;
              
               case 8:
                   System.exit(0);
               break;
               
               }
       System.out.print("Do you want to continue?(Y/N):");
                    String t=input.next();
                    if(t.equalsIgnoreCase("N")){
                    System.exit(0);
                    }
                    
                  
               }
       
    }
    
    public static void calculation(operation op){
        if(op!=null){
            int a,b,c;
                     a= op.inputx();
                     b= op.inputy();
                     c = op.operate(a, b);
                    op.output(c);  }else
                         System.out.println("No Suitable operation");
        
    }// TODO code application logic here
    }
 

