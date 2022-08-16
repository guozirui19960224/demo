package com.guozr.demo.code;

import com.guozr.demo.util.ElectronicFence;

import java.awt.geom.Point2D;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ClassName Practice
 * @Description TODO
 * @Author guozr
 * @Date 2020/12/21 17:25
 **/
public class Practice {
    //倒排字符串
    public static void reverseString(String str) {
        String s = new StringBuffer(str).reverse().toString();
        System.out.println(s);
    }
    //斐波那契数列
    public static void fibonacci(int n) {
        int[] arr = new int[40];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[n]);
    }

    //寻找峰值
    public static void findMax(int[] arr) {
        //int[] arr = new int[]{2,4,1,2,7,8,4};
        int max = 0;
        for (int i : arr) {
            if (max < i){
                max = i;
            }
        }
        int index = 0;
        for (int i = 0; i < arr.length - 1 ;i++) {
            if (max == arr[i]){
                index = i;
            }
        }
        System.out.println(index);
    }

    //计算时间差
    private static void countTimeSub(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        System.out.println(new Date(cal.getTimeInMillis()));
        System.out.println((cal.getTimeInMillis() - System.currentTimeMillis()) / 1000);
    }

    public static void main(String[] args) {
        //reverseString("abcd");
        //fibonacci(39);
        //findMax(new int[]{2,4,1,2,7,8,4});
        //countTimeSub()
        /*List<Point2D.Double> doubles = new ArrayList<>();
        Point2D.Double point2D1 = new Point2D.Double();
        point2D1.setLocation(0,50);
        Point2D.Double point2D2 = new Point2D.Double();
        point2D2.setLocation(100,50);
        Point2D.Double point2D3 = new Point2D.Double();
        point2D3.setLocation(50,0);
        Point2D.Double point2D4 = new Point2D.Double();
        point2D4.setLocation(50,100);
        doubles.add(point2D3);
        doubles.add(point2D1);
        doubles.add(point2D4);
        doubles.add(point2D2);
        Point2D.Double point2D5 = new Point2D.Double();
        point2D5.setLocation(62.5,87.75);
        boolean b = ElectronicFence.IsPtInPoly(doubles, point2D5);
        System.out.println(b);*/
        String str = "A1";
        String substring = str.substring(0, 1);
        System.out.println(substring);
    }
}
