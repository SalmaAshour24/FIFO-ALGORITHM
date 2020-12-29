/*
 * T o change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgreplacmentalgorithm;

    public class FirstInFirstOut {
    public int page , frame;
    public int [] pages;
        
    FirstInFirstOut(){
    page=0;
    frame=0;
    }
    public void Setpage(int p)
    {this.page=p;
    }
    
    public int Getpage()
    { return page;
    }
    
    public void Setframe(int f)
    {this.frame=f;
    }
    
    public int Getframe()
    {return frame;
    }

   public void Setpages(int [] pg)
    {this.pages=pg;
    }
    
    public int[] Getpages()
    {
        return pages;
    }
    
    
   public void CheckingEmpty(int Frame, int []Farray)
{
    
    for(int arrayf = 0; arrayf < Frame; arrayf++)
         {   Farray[arrayf] = -1;}
     }
  
  public void PageHitANDMiss(int Page , int Frame , int [] Farray , int[] Parray  ){
     { int counterf=0;
       int hit=0,fault=0;
       for(int Arrayp = 0; Arrayp < Page; Arrayp++)
       { 
         int block=-1;
         for(int Arrayf = 0; Arrayf < Frame; Arrayf++)
      {
             
          if(Farray[Arrayf] == Parray[Arrayp])
          { hit++;
            block = Arrayf;
         System.out.println();
         System.out.println("There Exist Page Hit By Entering Page Number" + Parray[Arrayp] +"->"+" "+"Hit number:"+ hit);
           
             break;
          }
         }
        
         if(block<0)
         {
          Farray[counterf] = Parray[Arrayp];
          fault++;
          counterf++;
          System.out.println();
          System.out.println("There Exist Page Fault By Entering Page Number" + Parray[Arrayp] +"->"+" "+"Fault number:"+fault);
        
         if(counterf == Frame)
            counterf = 0;
         }
         
        System.out.print("Frame:");
           for(int j = 0; j < Frame; j++)
           System.out.print(Farray[j]+" "); 
       }
      
        System.out.println();
        System.out.println("The number of Hits-> " + hit);
        System.out.println("The number of Faults-> " + fault);
        System.out.println();
        }
   }
    }