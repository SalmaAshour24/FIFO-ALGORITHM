/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgreplacmentalgorithm;

import java.util.Scanner;

public class CallingVariables {
    
    public void fifo() {
    
        
        int Frame, Page;
        Scanner sc=new Scanner(System.in);    
       FirstInFirstOut pg=new FirstInFirstOut();
     
       
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
        
       int [] Parray = new int[Page];
       int [][]FinalFrame=new int[Page][Frame];
         int []Farray = new int[Frame];
       int  counter = 0, hit = 0, fault = 0;
     
       System.out.println("Please Enter The Numbers Of The Pages:");
        for(int i = 0; i < Page; i++)
        {   Parray[i] = sc.nextInt();
        }
        pg.Setpages(Parray);
        System.out.println();
       
    pg.CheckingEmpty(Frame, Farray);
    pg.PageHitANDMiss(Page, Frame, Farray, Parray, FinalFrame, hit, fault, counter);
     }}
