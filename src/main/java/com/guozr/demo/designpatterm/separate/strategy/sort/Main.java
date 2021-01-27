package com.guozr.demo.designpatterm.separate.strategy.sort;

/**
 * @ClassName Main
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/27 15:28
 **/
public class Main {
    public static void main(String[] args) {
        String[] data = {
                "A","C","E","G",
                "B","D","F"
        };
        //SortAndPrint sortAndPrint = new SortAndPrint(data,new SelectionSorter());
        //sortAndPrint.excute();
        SortAndPrint sortAndPrint1 = new SortAndPrint(data,new QuickSorter());
        sortAndPrint1.excute();
    }
}
