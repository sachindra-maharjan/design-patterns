/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.iterator.selective;

/**
 *
 * @author sachindra
 */
public class PositiveNumberPredicate<T> implements Predicate<T> {

    @Override
    public boolean test(T param) {
        return (Integer)param >= 0;
    }
}
