package com.guozr.demo.designpatterm.instance.singleton;

/**
 * @ClassName Triple
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/9 15:43
 **/
public class Triple {

    private static Triple[] triples = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };

    private int id;

    public Triple(int id) {
        System.out.println("生成实例----");
        this.id = id;
    }

    public static Triple getInstance(int id){
        return triples[id];
    }

    @Override
    public String toString() {
        return "Triple{" +
                "id=" + id +
                '}';
    }
}
