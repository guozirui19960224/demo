package com.guozr.demo.designpatterm.builder;

/**
 * @ClassName TextBuilder
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/11 11:35
 **/
public class TextBuilder extends/*implements*/ Builder {
    //这里不用String，是因为每次添加内容会新增一个String对象，加大开销
    private StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void buildTitle(String title) {
        stringBuffer.append("======\n");
        stringBuffer.append("["+title+"]\n");
        stringBuffer.append("\n");
    }

    @Override
    public void buildString(String string) {
        stringBuffer.append("■"+string+ "\n");
        stringBuffer.append("\n");
    }

    @Override
    public void buildItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            stringBuffer.append(" ·"+items[i]+"\n");
        }
        stringBuffer.append("\n");
    }

    @Override
    public void buildDone() {
        stringBuffer.append("======\n");
    }

/*    @Override
    public void makeTitle(String title) {
        stringBuffer.append("======\n");
        stringBuffer.append("["+title+"]\n");
        stringBuffer.append("\n");
    }

    @Override
    public void makeString(String string) {
        stringBuffer.append("■"+string+ "\n");
        stringBuffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            stringBuffer.append(" ·"+items[i]+"\n");
        }
        stringBuffer.append("\n");
    }

    @Override
    public void close() {
        stringBuffer.append("======\n");
    }*/

    public String getResult(){
        return stringBuffer.toString();
    }
}
