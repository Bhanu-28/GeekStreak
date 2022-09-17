package dSa;

import java.util.LinkedList;
public class List {
    public static void main(String[] args) {
        //linkedlist--each element is a node consist of 3 things
        // previous(link to previous element)  data() next(linked to next element )
        //arraylist
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.add(-5);
        integerLinkedList.add(-9);
        integerLinkedList.add(8);
        integerLinkedList.add(0);
        integerLinkedList.set(1,8);
        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.get(2));
        System.out.println(integerLinkedList.contains(0));
        System.out.println(integerLinkedList.lastIndexOf(0));


    }
}
