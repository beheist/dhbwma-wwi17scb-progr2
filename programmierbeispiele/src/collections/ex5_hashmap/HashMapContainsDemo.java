package collections.ex5_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapContainsDemo {
    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();

        Student klaus = new Student("Klaus", "Klausen", "123456");
        Student paula = new Student("Paula", "Paulsen", "123789");

        map.put(1, klaus);
        map.put(2, paula);

        System.out.println(map.containsValue(klaus));
        System.out.println(map.containsValue(new Student("Klaus", "Klausen", "123456")));
        System.out.println("----------------------");

        Set<Integer> keys = map.keySet();
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()) {
            Student s = map.get(it.next());
            s.print();
        }
    }
}
