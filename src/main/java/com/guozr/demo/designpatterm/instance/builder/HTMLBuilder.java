package com.guozr.demo.designpatterm.instance.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName HTMLBuilder
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/11 11:36
 **/
public class HTMLBuilder extends/*implements*/ Builder {
    private String fileName;

    private PrintWriter writer;

    @Override
    public void buildTitle(String title) {
        fileName = title +".html";
        try {
            writer = new PrintWriter(new FileWriter("G:/demo/src/main/resources/templates/"+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>"+title+"</title></head></body>");
        writer.println("<h1>"+title+"</h1>");
    }

    @Override
    public void buildString(String string) {
        writer.println("<p>"+string+"</p>");
    }

    @Override
    public void buildItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" +items[i]+"</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void buildDone() {
        writer.println("</boby></html>");
        writer.close();
    }

/*    @Override
    public void makeTitle(String title) {
        fileName = title +".html";
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>"+title+"</title></head></body>");
        writer.println("<h1>"+title+"</h1>");
    }

    @Override
    public void makeString(String string) {
        writer.println("<p>"+string+"</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" +items[i]+"</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</boby></html>");
        writer.close();
    }*/

    public String getResult(){
        return fileName;
    }
}
