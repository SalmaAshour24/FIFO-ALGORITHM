/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgreplacmentalgorithm;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author pc
 */
public class OptimalReadFile {
 
     OptimalAlgorithm oa=new OptimalAlgorithm();
 public void ReadFile() throws NoSuchElementException,EOFException,IOException,ClassNotFoundException
 {   try{
             String myfile;
             System.out.println("please enter the path of the file");
             Scanner sc=new Scanner(System.in);
             myfile=sc.nextLine();
             File file=new File(myfile);
              
        
             if(file.exists())
             {
         BufferedReader input=new BufferedReader(new FileReader(myfile));
                   
        int  Frame=Integer.parseInt(input.readLine());
          System.out.println("frame number is");
          System.out.println(Frame);
          
         int Page=Integer.parseInt(input.readLine());
          System.out.println("page length is");
          System.out.println(Page);
          
          int [] Parray=new int[Page];
          System.out.println("numbers of pages are");
          String s;
          s=input.readLine();
          StringTokenizer st=new StringTokenizer(s,"/");
          for(int j=0;j<Page;j++)
          {
              Parray[j]=Integer.parseInt(st.nextToken());
              System.out.print(Parray[j]+" ");
          }
         
            System.out.println();
         int []Farray= new int[Frame];
         
         oa.EmptyChecking(Frame, Farray);
         oa.OptimalPageHitAndMiss(Page, Frame, Farray, Parray);
             }
                
     }catch (EOFException exception) {
        System.out.println(exception);
        } catch (IOException | NoSuchElementException exception) {
       System.out.println(exception);
        }
   }
}

