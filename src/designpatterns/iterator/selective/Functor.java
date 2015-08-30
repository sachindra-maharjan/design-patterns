/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.iterator.selective;

/**
 *
 * @author sachindra
 * @param <T>
 * @param <R>
 */
public interface Functor<T, R> {
    public void compute(T num);
    public R getValue();    
}
