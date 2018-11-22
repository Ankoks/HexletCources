package ru.ankoks.structures.practice.ex1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * User: ankoks
 * Date: 22.11.2018
 */
public class University implements Iterable<Student> {

    private final Student[] students;

    public University(final Student[] students) {
        this.students = students;
    }

    public Iterator<Student> iterator() {
        return new StudentsIterator();
    }

    private class StudentsIterator implements Iterator<Student> {
        // BEGIN (write your solution here)
        private int index = 0;

        @Override
        public boolean hasNext() {
            return University.this.students.length > index;
        }

        @Override
        public Student next() {
            try {
                return University.this.students[index++];
            } catch (Exception e) {
                throw new NoSuchElementException();
            }
        }
        // END
    }

}