package rocks.zipcode.io.quiz4.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T> extends Group<T>{

    List<T> list;

    public SortedGroup(){
        list = new ArrayList<>();
    }

    @Override
    public void insert(T value) {
        list.add(value);
        list = sort(list);
    }

    @Override
    public void delete(T value) {
        list.remove(value);
    }

    public Integer indexOf(T value) {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(value)){
                return i;
            }
        }
        return null;
    }

    public List<T> sort(List<T> items){
        Object[] temp = new Object[items.size()];

        for (int i = 0; i < temp.length; i++){
            temp[i] = items.get(i);
        }

        Arrays.sort(temp);

        items.clear();

        for (int i = 0; i < temp.length; i++){
            items.add((T) temp[i]);
        }

        return items;

    }
}
