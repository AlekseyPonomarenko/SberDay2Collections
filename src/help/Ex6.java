package help;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class Ex6 {

    public static void start(){

        // Задание 4: Выведите на экран все строки файла в обратном порядке.
        System.out.println("Задание 6: Выведите на экран строки, номера которых задаются пользователем в произвольном порядке.:");

        Integer counter = 0;
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        ContentFromExample  contentFromExample = new ContentFromExample();
        File file = contentFromExample.getFile();
        try (Scanner scanner=new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line=scanner.nextLine();
                map.put(++counter, line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        showStringByNumber(map, 1);
        showStringByNumber(map, 2);

    }

    public static void showStringByNumber(HashMap<Integer,String> map, Integer integer){



        if (map.size()< integer) {
            System.out.println("Превышен индекс! " + integer);
        }
        else if (integer == 0){
            System.out.println("Запрещено 0, нумерация начинается с 1");
        }
        System.out.println("Состав строки " + integer + ": \"" + map.get(integer) + "\"");
    }



}
