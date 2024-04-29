import java.util.ArrayList;

public class Customer {
    int id;
    String name , first_name;
    boolean payment_status;
    int borrowed_books;

    public ArrayList<Book>borrowed_b = new ArrayList<>();

    public Customer(int id, String name, String first_name, boolean payment_status, int borrowed_books){
        this.id = id;
        this.name=name;
        this.first_name =first_name;
        this.borrowed_books=borrowed_books;
        this.payment_status =payment_status;
    }
}
