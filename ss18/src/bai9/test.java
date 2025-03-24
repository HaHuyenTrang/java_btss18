package bai9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Product> productHashMap = new HashMap<>();
        int choice;

        do {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Cập nhật sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Tính tổng giá trị kho");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Thêm sản phẩm
                    System.out.print("Nhập ID sản phẩm: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();
                    System.out.print("Nhập số lượng: ");
                    int quantity = scanner.nextInt();
                    productHashMap.put(id, new Product(id, name, price, quantity));
                    System.out.println("Sản phẩm đã được thêm!"+productHashMap);
                    break;
                case 2:
                    System.out.print("Nhập ID sản phẩm cần cập nhật: ");
                    int updateId = scanner.nextInt();
                    if (!productHashMap.containsKey(updateId)) {
                        System.out.println("Sản phẩm không tồn tại!");
                        break;
                    }
                    System.out.print("Nhập giá mới: ");
                    double newPrice = scanner.nextDouble();
                    System.out.print("Nhập số lượng mới: ");
                    int newQuantity = scanner.nextInt();
                    Product updatedProduct = productHashMap.get(updateId);
                    updatedProduct.price = newPrice;
                    updatedProduct.quantity = newQuantity;
                    System.out.println("Sản phẩm đã được cập nhật!"+productHashMap);
                    break;
                case 3:
                    System.out.print("Nhập ID sản phẩm cần xóa: ");
                    int removeId = scanner.nextInt();
                    if (productHashMap.remove(removeId) == null) {
                        System.out.println("Sản phẩm không tồn tại!");
                    } else {
                        System.out.println("Sản phẩm đã bị xóa!"+productHashMap);
                    }
                    break;
                case 4:
                    double totalValue = 0;
                    for (Product product : productHashMap.values()) {
                        totalValue += product.totalPrice();
                    }
                    System.out.println("Tổng giá trị kho: " + totalValue);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }
    }