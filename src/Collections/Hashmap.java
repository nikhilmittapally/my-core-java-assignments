package Collections;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"Coffee");
        map.put(2,"Dosa");
        map.put(3,"Coke");
        map.put(4,"Bread");

        System.out.println("Iterating Hashmap");

        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }
    }
}
