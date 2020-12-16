package help;

import java.util.*;
import java.util.function.Consumer;

public class MyIterator implements Iterable {

    ArrayDeque arrayDeque;

    @Override
    public Iterator iterator() {

        return new Iterator() {
            @Override
            public boolean hasNext() {
                return arrayDeque.peek()!=null;
            }

            @Override
            public Object next() {
                return arrayDeque.pop();
            }
        };
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    public MyIterator(List list) {
       //Можно сделать так, но тогда теряется смысл задания
        //arrayDeque = new ArrayDeque(list);
        arrayDeque = new ArrayDeque();
        for (Object e : list) {
            arrayDeque.push(e);
        }
    }
}
