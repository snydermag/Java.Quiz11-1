package rocks.zipcode.io.quiz4.generics;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T> implements Comparable<T>{
    Set<T> set;
    public ComparableTreeSet(T... arr) {
        set = new TreeSet<>();
        for (T t : arr){
            set.add(t);
        }
    }

    public ComparableTreeSet() {
        set = new TreeSet<>();
    }

    public int compareTo(ComparableTreeSet<T> o) {
        return Integer.valueOf(null);
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
