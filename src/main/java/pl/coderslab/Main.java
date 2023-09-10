package pl.coderslab;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args)  throws SQLException {

            try (Connection conn = DbUtil.getConnection()) {
                System.out.println("połączenie udane!");
            }
            System.out.println("koniec programu.");
        }

        static void testDbConnection () {
            try (Connection conn = DbUtil.getConnection()) {
                System.out.println("połączenie udane!");
            } catch (java.sql.SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }

