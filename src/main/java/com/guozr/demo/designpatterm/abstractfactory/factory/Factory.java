package com.guozr.demo.designpatterm.abstractfactory.factory;

/**
 * @ClassName Factory
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/27 16:27
 **/
public abstract class Factory {

    public static Factory getFactory(String classname){
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption,String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title ,String author);


    public Page createYahooPage(){
        Link link = createLink("Yahoo","http://www.yahoo.com/");
        Page page = createPage("Yahoo!","Yahoo!");
        page.add(link);
        return page;
    }

}
