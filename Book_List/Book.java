public class Book implements Comparable<Book> {

    private String bookName;
    private int pageNum;
    private String authorName;
    private int date;


    public Book(String bookName , int pageNum , String authorName , int date){
        this.bookName = bookName;
        this.pageNum = pageNum;
        this.authorName = authorName;
        this.date = date ;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getDate() {
        return date;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setDate(int date) {
        this.date = date;
    }



    @Override
    public int compareTo(Book o) {
        
        return getBookName().compareTo(o.getBookName());
    }
    
}
