package datastructures;

import java.util.*;

/**
 * Created by gfox on 17/05/2016.
 */
public class DataStructures {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        SortedSet<String> sortedSet = new TreeSet<>();
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(2, "B");
        sortedMap.put(1, "A");
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(2, "B");
        map.put(1, "A");

        List<String> list = new ArrayList<>(Arrays.asList("Bello", "Apple", "Dongo", "Carrot","Farm","End"));

        set.addAll(list);
        sortedSet.addAll(list);
        System.out.println(set);
        System.out.println(sortedSet);
        System.out.println(sortedMap);
        System.out.println(map);
    }
}
