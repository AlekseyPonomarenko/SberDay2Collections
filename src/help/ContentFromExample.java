package help;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ContentFromExample {

    private String string;

    public String getContentAsString() {

        if (string == null) {

            StringBuilder result=new StringBuilder("");
            File file = getFile();

            try (Scanner scanner=new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line=scanner.nextLine();
                    result.append(line).append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            string = result.toString();
        }
        return string;
    }

    public static String[] getReplaceArray(String stringMain) {
        stringMain=stringMain.replaceAll("[,.]", "");
        stringMain=stringMain.replaceAll("\n", " ");
        return stringMain.split(" ");
    }

    public File getFile() {
        ClassLoader classLoader=getClass().getClassLoader();
        File file= new File(classLoader.getResource("txt/example.txt").getFile());
        return file;
    }



}
