package com.guozr.demo.Algorithm;

/**
 * @ClassName SelectionSort
 * @Description 选择排序
 * @Author guozr
 * @Date 2020/11/19 14:50
 **/
public class SelectionSort {

    public static void main(String[] args) {
        //一个乱序的数组
        int[] arr = {5,3,8,6,7,4,1,2,9};
        //循环操作
        for (int i = 0; i < arr.length / 2; i++) {
            //初始化一个角标
            int minPos = i;
            int maxPos = arr.length - i - 1 ;
            //找到最小数字，（优化1）并找到最大值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //优化1
            for (int j = arr.length - i - 1 ; j > 0; j--) {
                if (arr[maxPos] < arr[j]){
                    maxPos = j;
                }
            }
            //与第一个数交换，（优化1，与最后一个数交换）
            swap(arr,minPos,i);
            //优化1
            if (arr[maxPos] > arr[i]) {
                swap(arr, maxPos, arr.length - i - 1);
            }
            System.out.println("minPos:"+ minPos +" & maxPos:" +maxPos);
            //经过循环后数据实时变更（可以不要）
            iteratorPrint(arr);
            System.out.println();
        }

        //最终数组打印
        System.out.print("result:");
        iteratorPrint(arr);
    }

    static void iteratorPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    //抽象重复的方法
    static void swap(int[] arr,int source,int target){
        int temp = arr[target];
        arr[target] = arr[source];
        arr[source] = temp;
    }
}
