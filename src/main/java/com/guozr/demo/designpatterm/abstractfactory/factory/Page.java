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
    //没有继承tray，因为无法向tray中添加page。page定义未tray，
    //page就变成了item的子类，导致可以被添加至tray中

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
            Writer writer = new FileWriter("G:/demo/src/main/resources/templates/"+fileName);
            writer.write(this.makeHtml());
            writer.close();
            System.out.println("编写完成");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    protected abstract String makeHtml();
}
