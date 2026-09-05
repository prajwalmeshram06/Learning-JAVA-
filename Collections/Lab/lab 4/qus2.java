import java.util.*;

public class qus2 {

    static class Librarian {
        private String name;
        private String librarianId;

        Librarian() {}

        Librarian(String name, String librarianId) {
            this.name = name;
            this.librarianId = librarianId;
        }

        void updateLibrarian(String name) {
            this.name = name;
        }

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

        Book() {}

        Book(Librarian librarian) {
            this.librarian = librarian;
        }

        void setBookDetails(String title, int bookCode,
                            double price, String category) {
            this.title = title;
            this.bookCode = bookCode;
            this.price = price;
            this.category = category;
        }

        void updateBookRecord(double price, String category) {
            this.price = price;
            this.category = category;
        }

        Librarian getLibrarian() {
            return librarian;
        }

        void getBookDetails() {
            System.out.println("Book Title : " + title);
            System.out.println("Book Code : " + bookCode);
            System.out.println("Price : " + price);
            System.out.println("Assigned Librarian : " + librarian);
            System.out.println("Category : " + category);
            System.out.println("Library Code : " + libraryCode);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Librarian> librarians = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Add Librarian");
            System.out.println("4. Delete Librarian");
            System.out.println("5. Update Book");
            System.out.println("6. Update Librarian");
            System.out.println("7. Display Book details");
            System.out.println("8. Display Librarian details");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (librarians.size() == 0) {
                        System.out.println("First add a Librarian.");
                        break;
                    }

                    if (books.size() >= 5) {
                        System.out.println("Maximum limit of 5 Books reached.");
                        break;
                    }

                    for (int i = 0; i < librarians.size(); i++)
                        System.out.println((i + 1) + ". " + librarians.get(i));

                    System.out.print("Select Librarian: ");
                    int li = sc.nextInt();
                    sc.nextLine();

                    if (li < 1 || li > librarians.size()) {
                        System.out.println("Invalid Librarian choice.");
                        break;
                    }

                    Book b = new Book(librarians.get(li - 1));

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Book Code: ");
                    int code = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    b.setBookDetails(title, code, price, category);
                    books.add(b);

                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    if (books.size() == 0) {
                        System.out.println("No books available.");
                        break;
                    }

                    for (int i = 0; i < books.size(); i++)
                        System.out.println((i + 1) + ". Book " + (i + 1));

                    System.out.print("Select Book to delete: ");
                    int db = sc.nextInt();
                    sc.nextLine();

                    if (db < 1 || db > books.size()) {
                        System.out.println("Invalid Book choice.");
                        break;
                    }

                    books.remove(db - 1);
                    System.out.println("Book deleted successfully.");
                    break;

                case 3:
                    if (librarians.size() >= 2) {
                        System.out.println("Maximum limit of 2 Librarians reached.");
                        break;
                    }

                    System.out.print("Enter Librarian Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Librarian ID: ");
                    String id = sc.nextLine();

                    librarians.add(new Librarian(name, id));
                    System.out.println("Librarian added successfully.");
                    break;

                case 4:
                    if (librarians.size() == 0) {
                        System.out.println("No librarians available.");
                        break;
                    }

                    for (int i = 0; i < librarians.size(); i++)
                        System.out.println((i + 1) + ". " + librarians.get(i));

                    System.out.print("Select Librarian to delete: ");
                    int dl = sc.nextInt();
                    sc.nextLine();

                    if (dl < 1 || dl > librarians.size()) {
                        System.out.println("Invalid Librarian choice.");
                        break;
                    }

                    librarians.remove(dl - 1);
                    System.out.println("Librarian deleted successfully.");
                    break;

                case 5:
                    if (books.size() == 0) {
                        System.out.println("No books available.");
                        break;
                    }

                    for (int i = 0; i < books.size(); i++)
                        System.out.println((i + 1) + ". Book " + (i + 1));

                    System.out.print("Select Book to update: ");
                    int ub = sc.nextInt();
                    sc.nextLine();

                    if (ub < 1 || ub > books.size()) {
                        System.out.println("Invalid Book choice.");
                        break;
                    }

                    System.out.print("Enter new Price: ");
                    double newPrice = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter new Category: ");
                    String newCategory = sc.nextLine();

                    books.get(ub - 1).updateBookRecord(newPrice, newCategory);
                    System.out.println("Book updated successfully.");
                    break;

                case 6:
                    if (librarians.size() == 0) {
                        System.out.println("No librarians available.");
                        break;
                    }

                    for (int i = 0; i < librarians.size(); i++)
                        System.out.println((i + 1) + ". " + librarians.get(i));

                    System.out.print("Select Librarian to update: ");
                    int ul = sc.nextInt();
                    sc.nextLine();

                    if (ul < 1 || ul > librarians.size()) {
                        System.out.println("Invalid Librarian choice.");
                        break;
                    }

                    System.out.print("Enter new Name: ");
                    String newName = sc.nextLine();

                    librarians.get(ul - 1).updateLibrarian(newName);
                    System.out.println("Librarian updated successfully.");
                    break;

                case 7:
                    if (books.size() == 0) {
                        System.out.println("No books available.");
                        break;
                    }

                    for (int i = 0; i < books.size(); i++)
                        System.out.println((i + 1) + ". Book " + (i + 1));

                    System.out.print("Select Book: ");
                    int sb = sc.nextInt();
                    sc.nextLine();

                    if (sb < 1 || sb > books.size()) {
                        System.out.println("Invalid Book choice.");
                        break;
                    }

                    books.get(sb - 1).getBookDetails();
                    break;

                case 8:
                    if (books.size() == 0) {
                        System.out.println("No books available.");
                        break;
                    }

                    for (int i = 0; i < books.size(); i++)
                        System.out.println((i + 1) + ". Book " + (i + 1));

                    System.out.print("Select Book: ");
                    int lb = sc.nextInt();
                    sc.nextLine();

                    if (lb < 1 || lb > books.size()) {
                        System.out.println("Invalid Book choice.");
                        break;
                    }

                    System.out.println(books.get(lb - 1).getLibrarian());
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 9);

        sc.close();
    }
}

