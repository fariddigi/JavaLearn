/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myiterable;

/**
 *
 * @author Farid
 */
public class MyIterableTester {
    public static void main (String [] args){
      Integer [] ints ={1, 2, 3}; 
      String [] strings = {"A","B","C"};
      MyIterable <String> myList;
        myList = new MyIterable<>(strings);
            for (String i: myList){
            System.out.println(i);
        } 
        
}
}