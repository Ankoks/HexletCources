package ru.ankoks.structures.practice.ex1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * User: ankoks
 * Date: 22.11.2018
 */
public class Main {

    public static void main(String[] args) {
        final int studentsCount = 10_000;
        final Student[] students = new Student[studentsCount];
        for (int i = 0; i < studentsCount; i++) {
            students[i] = new Student();
        }

        final University univ = new University(students);
        final Group group = new Group(students);
//        checkThaIteratorReturCorrectResults(univ, students);
//        checkThaIteratorReturCorrectResults(group, students);

        checkThatIteratorThrowsExceptions(univ.iterator());
        checkThatIteratorThrowsExceptions(group.iterator());
    }
    private static void checkThatIteratorThrowsExceptions(final Iterator<Student> students) {
        while(students.hasNext()) students.next();
        try {
            students.next();
            throw new RuntimeException("Iterator.next() do not throw the Exception when hasNext returns false");
        } catch(final NoSuchElementException e) {}
    }
}
