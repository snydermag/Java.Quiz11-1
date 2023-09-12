package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        Set<Set<T>> set = new LinkedHashSet<>();
        List<List<T>> list = new ArrayList<>();
        Object[] array = originalSet.toArray();

        for (int i = 0; i < originalSet.size(); i++){
            List<T> temp = new ArrayList<>();
            for (int j = i; j < originalSet.size(); j++){
                temp.add((T) array[j]);
            }
            list.add(temp);

            List<T> other = new ArrayList<>();
            for (int j = i + 1; j < originalSet.size(); j++){
                other.add((T) array[i]);
                other.add((T) array[j]);
                list.add(other);
            }

        }
        List<T> blank = new ArrayList<>();

        list.add(blank);

        return list;
    }

    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(T... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

