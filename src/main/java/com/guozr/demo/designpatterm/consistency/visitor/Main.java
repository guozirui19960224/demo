package com.guozr.demo.designpatterm.consistency.visitor;

import com.guozr.demo.designpatterm.consistency.visitor.exception.FileTreatementException;

import java.util.Iterator;

/**
 * @ClassName Main
 * @Description 访问者
 * @Author guozr
 * @Date 2021/1/22 11:37
 **/
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Making root entries");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi",10000));
            bindir.add(new File("latex",20000));
            rootdir.accept(new ListVisitor());

            System.out.println("");
            System.out.println("Making user entries");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("diary.html",100));
            yuki.add(new File("Visitor.java",200));
            hanako.add(new File("memo.tex",300));
            hanako.add(new File("index.html",350));
            tomura.add(new File("game.doc",400));
            tomura.add(new File("junk.mail",500));
            rootdir.accept(new ListVisitor());
            //1
            FileFindVisitor fileFindVisitor = new FileFindVisitor(".html");
            rootdir.accept(fileFindVisitor);

            System.out.println("Find files are:");
            Iterator iterator = fileFindVisitor.getFoundFiles();
            while (iterator.hasNext()) {
                File file = (File) iterator.next();
                System.out.println(file.toString());
            }
            //4
            System.out.println("ElementArrayList:");
            Directory root1 = new Directory("root1");
            root1.add(new File("diary.html",10));
            root1.add(new File("index.html",20));
            Directory root2 = new Directory("root2");
            root2.add(new File("diary.html",1000));
            root2.add(new File("index.html",2000));
            ElementArrayList elementArrayList = new ElementArrayList();
            elementArrayList.add(root1);
            elementArrayList.add(root2);
            elementArrayList.add(new File("etc.html",1234));
            elementArrayList.accept(new ListVisitor());


        }catch (FileTreatementException e){
            e.printStackTrace();
        }
    }
}
