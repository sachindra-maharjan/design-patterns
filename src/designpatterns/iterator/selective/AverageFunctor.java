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
public class AverageFunctor implements Functor<Integer, Double> {
    
    int value = 0;
    int count = 0;
    
    @Override
    public void compute(Integer num) {
        value += num;
        count++;
    }

    @Override
    public Double getValue() {
        if(count > 0)
            return (double)(value / count);
        
        return (double)value;
    }
}
