package com.tns.onlineshopping.application;
import com.tns.onlineshopping.entities.*;
import com.tns.onlineshopping.services.*;
import java.util.*;
public class OnlineShopping 
{
  
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();
    private static List<Customer> customerList = new ArrayList<>();
    private static List<Order> orderList = new ArrayList<>();
    private static List<Admin> adminList = new ArrayList<>();
    private static AdminService adminService = new AdminService();
    private static CustomerService customerService = new CustomerService();
    private static OrderService orderService = new OrderService();
    private static ProductService productService = new ProductService(); 
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                adminMenu();
            } else if (choice == 2) {
                customerMenu();
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option! Please choose again.");
            }
        }
    }
    
    private static void adminMenu() {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Products");
            System.out.println("4. Create Admin");
            System.out.println("5. View Admins");
            System.out.println("6. Update Order Status");
            System.out.println("7. View Orders");
            System.out.println("8. Return");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                addProduct();
            } 
            else if (choice == 2) 
            {
                removeProduct();
            } 
            else if (choice == 3) 
            {
                viewProducts1();
            } 
            else if (choice == 4) 
            {
                createAdmin();
            } 
            else if (choice == 5)
            {
                viewAdmins();
            } 
            else if (choice == 6) 
            {
                updateOrderStatus();
            } 
            else if (choice == 7) 
            {
                viewOrders();
            } else if (choice == 8) {
                System.out.println("Exiting Admin...");
                break;
            } else {
                System.out.println("Invalid option! Please choose again.");
            }
        }
    }
    
    private static void customerMenu() {
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Create Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Place Order");
            System.out.println("4. View Orders");
            System.out.println("5. View Products");
            System.out.println("6. Return");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            if (choice == 1) {
                createCustomer();
            } else if (choice == 2) {
                viewCustomers();
            } else if (choice == 3) {
                placeOrder();
            } else if (choice == 4) {
                viewOrders();
            } else if (choice == 5) {
                viewProducts1();
            } else if (choice == 6) {
                System.out.println("Exiting Customer Menu...");
                break;
            } else {
                System.out.println("Invalid option! Please choose again.");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Enter ProductID: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Stock Quantity: ");
        int stockQuantity = scanner.nextInt();
        
        Product product = new Product(productId, name, price, stockQuantity);
        adminService.addProduct(productList, product);
    }

    private static void removeProduct() {
        System.out.print("Enter ProductID to remove: ");
        int productId = scanner.nextInt();
        adminService.removeProduct(productList, productId);
    }

    private static void viewProducts1() {
        adminService.viewProducts(productList);
    }

    private static void createAdmin() {
        System.out.println("Enter Admin Details");
        System.out.print("Enter Admin User ID: ");
        int adminUserId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Admin Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Admin Email: ");
        String email = scanner.nextLine();

      
        Admin admin = new Admin(adminUserId, username, email);  
        adminList.add(admin);  
        System.out.println("Admin created successfully!");
    }


    private static void viewAdmins() {
        if (adminList.isEmpty()) {
            System.out.println("No admins available.");
        } else {
            System.out.println("Admins:");
            for (Admin admin : adminList) {
                System.out.println(admin);  
            }
        }
    }

    private static void updateOrderStatus() {
        System.out.print("Enter OrderID to update: ");
        int orderId = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter new status (Completed/Delivered/Cancelled): ");
        String status = scanner.nextLine();

        for (Order order : orderList) {
            if (order.getOrderId() == orderId) {
                adminService.updateOrderStatus(order, status);
                return;
            }
        }
        System.out.println("Order not found!");
    }

    private static void viewOrders() {
        adminService.viewOrders(orderList);
    }

    
    private static void createCustomer() {
        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        customerService.createCustomer(customerList, userId, username, email, address);
    }

    private static void viewCustomers() {
        customerService.viewCustomers(customerList);
    }

    private static void placeOrder() {
        System.out.print("Enter CustomerID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();  
        Customer customer = null;
        for (Customer c : customerList) {
            if (c.getUserId() == customerId) {
                customer = c;
                break;
            }
        }
        if (customer == null) {
            System.out.println("Customer not found!");
            return;
        }
        if (customer.getOrders() == null) {
            customer.setOrders(new ArrayList<>());
        }
        
       
        ArrayList<ProductQuantityPair> orderItems = new ArrayList<>();
        while (true) {
            System.out.print("Enter Product ID to add to order (or -1 to complete): ");
            int productId = scanner.nextInt();
            if (productId == -1) 
              {
               break;
            }
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            Product selectedProduct = null;
            for (Product product : productList) {
                if (product.getProductId() == productId) {
                    selectedProduct = product;
                    break;
                }
            }
  
            if (selectedProduct != null)
            {
                orderItems.add(new ProductQuantityPair(selectedProduct, quantity));
            } 
            else {
                System.out.println("Product not found!");
            }
        }

        Order newOrder = new Order(orderList.size() + 1, customer, orderItems);
        orderList.add(newOrder);
        customer.getOrders().add(newOrder);
        System.out.println("Order placed successfully!");
    }
}
