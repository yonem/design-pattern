package jp.ne.yonem.pattern.Adapter.A2;

import java.io.*;

public interface FileIO {
    void readFromFile(String filename) throws IOException;

    void writeToFile(String filename) throws IOException;

    void writeToXmlFile(String filename) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);
}