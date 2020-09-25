package com.guozr.demo.designpatterm.builder;

/**
 * @ClassName Builder
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/11 11:32
 **/
public abstract class/*interface*/ Builder {

    private boolean initialized = false;

    public void makeTitle(String title){
        if (!initialized){
            buildTitle(title);
            initialized = true;
        }
    }
    public void makeString(String string){
        if (initialized) {
            buildString(string);
        }
    }
    public void makeItems(String[] items){
        if (initialized) {
            buildItems(items);
        }
    }
    public void close(){
        if (initialized) {
            buildcDone();
        }
    }
    public abstract void buildTitle(String title);
    public abstract void buildString(String string);
    public abstract void buildItems(String[] items);
    public abstract void buildcDone();
    /*public abstract void makeTitle(String title);
    public abstract void makeString(String string);
    public abstract void makeItems(String[] items);
    public abstract void close();*/
    /*void makeTitle(String title);
    void makeString(String string);
    void makeItems(String[] items);
    void close();*/
}
