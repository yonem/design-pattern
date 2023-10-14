package jp.ne.yonem.pattern.AbstractFactory.A2.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {

    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        var filename = title + ".html";

        try (var writer = new FileWriter(filename)) {
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + " を作成しました。");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
