import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LibraryManagementSystem {
    public ArrayList<Book> books = new ArrayList<>();
    public ArrayList<Kunde> allCustomers = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LibraryManagementSystem librarySystem = new LibraryManagementSystem();
        // for testing purposes: librarySystem.allCustomers.add(new Kunde(2,"","",true,0));
        librarySystem.runMainMenu();
    }

    private void runMainMenu() {
        boolean exit_programm = false;
        while (!exit_programm) {
            System.out.println("Bücherei-Verwaltungs-Software\n");
            System.out.println("1. Import Books with CSV");
            System.out.println("2. Delete Book by ISBN");
            System.out.println("3. Import Book Copies with CSV");
            System.out.println("4. Delete Book Copy with ID");
            System.out.println("5. Import Customers with CSV");
            System.out.println("6. Delete Customer with ID");
            System.out.println("7. Search for specific Book Copies");
            System.out.println("8. Borrow Book Copy");
            System.out.println("9. Return Book Copy");
            System.out.println("10. Reporting");
            System.out.println("0. Exit");

            System.out.println("");
            System.out.print("Enter your choice:");
            int customer_choice = scanner.nextInt();
            scanner.nextLine();

            switch (customer_choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("input the id of the customer which should be deleted. \n");
                    int n = Integer.valueOf(scanner.nextLine());
                    deleteCustomer(n);
                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:
                    reporting();
                    break;
                case 0:
                    exit_programm = true;
                    System.out.println("Exiting programm.");
                    break;
                default:
                    System.out.println("Invalid input. Please try again with a different input.");
            }
        }
    }

    //Löschen eines Kunden (via ID)
    private void deleteCustomer(Integer ID) {

       ArrayList<Kunde> Customer = (ArrayList<Kunde>) allCustomers.stream()
                .filter(customer -> customer.id==ID)
                .collect(Collectors.toList());
       if(Customer.isEmpty()){
           System.out.println("The customer doesnt exists.");
          return;
       }
        if(Customer.get(0).borrowed_books==0){
            allCustomers.remove(Customer.get(0));
            System.out.println("The customer was deleted.");
        }
        else {
            System.out.println("The customer was not deleted because he has borrowed books.");
        }
    }


    private void reporting() {
        boolean go_back = false;
        while (!go_back) {
            System.out.println("Reporting");
            System.out.println("1. List all Books");
            System.out.println("2. List all Borrowed Book Copies");
            System.out.println("3. List all Available Book Copies");
            System.out.println("4. List all Customers");
            System.out.println("5. List Borrowed Book Copies of a Customer");
            System.out.println("0. Back to Main Menu");

            System.out.print("Enter your choice: ");
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    go_back = true;
                    break;
                default:
                    System.out.println("Invalid input. Please try again with a different input.");
            }
        }
    }

}
