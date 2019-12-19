/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.*;

/**
 *
 * @author Sidney Seay
 * sseay5@student.gsu.edu
 * CSC3410 - Fall 2015
 * TR 11:00 a.m.-12:15 p.m.
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ArrayList<Integer> arrayRandom = new ArrayList<Integer>(50);

        for (int i=0; i<50; i++){
           Random rand = new Random(); 
           int x = rand.nextInt(40);
           System.out.println(x);
        }
        
//        for(i=0; i<50; i++;){
//        arrayRandom.add((i+1));   
// 
//    System.out.println(arrayRandom);
//
//}
    }
    
}
