package com.guozr.demo.designpatterm.Composite;

/**
 * @ClassName Filr
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/27 18:01
 **/
public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
