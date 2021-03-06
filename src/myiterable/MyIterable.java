/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myiterable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Farid
 */
public class MyIterable <T> implements Iterable <T>{

    private List<T> list;
    public MyIterable (T[] t){
        list= Arrays.asList(t);
        Collections.reverse(list);
    }
    /**
     * @param x
     * @param args the command line arguments
     */
    
   public static <T> void printMe (T [] x) {
     for (T i :x ) {
       System.out.println(i);
     }
   }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
     }

}
