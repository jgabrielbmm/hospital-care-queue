package org.management;

import org.entidades.PriorityLevel;

public class Priority {
    private PriorityLevel priority;

    public Priority(PriorityLevel priority) {
        this.priority = priority;
    }

    public PriorityLevel getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "{" +
                "priority=" + priority +
                '}';
    }
}
