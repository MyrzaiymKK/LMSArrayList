package service.impl;

import Role.Admin;
import service.AdminService;

import java.util.Scanner;

public class AdminImpl implements AdminService {
    @Override
    public Admin voitti(Admin admin) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your email: ");
        String email = scanner.nextLine();
        System.out.println("Write your password: ");
        String pass = scanner.nextLine();
        if(admin.getEmail().equalsIgnoreCase(email) && admin.getPassword().equalsIgnoreCase(pass)){
            System.out.println("Welcom!");
            return admin;
        }else System.out.println("Invalid email or password");
        return null;
    }

    @Override
    public Admin izmenit(Admin admin) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write email: " );
        String email = scanner.nextLine();

        if (email.equalsIgnoreCase(admin.getEmail())){
            System.out.println("Write new Password: ");
            String pass = scanner.nextLine();

            admin.setPassword(pass);
            System.out.println("Success updated");
            System.out.println(admin);
        }else System.out.println("User not found");
        return admin;

    }
}
