package org.entidades;

public class Person {
    private String name;
    private int age;
    private PriorityLevel priority;

    public Person(String name, int age, PriorityLevel priority) {
        this.name = name;
        this.age = age;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PriorityLevel getPriority() {
        return priority;
    }
}
