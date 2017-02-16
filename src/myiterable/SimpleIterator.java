/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myiterable;
import java.util.ArrayList ;
import java.util.Iterator;

/**
 *
 * @author Farid
 */

/**
 *
 * @author Farid
 */
public class SimpleIterator implements Iterable
{
  ArrayList al = new ArrayList();
    @Override
    public Iterator iterator() {
        return al.iterator();
    }

}
