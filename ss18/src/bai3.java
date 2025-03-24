import java.util.LinkedHashMap;
import java.util.Map;

public class bai3 {
    public static void main(String[] args) {
        Map<String, Integer> product = new LinkedHashMap<>();

        product.put("Laptop", 1500);
        product.put("Iphone", 8100);
        product.put("Computer", 1000);
        product.put("sofa", 3200);
        product.put("moto", 100);

        System.out.println("Thông tin của product: "+product);

        // Cập nhật giá của sản phẩm "Laptop"
        product.put("Laptop", 1000);
        System.out.println("Thông tin của product sau khi cập nhật giá Laptop: "+product);

        // Xóa một sản phẩm khỏi danh sách
        product.remove("sofa");
        System.out.println("Thông tin của product sau khi xóa sofa : "+product);
    }
}