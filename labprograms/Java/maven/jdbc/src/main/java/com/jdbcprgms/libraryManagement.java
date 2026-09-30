package com.jdbcprgms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class libraryManagement {
    Connection con ;
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

    public void input(){
        try{
            connect();
            System.out.println();
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
            ps.setInt(1,id);
            ps.setString(2,title);
            ps.setString(3,author);
            ps.setString(4,publications);
            ps.setDouble(5,price);
            ps.setInt(6,quantity);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public void delete(){
        try{
            connect();
            System.out.println("Enter Book ID to delete");
            int id = sc.nextInt();
            String sql = "DELETE FROM BOOKS WHERE ID=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void updatePrice(){
        try{
            connect();
            System.out.println("Enter Book ID to update price");
            int id = sc.nextInt();
            System.out.println("Enter new price");
            double price = sc.nextDouble();
            String sql = "UPDATE BOOKS SET PRICE=? WHERE ID=?";
            ps = con.prepareStatement(sql);
            ps.setDouble(1,price);
            ps.setInt(2,id);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public void updateQuantity(){
        try{
            connect();
            System.out.println("Enter Book ID to update quantity");
            int id = sc.nextInt();
            System.out.println("Enter new quantity");
            int quantity = sc.nextInt();
            String sql = "UPDATE BOOKS SET QUANTITY=? WHERE ID=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,quantity);
            ps.setInt(2,id);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void display(){
        try{
            connect();
            String sql = "SELECT * FROM BOOKS";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            System.out.println("ID\tTITLE\tAUTHOR\tPUBLICATIONS\tPRICE\tQUANTITY");
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getDouble(5)+"\t"+rs.getInt(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        libraryManagement lib = new libraryManagement();
        try{
            while(true){
                System.out.println("""
                    1. Add Book
                    2. Delete Book
                    3. Update Price
                    4. Update Quantity
                    5. Display Books
                    6. Exit
                """);
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1 -> lib.input();
                case 2 -> lib.delete();
                case 3 -> lib.updatePrice();
                case 4 -> lib.updateQuantity();
                case 5 -> lib.display();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }
            }
        }finally{
            sc.close();
        }
    }
}
