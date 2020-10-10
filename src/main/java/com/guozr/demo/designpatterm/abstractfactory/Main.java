package com.guozr.demo.designpatterm.abstractfactory;

import com.guozr.demo.designpatterm.abstractfactory.factory.Factory;
import com.guozr.demo.designpatterm.abstractfactory.factory.Link;
import com.guozr.demo.designpatterm.abstractfactory.factory.Page;
import com.guozr.demo.designpatterm.abstractfactory.factory.Tray;

/**
 * @ClassName Main
 * @Description 抽象工厂
 * @Author guozr
 * @Date 2020/9/27 16:24
 **/
public class Main {

    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listFactory.ListFactory");
            System.out.println("Example 1: java Main tableFactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("people","http://www.people.com.cn/");
        Link gmw = factory.createLink("gmw","http://www.gmw.cn/");

        Link usYahoo = factory.createLink("usYahoo!","http://www.yahoo.com/");
        Link jpYahoo = factory.createLink("jpYahoo!","http://yahoo.co.jp/");

        Link excite = factory.createLink("excite","http://www.excite.com/");
        Link google = factory.createLink("google","http://www.google.com/");

        Tray trayNews = factory.createTray("news");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("yahoo");
        trayYahoo.add(usYahoo);
        trayYahoo.add(jpYahoo);

        Tray traySearch = factory.createTray("search");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage","guozr");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}
