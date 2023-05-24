package org.dataStructures;
import org.entidades.Person;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Queue {
    private final Person[] queue;
    private int rear;
    private int front;
    private int size;

    private int maxCapability;

    public Queue(int arraySize) {
        queue = new Person[arraySize];
        rear = 0;
        front = 0;
        size = 0;
        maxCapability = arraySize;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(Person person){
        if (maxCapability == size){
            throw new Error("Queue is full!");
        }
        queue[rear] = person;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public Person dequeue(){
        if(isEmpty()){
            throw new Error("Queue is empty");
        }
        Person removedPerson = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        size--;
        return removedPerson;
    }

    public Person peek(){
        if(isEmpty()){
            throw new Error("Queue is empty");
        }
        return queue[front];
    }

    @Override
    public String toString() {
        return "Queue{" +
                "queue=" + Arrays.toString(queue) +
                ", rear=" + rear +
                ", front=" + front +
                ", size=" + size +
                '}';
    }
}
