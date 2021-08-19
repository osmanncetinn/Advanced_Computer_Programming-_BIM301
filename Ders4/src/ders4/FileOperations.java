/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Ödev:Bir metnin icinde  secilen kelimlerin kac tane oldugunu bulan ve sort eden program kodu.
package ders4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author 58456034780
 */
public class FileOperations {        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       ArrayList<String> list = new ArrayList<String>();
       BufferedReader br = null;
       String line;
        
        try{
            
         br= new BufferedReader(new FileReader("C:\\Users\\58456034780\\Desktop\\İBP\\names.txt"));
            line = br.readLine();
             while(line != null) {
              list.add(line);
             }
        
         }finally {
            if(br != null) {
                br.close();
            }

         }
        
         display(list);
         sortNames(list);
         System.out.println();
         display(list);
        System.out.println(searcName(list));
    }
    private static void display(Collection <String> L1) {
            
            for(String x:L1) 
                System.out.println(x);
        }
    private static void sortNames(List<String> L2){
        Collections.sort(L2);
        
    }
    private static int searcName(List <String> L3) {
      return  Collections.binarySearch(L3, "hilal Diler");
    }

    
}
