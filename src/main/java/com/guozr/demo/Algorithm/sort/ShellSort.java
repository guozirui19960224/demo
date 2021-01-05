package com.guozr.demo.Algorithm.sort;

/**
 * @ClassName ShellSort
 * @Description 希尔排序
 * @Author guozr
 * @Date 2020/11/26 17:32
 **/
public class ShellSort {

    public static void sort(int[] arr){
        //初始化间隔
        //knuth序列 最优算法
        int gap = 1;
        while (gap <= arr.length / 3){
            gap = gap*3 + 1;
        }
        for (int h = gap; h > 0 ; h = (h-1)/3) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j > h - 1; j-=h) {
                    if (arr[j] < arr[j - h]){
                        Util.swap(arr,j,j-h);
                    }
                }
            }
        }
        //最终数组打印
        System.out.print("result:");
        Util.iteratorPrint(arr);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 8, 6, 7, 4, 1, 2, 9};
        sort(arr);
    }
}
