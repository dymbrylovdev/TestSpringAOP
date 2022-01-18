package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Library {

    public List<Book> arrayBooks = new ArrayList<>();

    public Library(List<Book> arrayBooks) {
        this.arrayBooks = arrayBooks;
    }

    public Library() {};

    public abstract List getArrayBooks() throws Exception;

    public abstract void setArrayBooks(List<Book> arrayBucks);

    @Override
    public String toString() {
        String arrStr = "";
        for (Object book:this.arrayBooks){
            Book book1 = (Book)book;
            arrStr+= "name book: "+book1.getNameBook()+" ; year of publishing: "+ book1.getYearOfpublishing()+ "\n";
        }
        return arrStr;
    };
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
