package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(MyConfig.class);

        Library library =  context.getBean("SchoolLibraryBean", SchoolLibrary.class);
        Book book = context.getBean("BookBean", Book.class);

        library.setArrayBooks(new ArrayList<Book>(Arrays.asList(
                new Book(1900, "Горе от ума"),
                new Book(1999, "Мастер и Маргарита"),
                new Book(1997, "Шерлок Холмс и Доктор Ватсан"),
                new Book(2017, "Марсианин")
        )));
        List lib = null;
        try {
            lib = library.getArrayBooks();
        } catch (Exception e) {
            e.printStackTrace();
        }

        lib.forEach(item -> {
            System.out.println(((Book)item).getNameBook()+ " : " + ((Book)item).getYearOfpublishing());
        });
        context.close();




    }
}
