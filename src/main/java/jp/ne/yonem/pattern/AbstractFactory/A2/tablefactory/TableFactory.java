package jp.ne.yonem.pattern.AbstractFactory.A2.tablefactory;

import jp.ne.yonem.pattern.AbstractFactory.A2.factory.Factory;
import jp.ne.yonem.pattern.AbstractFactory.A2.factory.Link;
import jp.ne.yonem.pattern.AbstractFactory.A2.factory.Page;
import jp.ne.yonem.pattern.AbstractFactory.A2.factory.Tray;

public class TableFactory extends Factory {
    
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
