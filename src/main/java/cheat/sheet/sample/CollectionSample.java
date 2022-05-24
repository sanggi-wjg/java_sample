package cheat.sheet.sample;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionSample {

    public void show_array_list() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        System.out.println("size : " + list.size());
        System.out.println("get : " + list.get(list.size() - 1));

        list.remove(0);
        System.out.println(list);

        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
    }

    public void show_map() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "A");
        map.put(1, "B");
        map.put(2, "C");

        System.out.println(map);
        System.out.println("get " + map.get(1));

        System.out.println("isContainKey " + map.containsKey(0));
        System.out.println("isContainValue " + map.containsValue("0"));

        map.remove(1);
        System.out.println(map);

        map.clear();
        System.out.println(map);
    }
}
