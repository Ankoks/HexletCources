package ru.ankoks.structures.practice.m1;

import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * User: ankoks
 * Date: 22.11.2018
 */
public class ArrayColletionTest {

    @Test
    public void testSizeWhenSizeIs0() {
        final Collection<Integer> testInstance = new ArrayColletion<>();
        assertEquals(0, testInstance.size());
    }

    @Test
    public void testIsEmptyWhenEmpty() {
        final Collection<Integer> testInstance = new ArrayColletion<>();
        assertTrue(testInstance.isEmpty());
    }

    @Test
    public void testContains() {
        final Collection<Integer> testInstance = new ArrayColletion<>();

        testInstance.add(1);
        testInstance.add(2);

        assertTrue(testInstance.contains(1));
        assertFalse(testInstance.contains(0));
    }

    @Test
    public void testAdd() {
        final Collection<Integer> testInstance = new ArrayColletion<>();

        testInstance.add(1);
        testInstance.add(2);

        assertEquals(2, testInstance.size());
        assertFalse(testInstance.isEmpty());
    }

    @Test
    public void testRemoveFirstElement() {
        final Collection<Integer> testInstance = new ArrayColletion<>();

        testInstance.add(1);
        testInstance.add(2);
        testInstance.remove(1);

        assertEquals(1,  testInstance.size());
        assertFalse(testInstance.isEmpty());
    }
}
