package main.java.org.java.model;

import java.util.ArrayList;

public class ArrayListCollection {
    static ArrayList<String> elements  = new ArrayList<>();
    public int size = 0;


    public static String addElement(String element) {
        elements.add(element);
        return element;
    }

    public static ArrayList<String> removeElement(String element) {
        elements.remove(element);
        return elements;
    }
 public static ArrayList<String> getArrayList() {
        return elements;
 }

    public static ArrayList<String> addThreeElement(String element) {
        elements.add(element);
        elements.add(element);
        elements.add(element);
        return elements;
    }

    public static ArrayList<String> removeOneElement(String element){
        elements.remove(element);
        return elements;
    }


}
