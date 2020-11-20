package com.guozr.demo.Algorithm.sort;

import java.util.Random;

/**
 * @ClassName Util
 * @Description TODO
 * @Author guozr
 * @Date 2020/11/20 14:14
 **/
public class Util {
    //交换数组中两个下标的元素
    public static void swap(int[] arr,int source,int target){
        int temp = arr[target];
        arr[target] = arr[source];
        arr[source] = temp;
    }

    //遍历打印
    public static void iteratorPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    //生成随机的数组
    public static int[] generateArray(int number){
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
        }
        return array;
    }
}
