package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SchoolLibrary extends Library{


    public SchoolLibrary() {
        super();
    }

    @Override
    public List getArrayBooks() throws Exception {

        for (Object book : this.arrayBooks){
            Book book1 = (Book)book;
//            if (book1.getYearOfpublishing()==2017){
//                throw new Exception("2017");
//            }
            System.out.print("name book: "+book1.getNameBook()+" ; year of publishing: "+ book1.getYearOfpublishing()+ "\n");
            System.out.println("==========================================================================");

        }


        return  this.arrayBooks;
    }



    @Override
    public void setArrayBooks(List<Book> arrayBucks) {
        this.arrayBooks = arrayBucks;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
