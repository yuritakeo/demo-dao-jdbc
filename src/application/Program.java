package application;

import java.sql.Connection;
import db.DB;
import java.sql.SQLException;
import model.entitis.Department;

public class Program {

    public static void main(String[] args) {
        Department department = new Department(1, "Books");
        System.out.println(department);
    }
}
