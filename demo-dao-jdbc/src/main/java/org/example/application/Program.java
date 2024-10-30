package org.example.application;

import org.example.model.dao.DaoFactory;
import org.example.model.dao.SellerDao;
import org.example.model.entities.Department;
import org.example.model.entities.Seller;

import java.util.List;


public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== Test 1: seller findById =====");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n==== Test 2: seller findByDepartment =====");
        List<Seller> sellers = sellerDao.findByDepartment(new Department(2,null));

        sellers.forEach(System.out::println);

        System.out.println("\n==== Test 3: seller findAll =====");
        sellers = sellerDao.findAll();

        sellers.forEach(System.out::println);
    }
}
