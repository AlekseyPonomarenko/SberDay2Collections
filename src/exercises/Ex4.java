package exercises;

import help.ContentFromExample;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Ex4 {

    public static void start(){

        // Задание 4: Выведите на экран все строки файла в обратном порядке.
        System.out.println("Задание 4: Выведите на экран все строки файла в обратном порядке:");

        ArrayDeque<String> stack = new ArrayDeque<String>();

        ContentFromExample contentFromExample = new ContentFromExample();
        File file = contentFromExample.getFile();

        try (Scanner scanner=new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line=scanner.nextLine();
                stack.push(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(stack.peek()!=null){
            // извлечение c начала
            System.out.println(stack.pop());
        }

    }
}
