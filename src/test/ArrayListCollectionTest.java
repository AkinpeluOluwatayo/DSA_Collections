package test;

import main.java.org.java.model.ArrayListCollection;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListCollectionTest {
    @Test
    public void testArrayAddElement() {
        String actual = ArrayListCollection.addElement("Rice");
        String expected = "Rice";
        assertEquals(expected, actual);
    }
    @Test
    public void testArrayAddMoreThanOneElement() {
        String actual = ArrayListCollection.addElement("Beans");
        String actual2 = ArrayListCollection.addElement("Garri");
        String actual3 = ArrayListCollection.addElement("Pepper");
        assertEquals("Beans", actual);
        assertEquals("Garri", actual2);
        assertEquals("Pepper", actual3);
    }
    @Test
    public void testArrayRemoveElement() {
        String actual = ArrayListCollection.addElement("Spagetti");
        String actual1 = ArrayListCollection.addElement("Yam");
        ArrayList<String> actual2 = ArrayListCollection.removeElement("Yam");
        assertTrue(actual.equals("Spagetti"));
        assertTrue(actual1.equals("Yam"));
        assertFalse(actual2.contains("Yam"));

    }

    @Test
    public void testArrayGetSize() {
        String actual = ArrayListCollection.addElement("Spagetti");
        String actual1 = ArrayListCollection.addElement("Yam");
        ArrayList<String> actual2 = ArrayListCollection.removeElement("Yam");
        assertTrue(actual.equals("Spagetti"));
        assertTrue(actual1.equals("Yam"));
        assertFalse(actual2.contains("Yam"));
        assertEquals(1, actual2.size());
    }
    @Test
    public void testArrayAddThreeElementAndRemoveOneAndCheckForSize() {
        String actual = ArrayListCollection.addElement("Gold");
        String actual1 = ArrayListCollection.addElement("Diamond");
        String actual2 = ArrayListCollection.addElement("Silver");
        ArrayList<String> actual3 = ArrayListCollection.removeOneElement("Silver");
        assertTrue(actual.equals("Gold"));
        assertTrue(actual1.equals("Diamond"));
        assertTrue(actual2.equals("Silver"));
        assertFalse(actual3.contains("Silver"));
        assertEquals(2 , actual3.size());
    }

    @Test
    public void testArrayAddThreeElementAndRemoveOneAndCheckForSizeAndGetIndexOne() {
        String actual = ArrayListCollection.addElement("Gold");
        String actual1 = ArrayListCollection.addElement("Diamond");
        String actual2 = ArrayListCollection.addElement("Silver");
        ArrayList<String> actual3 = ArrayListCollection.removeOneElement("Silver");
        assertTrue(actual.equals("Gold"));
        assertTrue(actual1.equals("Diamond"));
        assertTrue(actual2.equals("Silver"));
        assertFalse(actual3.contains("Silver"));
        assertEquals(2 , actual3.size());
        assertEquals("Diamond",actual3.get(1));
    }



}
