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

/**
 *
 * @author pc
 */
public class OptimalCallingVariables {
          OptimalReadFile orf=new OptimalReadFile();
   public void  Optimal(int ch) throws NoSuchElementException, IOException, EOFException, ClassNotFoundException{
     int frames , pages;
     Scanner sc=new Scanner(System.in);
      System.out.println("Your choice was optimal algorithm");
      
      if(ch==1)
      {
      System.out.println("Please enter the number of frames: ");
      frames=sc.nextInt();
       while(frames<=0)
       {
        System.out.println("please enter valid positive number greater than zero");
        frames =sc.nextInt();
     }
       System.out.println("Please enter the pages length ");
        pages =sc.nextInt();
        while(pages<=0)
         {
          System.out.println("please enter valid positive number greater than zero");
          pages =sc.nextInt();
         }
         int [] Parray = new int[pages];
         int []Farray = new int[frames];
       System.out.println("Please Enter The Numbers Of The Pages:");
        for(int i = 0; i < pages; i++)
        {   Parray[i] = sc.nextInt();
        }
        System.out.println();
   OptimalAlgorithm op=new OptimalAlgorithm();
   op.EmptyChecking(frames, Farray);
   op.OptimalPageHitAndMiss(pages, frames, Farray, Parray);
           }
      else if(ch==2)
      {
          orf.ReadFile();
      }
      }
}
        
