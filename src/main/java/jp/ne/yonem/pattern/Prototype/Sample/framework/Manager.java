package jp.ne.yonem.pattern.Prototype.Sample.framework;

import java.util.HashMap;

public class Manager {

    private final HashMap<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        var p = showcase.get(protoName);
        return p.createClone();
    }
}
