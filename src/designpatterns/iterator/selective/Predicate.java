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
 */
public interface Predicate<T> {
    public boolean test(T param);
}
