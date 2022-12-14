

public class Book {
    private String bookName;
    private int pageNum;
    private String authorName;
    private int releaseDate;

    Book(String bookName , int pageNum, String authorName , int releaseDate){
        this.bookName = bookName;
        this.pageNum = pageNum;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }
    public String getAuthorName() {
        return authorName;
    }

    public int getPageNum() {
        return pageNum;
    }

    public int getReleaseDate() {
        return releaseDate;
    }


}
