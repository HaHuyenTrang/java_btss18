import java.util.*;

public class bai5 {
    public static void main(String[] args) {
        Map<String, Integer> product = new TreeMap<>();

        product.put("Laptop", 1500);
        product.put("Iphone", 8100);
        product.put("Computer", 1000);
        product.put("sofa", 3200);
        product.put("moto", 100);


        System.out.println("Danh sách sản phẩm có giá từ 500 đến 1500, sắp xếp theo giá:");
        for (Map.Entry<String, Integer> entry : product.entrySet()) {
            if (entry.getValue() >= 500 && entry.getValue() <= 1500) {
                System.out.println("Tên sản phẩm: " + entry.getKey() + " - Giá: " + entry.getValue());
            }
        }
    }
}
