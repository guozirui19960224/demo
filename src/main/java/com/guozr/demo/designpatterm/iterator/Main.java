package com.guozr.demo.designpatterm.iterator;

import com.guozr.demo.designpatterm.iterator.Book;
import com.guozr.demo.designpatterm.iterator.BookShelf;
import com.guozr.demo.designpatterm.iterator.inter.Iterator;

/**
 * @ClassName Main
 * @Description 迭代器
 * @Author guozr
 * @Date 2020/8/20 11:29
 **/
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.append(new Book("1"));
        bookShelf.append(new Book("2"));
        bookShelf.append(new Book("3"));
        bookShelf.append(new Book("4"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
