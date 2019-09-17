package application;

import java.text.ParseException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entitis.Department;
import model.entitis.Seller;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TESTE 1: seller findById ===");
        Seller seller = sellerDao.findById(1);
        System.out.println(seller);

        System.out.println("\n=== TESTE 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        for (Seller obj : sellers) {
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 3: seller findByAll===");
        sellers = sellerDao.findAll();
        for (Seller obj : sellers) {
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 4: seller insert ===");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Seller newSeller = new Seller();
            newSeller.setName("hahaha");
            newSeller.setBirthDate(new Date(sdf.parse("26/08/1992").getTime()));
            newSeller.setBaseSalary(1800.00);
            newSeller.setDepartment(department);
            newSeller.setEmail("hahaha@gmail.com");
            sellerDao.insert(newSeller);
            System.out.println("Seller id: " + newSeller.getId() + " Ok");
        } catch (ParseException e) {
            System.out.println("Error --> " + e.getMessage());
        }

        System.out.println("\n=== TESTE 5: seller update ===");
        Seller updateSeller = sellerDao.findById(9);
        updateSeller.setName("Yu Yu");
        sellerDao.update(updateSeller);
        System.out.println("Alterado com sussesso!");

    }
}
