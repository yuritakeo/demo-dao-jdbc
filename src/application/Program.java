package application;

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
    }
}
