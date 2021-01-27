package com.guozr.demo.designpatterm.adaptive.iterator;

import com.guozr.demo.designpatterm.adaptive.iterator.inter.Aggregate;
import com.guozr.demo.designpatterm.adaptive.iterator.inter.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BookShelf
 * @Description TODO
 * @Author guozr
 * @Date 2020/8/20 11:07
 **/
public class BookShelf implements Aggregate {

    private List<Book> books;

    private int last = 0;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public Book get(int index){
        return books.get(index);
    }

    public void append(Book book) {
        this.books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterater(this);
    }
}
