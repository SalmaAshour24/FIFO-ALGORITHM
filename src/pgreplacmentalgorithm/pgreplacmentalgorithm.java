/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgreplacmentalgorithm;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
//import javax.swing.JFrame;

public class pgreplacmentalgorithm  {

    //page replacement fifo algo
    //main    
    public static void main(String[] args) throws NoSuchElementException, ClassNotFoundException, IOException {
    CallingVariables f =new CallingVariables();
    OptimalCallingVariables o=new OptimalCallingVariables();
    Scanner sc=new Scanner (System.in);
    
    int choice;
   
       System.out.println("-> Page Replacement Algorithm ");
            do{
        System.out.println("Press 1->For FIFO Algorithm");
        System.out.println("Press 2->For Optimal Algorithm");
        System.out.println("Press 3-> for existing");
           choice=sc.nextInt();
        
           
           if(choice==1)   
        { 
            System.out.println("Press 1->For user input");
            System.out.println("Press 2->For file input");
             int ch=sc.nextInt();
             f.fifo(ch);
        }
          
            else if(choice==2)
           {
            System.out.println("Press 1->For user input");
            System.out.println("Press 2->For file input");
             int ch=sc.nextInt();
             o.Optimal(ch);
           }
            
          else if (choice==3)
            {  
                System.out.println("Thank You");
                break;
            }
          else 
              System.out.println("please enter correct choice");
       }while(choice!=3);
    
       //JFrame ff = new JFrame();
      // ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //ff.setVisible(true);
    }} 