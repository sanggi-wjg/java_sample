package cheat.sheet.sample.collectionss;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListSample {

    public void sample() {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3));
        System.out.println(linkedList);

        // insert
        System.out.println("INSERT");
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList + "\n");

        // select
        System.out.println("SELECT");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1) + "\n");

        // update
        System.out.println("UPDATE");
        linkedList.set(0, 10);
        System.out.println(linkedList + "\n");

        // delete
        System.out.println("UPDATE");
        linkedList.remove(0);
        System.out.println(linkedList + "\n");
    }

}
