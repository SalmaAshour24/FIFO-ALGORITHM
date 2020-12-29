package pgreplacmentalgorithm;
import java.util.Scanner;;
import java.io.*;
import java.util.NoSuchElementException;

/**
/**
 *
 * @author lenovo
 */
public class LRUcallingvariables {
      public int []Farray ;
      public int [] Parray ;
       public int frame,page;
    LRUReadFile rf=new LRUReadFile();
       LRUalgo lru=new LRUalgo();
       Scanner sc=new Scanner(System.in);
     int frames, pages;
    
  public void  LRU(int ch) throws NoSuchElementException, IOException, EOFException, ClassNotFoundException
    {
          System.out.println("Your choice was LRU algorithm");
     
        if(ch==1)
        {
    System.out.println("Please enter the number of Frames: ");
        frames = sc.nextInt();
        
        System.out.println("Please enter the length of the Reference string: ");
        pages = sc.nextInt();
        
        Parray = new int[pages];
        Farray = new int[frames];
        
        System.out.println("Please enter the reference string: ");
        for(int i = 0; i < pages; i++)
        {
            Parray[i] = sc.nextInt();
        }
        System.out.println();
       
        lru.checkingemptys(frames, Farray);
        lru.HitandMiss(pages, frames, Farray, Parray);
        
}
        else if(ch==2)
        {
 rf.ReadFile();
}
  else {
    System.out.println("please enter proper choice");
}
}
}