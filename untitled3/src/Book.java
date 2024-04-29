import java.util.ArrayList;

public class Book {

    String isbn;
    String titel;
    String author;
    String year;
    int id;

    public ArrayList<BookCopy>copies=new ArrayList<>();

    public Book(int id,String isbn,String titel,String author,String year){
        this.isbn=isbn;
        this.titel = titel;
        this.author =author;
        this.year =year;
        this.id = id;
    }
}
