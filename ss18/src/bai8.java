import java.util.*;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Nhập một số nguyên dương (1 - 3999): ");
        num = scanner.nextInt();



    // Map lưu trữ các giá trị La Mã
    TreeMap<Integer, String> romanNumerals = new TreeMap<>();
    romanNumerals.put(1000,"M");
    romanNumerals.put(900,"CM");
    romanNumerals.put(500,"D");
    romanNumerals.put(400,"CD");
    romanNumerals.put(100,"C");
    romanNumerals.put(90,"XC");
    romanNumerals.put(50,"L");
    romanNumerals.put(40,"XL");
    romanNumerals.put(10,"X");
    romanNumerals.put(9,"IX");
    romanNumerals.put(5,"V");
    romanNumerals.put(4,"IV");
    romanNumerals.put(1,"I");


        String roman = "";
        for (Map.Entry<Integer, String> entry : romanNumerals.entrySet()) {
            while (num >= entry.getKey()) {//Nếu giá trị num lớn hơn hoặc bằng key hiện tạ
                roman += entry.getValue(); // Thêm ký hiệu La Mã tương ứng vào chuỗi kết quả.
                num -= entry.getKey();//Giảm giá trị num bằng key hiện tại để tiếp tục chuyển đổi phần còn lại.
            }
        }
        System.out.println("Số La Mã tương ứng: " + roman);

    }

}
