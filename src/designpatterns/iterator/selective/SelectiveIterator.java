/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.iterator.selective;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author sachindra
 * @param <T>
 * @param <R>
 */
public class SelectiveIterator<T,R> implements Iterable<T>{

    List<T> list;
    Functor<T, R> avgFunctor;
    Predicate<T> positivePredicate;
    List<T> newList;
    
    public SelectiveIterator(){}
    public SelectiveIterator(List<T> list,
                             Functor<T, R> avgFunctor,
                             Predicate<T> positivePredicate){
        this.list = list;
        this.avgFunctor = avgFunctor;
        this.positivePredicate = positivePredicate;
        newList = new ArrayList<>();
        filter();
    }
    
    public void filter(){
        for(T i: list){
            if(positivePredicate.test(i)){
                newList.add(i);
            }
        }
    }
    
    public R doAll(List<T> list,
                             Functor<T, R> avgFunctor,
                             Predicate<T> positivePredicate){
        list.stream().forEach((i) -> {
            avgFunctor.compute(i);
        });
        
        return avgFunctor.getValue();
    }
    
    @Override
    public Iterator<T> iterator() {
        return newList.iterator();
    }
    
}
