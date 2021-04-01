/*
 *Maven Project
 *Book.java
  *Worker class
 *Author Zintle Magwaxaza-218109911
 *Date: Wednesday, 31 March 2021
 */
package za.ac.cput.adp2assignment1;

public class Book {
    private String bookTitle,bookId,bookGenre,date;
    
    public Book(String bookTitle, String bookId, String bookGenre, String date) {
        this.bookTitle = bookTitle;
        this.bookId = bookId;
        this.bookGenre = bookGenre;
        this.date = date;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookType) {
        this.bookGenre = bookType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" + "bookTitle=" + bookTitle + ", bookId=" + bookId + ", bookGenre=" + bookGenre + ", date=" + date + '}';
    }

    
}
