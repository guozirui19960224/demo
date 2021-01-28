package com.guozr.demo.algorithm;

import com.guozr.demo.algorithm.sort.InsertionSort;
import com.guozr.demo.algorithm.sort.Util;

import java.util.Arrays;

/**
 * @ClassName DataChecker
 * @Description 对数期
 * @Author guozr
 * @Date 2020/11/20 11:33
 **/
public class DataChecker {

    static void check(){
        for (int j = 0; j< 10; j++) {
            int[] arr1 = Util.generateArray(101);
            int[] arr2 = arr1.clone();

            Arrays.sort(arr1);
            //SelectionSort.sort(arr2);
            //SelectionSort.sortChange(arr2);
            //BubbleSort.sort(arr2);
            InsertionSort.sort(arr2);

            boolean same = true;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]){
                    same = false;
                }
            }
            System.out.println(same);
        }
    }

    public static void main(String[] args) {
        check();
    }
}
