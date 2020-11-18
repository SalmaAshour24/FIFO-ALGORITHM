/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgreplacmentalgorithm;

import java.util.Scanner;

public class pgreplacmentalgorithm  {

    public static void main(String[] args) {
    CallingVariables f =new CallingVariables();
    Scanner sc=new Scanner (System.in);
    int choice;
    System.out.println("->PAGE REPLACMENT FIFO ALGORITHM.");
            
            do{
        System.out.println();
        System.out.println("Press 1->For User Input");
        System.out.println("Press 2-> for existing");
           choice=sc.nextInt();
           
           if (choice==1)
           {
               f.fifo();
           }
           
          else if (choice==2)
            {  
                System.out.println("Thank You");
                break;
            }
          else 
              System.out.println("please enter correct choice");
       }while(choice!=2);
}
}        

//main



