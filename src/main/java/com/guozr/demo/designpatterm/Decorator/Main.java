package com.guozr.demo.designpatterm.Decorator;

import com.guozr.demo.designpatterm.Decorator.Border.FullBorder;
import com.guozr.demo.designpatterm.Decorator.Border.SideBorder;
import com.guozr.demo.designpatterm.Decorator.Border.UpDownBorder;
import com.guozr.demo.designpatterm.Decorator.Display.Display;
import com.guozr.demo.designpatterm.Decorator.Display.MultiStringDisplay;
import com.guozr.demo.designpatterm.Decorator.Display.StringDisplay;

/**
 * @ClassName Main
 * @Description 装饰者
 * @Author guozr
 * @Date 2020/12/14 15:06
 **/
public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello,world");
        Display b2 = new SideBorder(b1,'#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 =
                new FullBorder(
                    new SideBorder(
                        new FullBorder(
                            new SideBorder(
                                new FullBorder(
                                    new StringDisplay("abc")
                                ),'*'
                            )
                    ),'/')
        );
        b4.show();
        System.out.println();
        Display b5 = new UpDownBorder(b1,'-');
        b5.show();
        Display b6 =
                new FullBorder(
                        new UpDownBorder(
                                new FullBorder(
                                        new UpDownBorder(
                                                new FullBorder(
                                                        new StringDisplay("abcdef")
                                                ),'*'
                                        )
                                ),'/')
                );
        b6.show();


        MultiStringDisplay md = new MultiStringDisplay();
        md.add("abc");
        md.add("def");
        md.add("ghi");


        Display d1 = new SideBorder(md , '#');
        d1.show();

        Display d2 = new FullBorder(md);
        d2.show();
    }
}
