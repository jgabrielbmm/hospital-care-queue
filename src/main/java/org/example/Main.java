package org.example;

import org.dataStructures.Queue;
import org.entidades.Person;
import org.entidades.PriorityLevel;
import org.management.Management;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Gabriel", 21, PriorityLevel.NORMAL);
        Person p2 = new Person("Lucas", 10, PriorityLevel.SERIOUS);
        Person p3 = new Person("Maria", 29, PriorityLevel.LIGHT);
        Person p4 = new Person("Pedro", 21, PriorityLevel.NORMAL);
        Person p5 = new Person("Yasmin", 11, PriorityLevel.SEVERE);
        Person p6 = new Person("Felipe", 15, PriorityLevel.SEVERE);
        Person p7 = new Person("Eduardo", 90, PriorityLevel.NORMAL);
        Person p8 = new Person("Sara", 65, PriorityLevel.LIGHT);
        Management management = new Management();

        management.add(p1);
        management.add(p3);
        management.add(p4);

        System.out.println(management.callForService());
        System.out.println(management.callForService());
        System.out.println(management.callForService());
        System.out.println(management.callForService());
        System.out.println(management.callForService());
        System.out.println(management.callForService());
//        System.out.println(management.callForService());
//        System.out.println(management.callForService());
        System.out.println(management);

    }
}