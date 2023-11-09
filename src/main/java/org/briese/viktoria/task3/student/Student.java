package org.briese.viktoria.task3.student;

import org.briese.viktoria.task3.Subject.Subject;

public class Student<T extends Subject> {
    private String name;
    private T major;

    public Student(String name, T major) {
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public T getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", major=" + major.getClass().getSimpleName() +
                '}';
    }
}

