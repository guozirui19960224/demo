package com.guozr.demo.designpatterm.adapter;

import com.guozr.demo.designpatterm.adapter.inter.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * @ClassName FileProperties
 * @Description TODO
 * @Author guozr
 * @Date 2020/8/24 14:44
 **/
public class FileProperties extends Properties implements FileIO {
    /**
     * Creates an empty property list with no default values.
     */

    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream("G:\\bmlcode\\demo\\src\\main\\java\\"+filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream("G:\\bmlcode\\demo\\src\\main\\java\\"+filename),"written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        this.put(key,value);
    }

    @Override
    public String getValue(String key) {
        return this.get(key).toString();
    }
}
