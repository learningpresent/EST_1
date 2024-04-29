import java.util.ArrayList;

public class Book {

    String isbn;
    String titel;
    String autor;
    String jahr;

    public ArrayList<BookCopy>copies=new ArrayList<>();

    public Book(String isbn,String titel,String autor,String jahr){
        this.isbn=isbn;
        this.titel = titel;
        this.autor=autor;
        this.jahr=jahr;
    }
}
