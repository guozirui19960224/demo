package com.guozr.demo.code;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author : guozr
 * @date : 2021/7/13 11:34
 */
public class RandomNumber {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(new Date());
        HashMap<Object, Object> map = new HashMap<>();
        map.put("date",new Date());
        String format = sdf.format(map.get("date"));
        System.out.println(format);

        /*Random random = new Random();
        List<Integer> arr = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            int i = random.nextInt(33)+1;
            if (arr.size() < 6 && !arr.contains(i)){
                arr.add(i);
            }
        }
        Collections.sort(arr);
        for (int j = 0; j < 10; j++) {
            int i = random.nextInt(16)+1;
            if (arr.size() < 7){
                arr.add(i);
            }
        }
        for (Integer i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();*/
    }
}
