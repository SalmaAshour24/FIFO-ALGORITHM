/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgreplacmentalgorithm;

import java.io.EOFException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;



public class CallingVariables {
      public int []Farray ;
      public int [] Parray ;
       public int frame,page;
       FifoReadFile rf=new FifoReadFile();
     int Frame, Page;
    public void fifo(int ch) throws NoSuchElementException, IOException, IOException, EOFException, ClassNotFoundException{
        Scanner sc=new Scanner(System.in);    
       FirstInFirstOut pg=new FirstInFirstOut();
     
       System.out.println("Your choice was FIFO algorithm");
     
       if(ch==1)
       {
       System.out.println("Please Enter The Number Of Frames:");
       Frame=sc.nextInt();
       while(Frame<=0)
       {
           System.out.println("please enter valid positive number greater than zero");
        Frame =sc.nextInt();
     }
     
         pg.Setframe(Frame);
         
       System.out.println("Please Enter The Page Number:");
        Page=sc.nextInt();
         while(Page<=0)
         {
        System.out.println("please enter valid positive number greater than zero");
        Page =sc.nextInt();
         }
        pg.Setpage(Page);
         Farray = new int[Frame];
         Parray = new int[Page];
       System.out.println("Please Enter The Numbers Of The Pages:");
        for(int i = 0; i < Page; i++)
        {   Parray[i] = sc.nextInt();
        }
    
        pg.Setpages(Parray);
        System.out.println();
       
    pg.CheckingEmpty(Frame, Farray);
    pg.PageHitANDMiss(Page, Frame, Farray, Parray);
       }
    else if(ch==2)
       {
          rf.ReadFile();
         //pg.CheckingEmpty(Frame, Farray);
         //pg.PageHitANDMiss(Page, Frame, Farray, Parray);
       }
   }
}
