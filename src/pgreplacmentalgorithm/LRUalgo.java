package pgreplacmentalgorithm;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class LRUalgo {
    
    public void checkingemptys(int frames , int [] Farray)
    {
        for(int j = 0; j < frames; j++)
        { Farray[j] = -1;
    }
    }
    
    public void HitandMiss(int pages , int frames , int [] farray , int[] parray)
    {
        boolean full = false;
     int hit=0,fault=0,pointer=0;
      ArrayList<Integer> p = new ArrayList<Integer>();
        //to check page hit
      for(int i = 0; i < pages; i++)
        {
            int boxhit = -1;
            for(int j = 0; j < frames; j++)
            {
                if(farray[j] == parray[i])
                {
                    boxhit = j;
                    hit++;
                    System.out.println();
         System.out.println("There Exist Page Hit By Entering Page Number" + parray[i] +"->"+" "+"Hit number:"+ hit);
           
                    break;
                }
            }
            //to check page fault
            if(boxhit == -1)
            {
             if(full)
             {
              int min = pages;
                    for(int j = 0; j < frames; j++)
                    {
                     if(p.contains(farray[j]))
                        {
                            int temp = p.indexOf(farray[j]);
                            if(temp < min)
                            {
                                min = temp;
                                pointer = j;
                            }
                        }
                    }
             }
                farray[pointer] = parray[i];
                fault++;
               System.out.println();
          System.out.println("There Exist Page Fault By Entering Page Number" + parray[i] +"->"+" "+"Fault number:"+fault);
         
          
          
                  pointer++;
               if(pointer == frames)
                { // 3LSHAN YRG3 MN AWEL TANE
                 pointer = 0;
                 full = true;
                }
            }
            System.out.print("Frame:");
           for(int j = 0; j < frames; j++)
           System.out.print(farray[j]+" "); 
       }
      
        System.out.println();
        System.out.println("The number of Hits-> " + hit);
        System.out.println("The number of Faults-> " + fault);
        System.out.println();
        }
  
    
  }