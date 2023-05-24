package org.dataStructures;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack <E> {
    protected LinkedList<E> list = new LinkedList<>();

    public void push(E element){
        list.addFirst(element);
    }

    public E pop(){
        if(list.isEmpty()){
            throw new EmptyStackException();
        }
        E elementRemoved = list.removeFirst();
        return elementRemoved;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public E peek(){
        if(isEmpty()){
            return null;
        }
        return list.peek();
    }

    public int size(){return list.size();}

    @Override
    public String toString() {
        return "Stack {" + list + '}';
    }
}
