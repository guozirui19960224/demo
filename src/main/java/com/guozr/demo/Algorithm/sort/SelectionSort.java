package com.guozr.demo.Algorithm.sort;

/**
 * @ClassName SelectionSort
 * @Description 选择排序
 * @Author guozr
 * @Date 2020/11/19 14:50
 **/
public class SelectionSort {

    public static void sort(int[] arr){
        //循环操作
        for (int i = 0; i < arr.length ; i++) {
            //初始化一个角标
            int minPos = i;
            //找到最小数字
            for (int j = i + 1 ; j < arr.length ; j++) {
                if (arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //与第一个数交换
            Util.swap(arr,minPos,i);
            //System.out.println("minPos:"+ minPos);
            //经过循环后数据实时变更（可以不要）
            //Util.iteratorPrint(arr);
        }

        //最终数组打印
        System.out.print("result:");
        Util.iteratorPrint(arr);
    }

    public static void sortChange(int[] arr){
        //循环操作
        for (int i = 0; i < arr.length / 2; i++) {
            //初始化一个角标
            int minPos = i;
            int maxPos = arr.length - i - 1 ;

            //找到最小数字，（优化1）并找到最大值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //与第一个数交换，（优化1，与最后一个数交换）
            Util.swap(arr,minPos,i);
            for (int k = arr.length - i - 1; k > 0; k--) {
                if (arr[maxPos] < arr[k]) {
                    maxPos = k;
                }
            }
            Util.swap(arr,maxPos,arr.length - i - 1);

            //System.out.println("minPos:"+ minPos +" & maxPos:" +maxPos);
            //经过循环后数据实时变更（可以不要）
            //Util.iteratorPrint(arr);
        }

        //最终数组打印
        System.out.print("result:");
        Util.iteratorPrint(arr);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 8, 6, 7, 4, 1, 2, 9};
        sortChange(arr);
    }
}
