/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.morestatecapitals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author boburmurtozaev
 */
public class StateCapitalsApp {
    
    //to be continued
    
    public static void main(String[] args) throws Exception {
        
        Map<String, Capital> capitals = new HashMap<>();
        
        Scanner scan = new Scanner(new BufferedReader(new FileReader("/Users/boburmurtozaev/NetBeansProjects/MoreStateCapitals/MoreStateCapitals.txt")));
        
        while(scan.hasNextLine()){
            
            String textLine = scan.nextLine();
            
            String[] chunks = textLine.split("::");
            
            String state = chunks[0];
            
            Capital cap = new Capital();
            
            cap.setName(chunks[1]);
            cap.setPopulation(Integer.parseInt(chunks[2]));
            cap.setSqrMile(Double.parseDouble(chunks[3]));
            
            capitals.put(state, cap);
        }
        
        for(String state:capitals.keySet()){
            
            System.out.println(state+": "+capitals.get(state));
        }
        
        
    }
    
}
