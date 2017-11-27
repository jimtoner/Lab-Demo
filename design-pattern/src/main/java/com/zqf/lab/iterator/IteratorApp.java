package com.zqf.lab.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorApp {
    public static void main(String[] args){
        BookShelf bookShelf=new BookShelf();
        bookShelf.addBook(new Book("Java"));
        bookShelf.addBook(new Book("Linux"));
        bookShelf.addBook(new Book("Mysql"));

        Iterator<Book> iterator=bookShelf.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
        System.out.println("over");
    }


}

class Book{
    public Book(String name){this.name=name;}
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class BookShelf{
    private List<Book> books;
    public BookShelf(){
        this.books=new ArrayList<>();
    }
    protected Iterator<Book> iterator(){
        return  new BookShelfIterator();
    }
    protected void addBook(Book book){
        this.books.add(book);
    }
    private class BookShelfIterator implements Iterator<Book>{
        private int index=0;
        @Override
        public boolean hasNext() {
            return BookShelf.this.books.size()>index;
        }

        @Override
        public Book next() {
            return BookShelf.this.books.get(index++);
        }
    }
}
