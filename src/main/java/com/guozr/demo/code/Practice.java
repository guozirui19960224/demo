package com.guozr.demo.code;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public static void main(String[] args) {
        //reverseString("abcd");
        //fibonacci(39);

    }
}
