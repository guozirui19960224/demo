package com.guozr.demo.designpatterm.iterator;

import com.guozr.demo.designpatterm.iterator.inter.Iterator;

/**
 * @ClassName BookShelfIterater
 * @Description TODO
 * @Author guozr
 * @Date 2020/8/20 11:12
 **/
public class BookShelfIterater implements Iterator {

    private BookShelf bookShelf;

    private int index;

    public BookShelfIterater(BookShelf bookShelf) {
        this.bookShelf=bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.get(index);
        index++;
        return book;
    }
}
