/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgreplacmentalgorithm;

/**
 *
 * @author pc
 */
public class OptimalAlgorithm {
    int pointer;
     public void EmptyChecking(int frames, int []farray)
{           //to insert -1 at first in all empty frames
         for(int arrayf = 0; arrayf < frames; arrayf++)
         {   farray[arrayf] = -1;
         }
}
     
public void OptimalPageHitAndMiss(int pages , int frames , int [] farray , int[] parray)
     {boolean full = false;
     int hit=0,fault=0;
     int farray2[] = new int[frames];
     
       for(int i = 0; i < pages; i++)
        {//to check page hit lw el rkm el fl frame 2ad el fl array of pages yb2a 7asal hit f el hitbox=el j 
          int hitbox = -1;
        
            for(int j = 0; j < frames; j++)
         {
          if(farray[j] == parray[i])
          { //means that there exist page hit 
           hitbox = j;
           hit++;
        System.out.println();
        System.out.println("There Exist Page Hit By Entering Page Number" + parray[i] +"->"+" "+"Hit number:"+ hit);
           break;
          } 
         }
         //page fault exists
         // el rkm mtl3sh mwgod fl frame
         if(hitbox == -1)
         {
          if(full)
          {
           for(int j = i+1; j < pages; j++)
           {
            for(int y = 0; y < frames; y++)
            {
             if((parray[j] == farray[y]) )
             {
              farray2[y] = j;
              break;
             }
            }
           }
        int max = farray2[0];
           pointer = 0;
           if(max == pages)
             { max = 0;}
           for(int j = 0; j < frames; j++)
           {
            if(farray2[j] == 0)
              farray2[j] = pages;
            if(farray2[j] > max)
            {
            max = farray2[j];
             pointer = j;
            }
            if(farray2[j]==pages)
            {
              System.out.println(farray2[j]+" "+" means that page number"+" "+farray[j]+" "+"doesn't exists in the array anymore");
           
           }
            else{
              System.out.println(farray2[j]+" "+" means that apage number"+" "+farray[j]+" " +"exists in the array in index"+""+ farray2[j]);
            }
      } }
          farray[pointer] = parray[i];
          fault++;
          System.out.println();
          System.out.println("There Exist Page Fault By Entering Page Number" + parray[i] +"->"+" "+"Fault number:"+fault);
           
             pointer++;
              if(pointer == frames)
              {
               pointer = 0;
               full = true;
              }
          }
         
            System.out.print("Frame:");
           for(int j = 0; j < frames; j++)
           System.out.print(farray[j]+" "); 
            System.out.println();
        }
     
        System.out.println();
        System.out.println("The number of Hits: " + hit);
        System.out.println("The number of Faults: " + fault);
        System.out.println();
     
     }

}
     
