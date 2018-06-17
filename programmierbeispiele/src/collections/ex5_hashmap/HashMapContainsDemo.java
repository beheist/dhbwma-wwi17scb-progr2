package collections.ex5_hashmap;

import java.util.*;

public class HashMapContainsDemo {
    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();

        Student klaus = new Student("Klaus", "Klausen", "123456");
        Student paula2 = new Student("Paula2", "Paulsen", "2123789");
        Student paula3 = new Student("Paula3", "Paulsen", "3123789");
        Student paula = new Student("Paula", "Paulsen", "123789");

        map.put(1, klaus);
        map.put(2, paula);
        map.put(3, paula2);
        map.put(4, paula3);

        System.out.println(map.containsValue(klaus));
        System.out.println(map.containsValue(new Student("Klaus", "Klausen", "123456")));
        System.out.println("----------------------");

        Set<Integer> keys = map.keySet();


        ArrayList<Integer> keyList = new ArrayList<Integer>(keys);

        Collections.sort(keyList);

        Iterator<Integer> it = keyList.iterator();
        while (it.hasNext()) {
            Student s = map.get(it.next());
            System.out.println(s);
        }
    }
}
