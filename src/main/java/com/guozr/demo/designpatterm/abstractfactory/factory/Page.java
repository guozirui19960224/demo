package com.guozr.demo.designpatterm.abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * @ClassName Page
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/27 16:28
 **/
public abstract class Page {

    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String auther) {
        this.title = title;
        this.author = auther;
    }

    public void add(Item item){
        content.add(item);
    }

    public void output(){
        try{
            String fileName = title + ".html" ;
            Writer writer = new FileWriter(fileName);
            writer.write(this.makeHtml());
            writer.close();
            System.out.println("编写完成");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    protected abstract String makeHtml();
}
