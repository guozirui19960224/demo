package com.guozr.demo.designpatterm.adapter;

import com.guozr.demo.designpatterm.adapter.inter.FileIO;

import java.io.IOException;

/**
 * @ClassName Main
 * @Description 适配器
 * @Author guozr
 * @Date 2020/8/24 11:26
 **/
public class Main {

    public static void main(String[] args) {
        /*Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();*/
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("year","2004");
            f.setValue("month","4");
            f.setValue("day","21");
            f.writeToFile("newfile.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
