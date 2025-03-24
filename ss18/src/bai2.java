import java.util.HashMap;
import java.util.Map;

public class bai2 {
    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();

        product.put("Laptop", 1500);
        product.put("Iphone", 8100);
        product.put("Computer", 1000);
        product.put("sofa", 3200);
        product.put("moto", 100);


        if (product.containsKey("Laptop")) {
            System.out.println("Sản phẩm 'Laptop' có trong danh sách với giá: " + product.get("Laptop"));
        } else {
            System.out.println("Sản phẩm 'Laptop' không có trong danh sách.");
        }

        // Kiểm tra sản phẩm có giá trị bằng 1000 hay không

        for (int price : product.values()) {
            if (price == 1000) {
                System.out.println("Có sản phẩm có giá trị 1000.");
            }else {
                System.out.println("Không có sản phẩm nào có giá trị 1000.");
            }
        }
    }
}
