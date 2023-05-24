package org.example;

import org.dataStructures.Queue;
import org.entidades.Person;
import org.entidades.PriorityLevel;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Gabriel", 21, PriorityLevel.NORMAL);
        Person p2 = new Person("Lucas", 10, PriorityLevel.NORMAL);
        Person p3 = new Person("Maria", 29, PriorityLevel.NORMAL);
        Person p4 = new Person("Pedro", 21, PriorityLevel.NORMAL);
        Person p5 = new Person("Yasmin", 11, PriorityLevel.NORMAL);
        Person p6 = new Person("Felipe", 15, PriorityLevel.NORMAL);
        Person p7 = new Person("Eduardo", 90, PriorityLevel.NORMAL);
        Person p8 = new Person("Sara", 65, PriorityLevel.NORMAL);


        Queue queue = new Queue(5);

        queue.enqueue(p1);
        queue.enqueue(p2);
        queue.enqueue(p3);
        queue.enqueue(p4);
//        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
//        System.out.println(queue);
        queue.enqueue(p5);
        queue.enqueue(p6);
        queue.enqueue(p7);
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}