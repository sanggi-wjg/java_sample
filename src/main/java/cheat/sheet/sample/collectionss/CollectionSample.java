package cheat.sheet.sample.collectionss;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionSample {

    public void show_array_list() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // insert
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        System.out.println("size : " + list.size());
        System.out.println("get : " + list.get(list.size() - 1));

        // delete
        list.remove(0);
        System.out.println(list);

        // update
        list.set(0, 10);
        System.out.println(list);

        // clear
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
    }

    public void show_map() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        // insert
        map.put(0, "A");
        map.put(1, "B");
        map.put(2, "C");

        System.out.println(map);
        System.out.println("get " + map.get(1));

        System.out.println("isContainKey 0 : " + map.containsKey(0));
        System.out.println("isContainValue 0 : " + map.containsValue("0"));

        // get
        String s = map.get(5);
        System.out.println(s);

        // update
        map.put(0, "D");
        System.out.println(map);

        // remove
        map.remove(1);
        System.out.println(map);

        // clear
        map.clear();
        System.out.println(map);
    }
}
