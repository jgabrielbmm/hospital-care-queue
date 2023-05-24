package org.management;

import org.dataStructures.Queue;
import org.dataStructures.Stack;
import org.entidades.Person;
import org.entidades.PriorityLevel;

import java.util.Arrays;

public class Management {
    Queue normalQueue = new Queue(10);
    Queue lightQueue = new Queue(10);
    Queue seriousQueue = new Queue(10);
    Queue severeQueue = new Queue(10);
    Stack<Priority> serviceStack = new Stack();
    Priority[] list = {
            new Priority(PriorityLevel.NORMAL),
            new Priority(PriorityLevel.SEVERE),
            new Priority(PriorityLevel.SERIOUS),
            new Priority(PriorityLevel.SEVERE),
            new Priority(PriorityLevel.LIGHT),
            new Priority(PriorityLevel.SERIOUS),
            new Priority(PriorityLevel.SEVERE),
    };

    public Management() {
       fillStack();
    }

    public void add(Person person){
        if(serviceStack.isEmpty()){
            fillStack();
        }
        if(person.getPriority() == PriorityLevel.LIGHT){
            lightQueue.enqueue(person);
        } else if (person.getPriority() == PriorityLevel.NORMAL){
            normalQueue.enqueue(person);
        } else if (person.getPriority() == PriorityLevel.SERIOUS){
            seriousQueue.enqueue(person);
        } else if (person.getPriority() == PriorityLevel.SEVERE) {
            severeQueue.enqueue(person);
        }
    }

    public Person callForService(){
        if(serviceStack.isEmpty()){
            fillStack();
        }
        Priority currentPriority = serviceStack.peek();
        serviceStack.pop();
        if(currentPriority.getPriority() == PriorityLevel.LIGHT && !lightQueue.isEmpty()){
           return lightQueue.dequeue();
        } else if (currentPriority.getPriority() == PriorityLevel.NORMAL && !normalQueue.isEmpty()){
            System.out.println(normalQueue.peek());
           return  normalQueue.dequeue();
        } else if (currentPriority.getPriority() == PriorityLevel.SERIOUS && !seriousQueue.isEmpty()) {
            return seriousQueue.dequeue();
        } else if (currentPriority.getPriority() == PriorityLevel.SEVERE && !seriousQueue.isEmpty()) {
            return severeQueue.dequeue();
        }

        return null;
    }

    private void fillStack(){
        for (Priority priority : list ){
            serviceStack.push(priority);
        }
    }

    @Override
    public String toString() {
        return "Management{" + "\n" +
                "normalQueue=" + normalQueue + "\n" +
                ", lightQueue=" + lightQueue + "\n" +
                ", seriousQueue=" + seriousQueue + "\n" +
                ", severeQueue=" + severeQueue + "\n" +
                ", serviceStack=" + serviceStack + "\n" +
                '}';
    }
}
