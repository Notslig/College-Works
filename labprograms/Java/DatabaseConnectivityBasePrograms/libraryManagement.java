


import java.sql.*;
import java.util.*;

public class libraryManagement {
    Connection con;
    PreparedStatement ps;
    Scanner sc = new Scanner(System.in);

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:College-Works/labprograms/Java/DatabaseConnectivity/jdbc/databases/library.db", "root", "passwd");
            con.createStatement().execute("CREATE TABLE IF NOT EXISTS BOOKS (ID INT PRIMARY KEY , TITLE VARCHAR(100), AUTHOR VARCHAR(100),PUBLICATIONS VARCHAR(100), PRICE DOUBLE, QUANTITY INT)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void input() {
        try {
            connect();
            System.out.println(" Enter Book ID,title,author,publications,price,quantity");
            int id = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            String publications = sc.nextLine();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            String sql = "INSERT INTO BOOKS VALUES(?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setString(3, author);
            ps.setString(4, publications);
            ps.setDouble(5, price);
            ps.setInt(6, quantity);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        try {
            connect();
            System.out.println("Enter Book ID to delete");
            int id = this.sc.nextInt();
            String sql = "DELETE FROM BOOKS WHERE ID=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updatePrice() {
        try {
            connect();
            System.out.println("Enter Book ID to update price");
            int id = sc.nextInt();
            System.out.println("Enter new price");
            double price = sc.nextDouble();
            String sql = "UPDATE BOOKS SET PRICE=? WHERE ID=?";
            ps = con.prepareStatement(sql);
            ps.setDouble(1, price);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateQuantity() {
        try {
            connect();
            System.out.println("Enter Book ID to update quantity");
            int id = sc.nextInt();
            System.out.println("Enter new quantity");
            int quantity = sc.nextInt();
            String sql = "UPDATE BOOKS SET QUANTITY=? WHERE ID=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, quantity);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        libraryManagement lib = new libraryManagement();
        try {
            while(true) {
                System.out.println("""
                            1. Add Book
                            2. Delete Book
                            3. Update Price
                            4. Update Quantity
                            5. Display Books
                            6. Exit
                """);
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:lib.input();break;
                    case 2:lib.delete();break;
                    case 3:lib.updatePrice();break;
                    case 4: lib.updateQuantity();break;
                    case 5: lib.display(); break;
                    case 6: System.out.println("Exiting..."); break;
                    default:System.out.println("Invalid choice");
                }
            }
        } finally {
            sc.close();
        }
    }
}
