package jp.ne.yonem.pattern.Adapter.A2;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        var f = new FileProperties();

        try {
            f.readFromFile(Main.class.getResource("file.txt").getPath());
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("src/main/java/jp/ne/yonem/pattern/Adapter/A2/newfile.txt");
            f.writeToXmlFile("src/main/java/jp/ne/yonem/pattern/Adapter/A2/newfile.xml");
            System.out.println(f.getValue("year"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
