package project1;

import java.util.Scanner;

public class Inventory {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            int choice =-1;
            while(choice != 0) {
                System.out.println("1-) Add item to Inventory");
                System.out.println("2-) List All items in Inventory");
                System.out.println("3-) List Specific item in Inventory");
                System.out.println("4-) List custom Quantity in Inventory");
                System.out.println("5-) List total items in Inventory");
                System.out.println("0-) Quit from program");
                System.out.print("Make your choice : ");
                choice = scanner.nextInt();
                String product;
                int qty;
                switch (choice) {
                    case 1:
                        InventoryOperations.insertItems("src\\projects\\inventory.txt");
                        break;
                    case 2:
                        InventoryOperations.listInventory("src\\projects\\inventory.txt");
                        break;
                    case 3:
                        System.out.print("Product name to filter : ");
                        product = scanner.next();
                        InventoryOperations.listInventory("src\\projects\\inventory.txt", product);
                        break;
                    case 4:
                        System.out.print("Enter quantity to filter");
                        qty = scanner.nextInt();
                        InventoryOperations.listInventory("src\\projects\\inventory.txt", qty);
                        break;
                    case 5:
                        InventoryOperations.listTotalQuantity("src\\projects\\inventory.txt");
                        break;
                    default:
                        if(choice!=0)
                            System.out.println("Please enter one of the options");
                        break;
            }
        }

    }

}
