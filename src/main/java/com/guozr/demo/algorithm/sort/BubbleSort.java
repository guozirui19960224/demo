package com.guozr.demo.algorithm.sort;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序
 * @Author guozr
 * @Date 2020/11/26 15:25
 **/
public class BubbleSort {

    public static void sort(int[] arr){
        int len = arr.length - 1;
        int tempPostion = 0;
        //循环操作
        for (int i = 0; i < arr.length - 1; i++) {
            //设置一个标记位
            int flag = 1;
            //flag = findMax(arr, len, flag , tempPostion);
            for (int j = 0; j < len; j++) {
                if (arr[j] > arr[j+1]) {
                    Util.swap(arr,j,j+1);
                    //发生交换，标识位置0
                    flag = 0;
                    tempPostion = j;
                }
            }
            len = tempPostion;
            System.out.println(i+1);
            if (flag == 1){
                break;
            }
        }
        //最终数组打印
        System.out.print("result:");
        Util.iteratorPrint(arr);
    }

    //找到最大数放到指定位置
    static int findMax(int[] arr,int n,int flag , int tempPostion){
        for (int j = 0; j < n; j++) {
            if (arr[j] > arr[j+1]) {
                Util.swap(arr,j,j+1);
                //发生交换，标识位置0
                flag = 0;
                tempPostion = j;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 8, 6, 7, 4, 1, 2, 9};
        sort(arr);
    }
}
