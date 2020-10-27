package com.guozr.demo.designpatterm.strategy.sort;

/**
 * @ClassName SortAndPrint
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/27 15:26
 **/
public class SortAndPrint {

    Comparable[] data;
    Sorter sorter;

    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    public void excute(){
        print();
        sorter.sort(data);
        print();
    }

    public void print(){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.println("");
    }
}
