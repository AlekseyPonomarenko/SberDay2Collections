package exercises;

import help.MyIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex5 {
    // Задание 5: Реализуйте свой Iterator для обхода списка в обратном порядке.

    public static void start() {
        System.out.println("Задание 5: Реализуйте свой Iterator для обхода списка в обратном порядке.");

        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");

        Iterator itr = new MyIterator(arrayList).iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }









}
