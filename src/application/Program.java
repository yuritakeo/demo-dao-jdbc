package application;

import java.sql.Connection;
import db.DB;
import java.sql.SQLException;

public class Program {

    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
