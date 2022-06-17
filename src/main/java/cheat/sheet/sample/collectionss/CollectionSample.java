package cheat.sheet.sample.collectionss;

import java.util.*;

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

        list.add(1);
        list.add(2);
        list.add(3);

        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println("max = " + max);

        list.clear();
        Integer maxAfterClear = list.stream().max(Integer::compareTo).orElseThrow(NoSuchElementException::new);
        System.out.println("maxAfterClear = " + maxAfterClear);
    }

    public void show_map() {
        /*
        LinkedHashMap과 TreeMap
        Map의 가장 큰 특징은 순서에 의존하지 않고 key로 value를 가져오는데 있다.
        하지만 가끔은 Map에 입력된 순서대로 데이터를 가져오고 싶은 경우도 있고
        때로는 입력된 key에 의해 소트된 데이터를 가져오고 싶을 수도 있을 것이다.
        이런경우에는 LinkedHashMap과 TreeMap을 사용하는 것이 유리하다.

        LinkedHashMap은 입력된 순서대로 데이터를 저장하는 특징을 가지고 있다.
        TreeMap은 입력된 key의 오름차순 순서로 데이터를 저장하는 특징을 가지고 있다.
        * */
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
        String s = map.get(0);
        System.out.println(s);
        System.out.println(map.get(5)); // null

        // get or default
        System.out.println(map.getOrDefault(5, null));

        // keySet
        System.out.println(map.keySet());

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

    public void show_set() {
        HashSet<Object> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6));
        HashSet<Object> set2 = new HashSet<>(Arrays.asList(4, 4, 5, 6, 7, 8, 9));
        System.out.println("SET 1: " + set1);
        System.out.println("SET 2: " + set2);

        // 교집합
        HashSet<Object> interSet = new HashSet<>(set1);
        interSet.retainAll(set2);
        System.out.println("InterSet: " + interSet);

        // 합집합
        HashSet<Object> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("UnionSet: " + unionSet);

        // 차집합
        HashSet<Object> subSet = new HashSet<>(set1);
        subSet.removeAll(set2);
        System.out.println("SubSet: " + subSet);
        System.out.println("=====================================================");

        HashSet<Object> set = new HashSet<>();
        // insert
        set.add("Hello");
        set.add("World");
        set.addAll(Arrays.asList("Hi", "Nice"));
        System.out.println("SET: " + set);

        // delete
        set.remove("Hi");
        System.out.println("SET: " + set);

        // delete all
        set.removeAll(Arrays.asList("Nice", "Hello"));
        System.out.println("SET: " + set);
    }
}
