package designpatterns.iterator.asd;

import java.util.*;

public class SwimmersList implements Iterable<Swimmer>
{
    private Vector slist= new Vector();
    
    public void addSwimmer( Swimmer swimmer){
        slist.addElement(swimmer);
    }
    
     @Override
    public Iterator<Swimmer> iterator() {
        return slist.iterator();
    }
    
    public Iterator<Swimmer> reverseIterator(){
        return new ReverseIterator<>(slist);
    }
    
    public Vector getVector(){
        return slist;
    }
}
