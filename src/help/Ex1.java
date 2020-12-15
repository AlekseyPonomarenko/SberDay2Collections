package help;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex1 {
    //Задание 1: Подсчитайте количество различных слов в файле.

    public static void start(String stringMain){

        Set tmpSet = new HashSet<String>(); //Выбираем HashSet
        System.out.println("Задание 1: Подсчитайте количество различных слов в файле. Ответ: " + getSet(stringMain, tmpSet).size() );
    }

    public static Set getSet(String stringMain, Set set){

        //1 получаем слова
        //в нашел интересное решение фильтрации регулярными выражениями, но т.к. мы ещё не проходили лямбда. оставим пока так
        String[] arrSplit_2 = ContentFromExample.getReplaceArray(stringMain);
        for (int i=0; i < arrSplit_2.length; i++) {
            set.add(arrSplit_2[i].toLowerCase());
        }

        return set;
    }



}
