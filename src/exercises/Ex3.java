package exercises;

import help.ContentFromExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex3 {
    public static void start(String stringMain){
       // Задание 3: Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.

        System.out.println("Задание 3: Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле: ");
        String[] arrSplit_2 = ContentFromExample.getReplaceArray(stringMain);
        Map<String, Integer> map=new HashMap <String, Integer>();
        String strTmp;

        for (int i=0; i < arrSplit_2.length; i++) {
           // set.add();
            strTmp = arrSplit_2[i].toLowerCase();
            Integer value;

            value = map.get(strTmp);
            if (value==null){
                map.put(strTmp, 1);
            }
            else {
                map.put(strTmp, ++value);
            }
        }

        for(Map.Entry<String, Integer> item : map.entrySet()){
            System.out.printf("Слово: \"%s\" встречается раз: %s \n", item.getKey(), item.getValue());
        }
    }
}
