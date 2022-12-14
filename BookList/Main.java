import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        Book b1 = new Book("book-1", 123, "author-1", 2000);
        Book b2 = new Book("book-2", 13, "author-2", 2000);
        Book b3 = new Book("book-3", 1234, "author-3", 2000);
        Book b4 = new Book("book-4", 5, "author-4", 2000);
        Book b5 = new Book("book-5", 23, "author-5", 2000);
        Book b6 = new Book("book-6", 1123, "author-6", 2000);
        Book b7 = new Book("book-7", 423, "author-7", 2000);
        Book b8 = new Book("book-8", 223, "author-8", 2000);
        Book b9= new Book("book-9", 93, "author-9", 2000);
        Book b10 = new Book("book-10", 823, "author-10", 2000);


        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        bookList.add(b6);
        bookList.add(b7);
        bookList.add(b8);
        bookList.add(b9);
        bookList.add(b10);

        HashMap<String , String> bookMap = new HashMap<>();

        bookList
        .stream()
        .forEach(i -> bookMap.put(bookList.get(bookList.indexOf(i)).getBookName(), bookList.get(bookList.indexOf(i)).getAuthorName()));

        //System.out.println(Arrays.asList(bookMap));

        System.out.println("\n\tKitap - Yazar eşleşmesi\n");

        bookMap.forEach((book , author ) -> System.out.println("Kitap : "+book+ "\t\tYazar : " + author));

        System.out.println("\n\tSayfa sayısı 100 den büyük olanlar\n");

        bookList
        .stream()
        .filter(Book -> Book.getPageNum()>100)
        .forEach(Book -> System.out.println("Kitap adı :" +Book.getBookName()+"\tSayfa sayısı : "+Book.getPageNum()));


    }
}