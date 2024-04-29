import java.util.ArrayList;

public class Book {

    String isbn;
    String titel;
    String author;
    String year;

    public ArrayList<BookCopy>copies=new ArrayList<>();

    public Book(String isbn,String titel,String author,String year){
        this.isbn=isbn;
        this.titel = titel;
        this.author =author;
        this.year =year;
    }
}
