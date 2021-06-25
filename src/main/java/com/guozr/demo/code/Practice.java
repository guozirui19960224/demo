package com.guozr.demo.code;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
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

    public static void main(String[] args) {
        //reverseString("abcd");
        //fibonacci(39);
        findMax(new int[]{2,4,1,2,7,8,4});

    }
}
