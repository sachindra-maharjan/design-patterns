/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.iterator.selective;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author sachindra
 */
public class Main {

    public static void main(String[] args) {
        Integer[] arry = {1, 3,4,7};
        List<Integer> list = Arrays.asList(arry);
        
        Predicate<Integer> p = new PositiveNumberPredicate();
        
        Functor<Integer,Double> f = new AverageFunctor();
        
        SelectiveIterator<Integer, Double> sit = new SelectiveIterator<>(list, f, p);
        
//        Iterator<Integer> it = sit.iterator();
//        
//        while(it.hasNext()){
//            System.out.println("Number: " + it.next());
//        }
        
        System.out.println("Avg: " + sit.doAll(list, f, p));
                
                
        
        
        
    }
    
}
