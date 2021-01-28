package com.guozr.demo.algorithm.sort;

/**
 * @ClassName InsertionSort
 * @Description 插入排序
 * @Author guozr
 * @Date 2020/11/26 16:57
 **/
public class InsertionSort {

    //优化：定义临时变量移动多个元素，省掉swap方法

    public static void sort(int[] arr){
        //抽出第i个数，如果比前一个小，换到前面
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]){
                    Util.swap(arr,j,j-1);
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
