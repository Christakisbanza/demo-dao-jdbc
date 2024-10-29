package org.example.application;

import org.example.model.entities.Department;
import org.example.model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1,"Book");

        Seller seller = new Seller(1500.0, 2, "Bob", "Bob@gmail.com", LocalDate.now(), department);

        System.out.println(seller);

    }
}
