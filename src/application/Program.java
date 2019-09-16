package application;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.entitis.Department;
import model.entitis.Seller;

public class Program {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Department department = new Department(1, "Books");

        try {
            Seller seller = new Seller(1, "Yuri", "yuri@gmail.com", new Date(sdf.parse("26/08/1992").getTime()), 1800.00, department);
            System.out.println(seller);
        } catch (ParseException ex) {

        }
    }
}
