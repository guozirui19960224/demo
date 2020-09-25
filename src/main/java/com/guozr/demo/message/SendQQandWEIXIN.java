package com.guozr.demo.message;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

/**
 * @ClassName SendQQandWEIXIN
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/11 14:55
 **/
public class SendQQandWEIXIN {

    public static void main(String[] args)throws AWTException {
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable tText = null;
        Toolkit tolkit = Toolkit.getDefaultToolkit();
        Robot robot = new Robot();
        robot.delay(3000);//延迟十秒，主要是为了预留出打开窗口的时间，括号内的单位为毫秒
        tText = new StringSelection("xxx");//如果爱得深，把这行取消注释，把内容更换掉你自己想说的
        clip.setContents(tText, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyPress( KeyEvent.VK_ENTER);
    }
}
