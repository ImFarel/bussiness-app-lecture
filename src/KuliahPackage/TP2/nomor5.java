package KuliahPackage.TP2;

import java.sql.*;

public class nomor5 {
    public static void main(String[] args) {
        try (
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "toor"
                );
                Statement state = con.createStatement();
        ) {
            System.out.println("JDBC Class found");

            String strSelect = "SELECT title, price, qty FROM books";
            System.out.println("mysql> " + strSelect + "\n");

            ResultSet rset = state.executeQuery(strSelect);

            System.out.println("Result :");
            int rowCount = 0;
            while (rset.next()) {
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + " || " + price + " || " + qty);
                ++rowCount;
            }
            System.out.println("\nTotal records = " + rowCount);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
