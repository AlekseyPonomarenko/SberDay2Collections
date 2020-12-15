package help;

import java.util.*;

public class Ex2 {
    // Задание 2: Выведите на экран список различных слов файла, отсортированный по возрастанию их длины (компаратор сначала по длине слова, потом по тексту).

    public static void start(String stringMain){

        System.out.println("Задание 2: Выведите на экран список различных слов файла, отсортированный по возрастанию их длины (компаратор сначала по длине слова, потом по тексту): ");

        Comparator <String> byLength=new Comparator <String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        Comparator <String> byName =new Comparator <String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };

        Comparator finishComparator = byLength.thenComparing(byName);

        TreeSet tmpSet = new TreeSet(finishComparator);
        tmpSet = (TreeSet) Ex1.getSet(stringMain, tmpSet);

        Iterator<String> itr = tmpSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
