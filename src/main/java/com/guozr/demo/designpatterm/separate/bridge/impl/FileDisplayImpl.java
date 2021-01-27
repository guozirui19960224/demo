package com.guozr.demo.designpatterm.separate.bridge.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName FileDisplayImpl
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/26 11:46
 **/
public class FileDisplayImpl extends DisplayImpl {
    private String filename;

    private BufferedReader bufferedReader;

    private final int MAX_READAHEAD_LIMIT = 4096;

    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        try {
            bufferedReader = new BufferedReader(new FileReader("G:/demo/src/main/resources/templates/"+filename));
            bufferedReader.mark(MAX_READAHEAD_LIMIT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(filename);
    }

    @Override
    public void rawPrint() {
        try {
            String line;
            bufferedReader.reset();
            while((line = bufferedReader.readLine()) != null){
                System.out.println(">:"+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        try {
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
