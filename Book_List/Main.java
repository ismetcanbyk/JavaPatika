import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Kitap 1", 123, "Yazar 1", 2002);
        Book b2 = new Book("Kitap 2", 312, "Yazar 2", 1988);
        Book b3 = new Book("Kitap 3", 11, "Yazar 3", 2005);
        Book b4 = new Book("Kitap 4", 32, "Yazar 4", 1888);
        Book b5 = new Book("Kitap 5", 68, "Yazar 5", 2012);


        TreeSet<Book> set = new TreeSet<>();

        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        set.add(b5);

        System.out.println("------------------------------------------------");

        for(Book bookName: set){
            System.out.println("Book Name: " +bookName.getBookName() +
                    "\nPage Number: " + bookName.getPageNum() +
                    "\nAuthor Name: " + bookName.getAuthorName() +
                    "\nDate: " + bookName.getDate());
            System.out.println("------------------------------------------------");
        }

       System.out.println();
        System.out.println("----Sayfa sayısına göre sıralama----");
        System.out.println();
        System.out.println("------------------------------------------------");
        TreeSet<Book> setPage = new TreeSet<>(new Comparator<Book> (){
            @Override
            public int compare(Book b1,Book b2){
                return b1.getPageNum()-b2.getPageNum();
            }
        }){};

        setPage.add(b1);
        setPage.add(b2);
        setPage.add(b3);
        setPage.add(b4);
        setPage.add(b5);

        
        for (Book book : setPage) {
            System.out.println("Book Name: " +book.getBookName() +
                    "\nPage Number: " + book.getPageNum() +
                    "\nAuthor Name: " + book.getAuthorName() +
                    "\nDate: " + book.getDate());
            System.out.println("------------------------------------------------");
        }





        
    }
}
