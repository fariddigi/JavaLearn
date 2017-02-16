/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myiterable;
import java.util.Iterator;
import java.util.ListIterator;
/**
 *
 * @author Farid
 */
public class MyIterableTester {
    public static void main (String [] args){
      Integer [] ints ={1, 2, 3}; 
      String [] strings = {"A","B","C"};
      MyIterable <Integer> myList;
      myList = new MyIterable<>(ints);
      MyIterable.printMe(ints);
      //Simple Iterator
      SimpleIterator s;
      s= new SimpleIterator();
      s.al.add("A");
      s.al.add("B");
      Iterator itr = s.al.iterator();
       for (Object i :  s.al ) {
       System.out.println(i);
     }
       while (itr.hasNext()){
           Object j= itr.next();
           System.out.println(j);
       }
       ListIterator litr = s.al.listIterator();
       while (litr.hasNext()){
           Object e= litr.next();
           litr.set(e + "FF");
       }    
       for (Object j: s.al){
           System.out.println(j);
       }
          
}
}