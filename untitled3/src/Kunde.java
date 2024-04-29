import java.util.ArrayList;

public class Kunde {
    int id;
    String name ,vorname;
    boolean bezahlstatus;
    int borrowed_books;

    public ArrayList<Book>borrowed_b = new ArrayList<>();

    public Kunde(int id,String name,String vorname,boolean bezahlstatus, int borrowed_books){
        this.id = id;
        this.name=name;
        this.vorname=vorname;
        this.borrowed_books=borrowed_books;
        this.bezahlstatus=bezahlstatus;
    }
}
