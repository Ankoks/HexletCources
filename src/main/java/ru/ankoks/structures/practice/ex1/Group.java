package ru.ankoks.structures.practice.ex1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * User: ankoks
 * Date: 22.11.2018
 */
public class Group implements Iterable<Student> {

    private Student[] students;

    public Group(final Student[] students) {
        this.students = students;
    }

    public Iterator<Student> iterator() {
        return new StudentsIterator(students);
    }

    private static class StudentsIterator implements Iterator<Student> {
        // BEGIN (write your solution here)
        private int index = 0;
        private final Student[] students;

        StudentsIterator(Student[] students) {
            this.students = students;
        }

        @Override
        public boolean hasNext() {
            return students.length > index;
        }

        @Override
        public Student next() {
            try {
                return students[index++];
            } catch (Exception e) {
                throw new NoSuchElementException();
            }
        }
        // END
    }
}
