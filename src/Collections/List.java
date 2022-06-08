package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class List {
    /**
     * Insert from the end O(1)
     * Get by index O(1)
     * Insert in the middle O(n)
      */
    public void arrayList(){
        ArrayList<Object> objectArrayList =  new ArrayList<>();
        objectArrayList.add(new String());
        objectArrayList.add(1);


    }

    /**
     * Collision -> adding to the new list
     */
    public void hasMap(){
        HashMap<String, String> nullMap = new HashMap<String, String>();
        nullMap.put(null, "test");
        System.out.println(nullMap.hashCode());

    }

    public void arrayDeque(){
        ArrayDeque<Object> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(new Object());
        arrayDeque.addFirst(new Object());
        arrayDeque.peek(); //without deleting
        arrayDeque.poll(); //with deleting
        arrayDeque.pop(); //first element with deleting
    }

    /**
     * Treeset <Comparable> !!!
     * implements Comparable
     * can be ovverided
     *
     * Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator());
     * TreeSet<Person> people = new TreeSet(pcomp);
     */
    public void treeSet(){
        TreeSet<Object> treeSet =  new TreeSet<>();
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(new Integer("2").intValue());
        treeSet.add(2); // no exception
        System.out.println(treeSet.first()); // 2
    }

    public static void main(String[] args) {

    }
}
