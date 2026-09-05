import java.util.*;

public class temp {

    static class Librarian {

        private String name;
        private String librarianId;

        Librarian() {
        }

        Librarian(String name, String librarianId) {
            this.name = name;
            this.librarianId = librarianId;
        }

        @Override
        public String toString() {
            return "Librarian Name : " + name +
                   "\nLibrarian ID : " + librarianId;
        }
    }

    static class Book {

        private String title;
        private int bookCode;
        private double price;
        private Librarian librarian;
        private String category;

        
        private static int libraryCode;

        Book() {
        }

        
        Book(Librarian librarian) {
            this.librarian = librarian;
        }

        void updateBookRecord(double price, String category) {
            this.price = price;
            this.category = category;
        }

        void getBookDetails() {

            System.out.println("Book Title : " + this.title);
            System.out.println("Book Code : " + this.bookCode);
            System.out.println("Price : " + this.price);
            System.out.println("Assigned Librarian : " + this.librarian);
            System.out.println("Category : " + this.category);
            System.out.println("Library Code : " + this.libraryCode);
        }

        Librarian getLibrarian() {
            return this.librarian;
        }

        void setBookDetails(String title, int bookCode, double price, String category) {

            this.title = title;
            this.bookCode = bookCode;
            this.price = price;
            this.category = category;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Librarian> librarians = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n========== LIBRARY MENU ==========");
            System.out.println("1. Add Librarian");
            System.out.println("2. Add Book");
            System.out.println("3. Display Book details");
            System.out.println("4. Display Librarian details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (librarians.size() >= 2) {

                        System.out.println("Error: Maximum limit of 2 Librarians reached.");

                        break;
                    }

                    System.out.print("Enter Librarian Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Librarian ID: ");
                    String librarianId = sc.nextLine();

                    Librarian librarian = new Librarian(name, librarianId);
                    librarians.add(librarian);
                    System.out.println("Librarian added successfully.");

                    break;

                case 2:

                    if (librarians.size() == 0) {

                        System.out.println(
                            "Error: First create at least one Librarian."
                        );

                        break;
                    }

                    if (books.size() >= 5) {

                        System.out.println(
                            "Error: Maximum limit of 5 Books reached."
                        );

                        break;
                    }

                    System.out.println("\nAvailable Librarians:");
                    for (int i = 0; i < librarians.size(); i++) {
                        System.out.println((i + 1) + ". " + librarians.get(i));
                    }

                    System.out.print("Select Librarian: ");
                    int librarianChoice = sc.nextInt();
                    sc.nextLine();

                    if (librarianChoice < 1 || librarianChoice > librarians.size()) {
                        System.out.println("Error: Invalid Librarian choice.");
                        break;
                    }

                    Librarian selectedLibrarian = librarians.get(librarianChoice - 1);

                    Book book = new Book(selectedLibrarian);

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Book Code: ");
                    int bookCode = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    System.out.print(
                        "Enter Category (Fiction/NonFiction/Reference/Periodical): "
                    );

                    String category = sc.nextLine();

                    // Set book details
                    book.setBookDetails(
                        title,
                        bookCode,
                        price,
                        category
                    );

                    // Add book to ArrayList
                    books.add(book);

                    System.out.println("Book added successfully.");

                    break;

                case 3:

                    if (books.size() == 0) {
                        System.out.println("No books available.");
                        break;
                    }

                    System.out.println("\nAvailable Books:");
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println(
                            (i + 1) + ". Book " + (i + 1)
                        );
                    }

                    System.out.print("Select Book: ");
                    int bookChoice = sc.nextInt();
                    sc.nextLine();

                    if (bookChoice < 1 ||
                        bookChoice > books.size()) {

                        System.out.println( "Error: Invalid Book choice.");
                        break;
                    }

                    books.get(bookChoice - 1).getBookDetails();
                    break;


                case 4:

                    if (books.size() == 0) {

                        System.out.println(
                            "No books available."
                        );

                        break;
                    }

                    System.out.println("\nAvailable Books:");

                    for (int i = 0; i < books.size(); i++) {

                        System.out.println(
                            (i + 1) + ". Book " + (i + 1)
                        );
                    }

                    System.out.print(
                        "Select Book to see its Librarian: "
                    );

                    int selectedBook = sc.nextInt();
                    sc.nextLine();

                    if (selectedBook < 1 ||
                        selectedBook > books.size()) {

                        System.out.println(
                            "Error: Invalid Book choice."
                        );

                        break;
                    }

                    Librarian assignedLibrarian =
                            books.get(selectedBook - 1).getLibrarian();

                    System.out.println(
                        "\n====== LIBRARIAN DETAILS ======"
                    );

                    System.out.println(assignedLibrarian);

                    break;


                
                case 5:

                    System.out.println("Exiting program...");
                    break;


                default:

                    System.out.println(
                        "Invalid choice. Please try again."
                    );
            }

        } while (choice != 5);

        sc.close();
    }
}

