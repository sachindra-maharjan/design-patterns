/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.iterator.asd;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author sachindra
 */
public class ReverseIterator<T> implements Iterator<T>{
    Vector<T> vector;
    int index = 0;
    
    public ReverseIterator(Vector vector){
        this.vector = vector;
        this.index = vector.size();
    }
    
    @Override
    public boolean hasNext() {
        return (index > 0);
    }

    @Override
    public T next() {
        
        if(this.hasNext()){
            return vector.get(--index);
        }
        
        return null;
    }
}
