import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();
        books.add(new Book("Sherlock holmes","fsaf",186, 2003));
        books.add(new Book("Pegasus Sırrı","fsaf",350, 1998));
        books.add(new Book("Rüya Avcısı","fsaf",543, 2020));
        books.add(new Book("Davinci Şifresi","fsaf",495, 2015));
        books.add(new Book("Hayvan Mezarlığı","fsaf",442, 2015));

        System.out.println("Order by book name : ");
        for (Book book : books) {
            System.out.println(book.getName() + "\t" +  book.getPageNumber());
        }
        Set<Book> bookList = new TreeSet<>(new getOrderByNumber());
        bookList.addAll(books);
        System.out.println("---------------------");
        System.out.println("Order by page number : ");
        for (Book book : bookList){
            System.out.println(book.getName() + "\t" +  book.getPageNumber());
        }
    }
}