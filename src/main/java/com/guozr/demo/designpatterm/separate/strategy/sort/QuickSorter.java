package com.guozr.demo.designpatterm.separate.strategy.sort;

/**
 * @ClassName QuickSorter
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/27 15:39
 **/
public class QuickSorter implements Sorter {
    Comparable[] data;

    @Override
    public void sort(Comparable[] data) {
        this.data = data;
        quicksort(0,data.length -1);
    }

    private void quicksort(int pre ,int post) {
        int savepre = pre;
        int savepost = post;
        Comparable mid = data[(pre + post) / 2];
        do {
            while (data[pre].compareTo(mid) < 0){
                pre++;
            }
            while (mid.compareTo(data[post]) < 0){
                post--;
            }
            if (pre <= post){
                Comparable tmp = data[pre];
                data[pre] = data[post];
                data[post] = tmp;
                pre++;
                post--;
            }
        }while (pre<= post);
        if (savepre < post){
            quicksort(savepre,post);
        }
        if (pre < savepost){
            quicksort(pre,savepost);
        }
    }
}
