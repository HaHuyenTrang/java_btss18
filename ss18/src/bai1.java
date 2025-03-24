import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();

        //  tên - điểm
        student.put("Hà Huyền Trang", 10);
        student.put("Hà Bảo Châu", 9);
        student.put("HUyền Cheng", 7);
        student.put("Cheng Cheng", 7);
        student.put("Chang", 8);

        // In ra tất cả các phần tử trong Map
        System.out.println(" học sinh và điểm số:"+student);

        Scanner scanner = new Scanner(System.in);
        System.out.print(" tên học sinh cần tìm điểm: ");
        String name = scanner.nextLine();

        if (student.containsKey(name)) {
            System.out.println("Điểm " + name + ": " + student.get(name));
        } else {
            System.out.println("Không tìm thấy học sinh: " + name);
        }

        scanner.close();
    }
}
