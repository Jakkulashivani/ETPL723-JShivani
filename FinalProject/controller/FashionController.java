package com.evergent.corejava.controller;

import java.util.Scanner;
import com.evergent.corejava.service.*;

public class FashionController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FashionService fashionService = new FashionService();
        int choice;
        do {
            System.out.println("\t\t\t------Fashion Management System-------");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Product ID: ");
                    int productId = scanner.nextInt();
                    System.out.println("Enter Product Name: ");
                    String productName = scanner.next();
                    System.out.println("Enter Category: ");
                    String category = scanner.next();
                    System.out.println("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.println("Enter Stock: ");
                    int stock = scanner.nextInt();
                    int count = fashionService.addProduct(productId, productName, category, price, stock);
                    System.out.println(count + " Product Added Successfully");
                    break;
                case 2:
                    System.out.println("Enter Product ID to update: ");
                    int updateProductId = scanner.nextInt();
                    System.out.println("Enter new Stock: ");
                    int newStock = scanner.nextInt();
                    fashionService.updateProduct(updateProductId, newStock);
                    break;
                case 3:
                    System.out.println("Enter Product ID to delete: ");
                    int deleteProductId = scanner.nextInt();
                    fashionService.deleteProduct(deleteProductId);
                    break;
                case 4:
                    System.out.println("Enter Product ID to view: ");
                    int viewProductId = scanner.nextInt();
                    String productDetails = fashionService.viewProduct(viewProductId);
                    System.out.println(productDetails);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
        scanner.close();
    }
}
