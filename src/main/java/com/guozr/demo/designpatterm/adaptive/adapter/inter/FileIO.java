package com.guozr.demo.designpatterm.adaptive.adapter.inter;

import java.io.IOException;

public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key,String value);
    public String getValue(String key);
}
