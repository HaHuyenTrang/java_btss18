import java.util.*;

public class bai6 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> student = new LinkedHashMap<>();

        // Thêm 10 học sinh vào LinkedHashMap
        student.put("Hà Huyền Trang", 10);
        student.put("Hà Bảo Châu", 9);
        student.put("HUyền Cheng", 7);
        student.put("Cheng Cheng", 7);
        student.put("Chang", 8);
        student.put("Dương ngu", 3);
        student.put("Dương khỉ", 10);
        student.put("meowwww Dương", 2);
        student.put("Dươngggg", 7);

        // In ra danh sách học sinh và điểm số theo thứ tự thêm vào
        System.out.println("Danh sách học sinh và điểm số:"+student);

        // Tính điểm trung bình
        int average = 0;
        for (int score : student.values()) {
            average += score;
        }
        double averageScore = average / student.size();
        System.out.println("\nĐiểm trung bình của tất cả học sinh: " + averageScore);

        // Xóa học sinh có điểm dưới 5
        student.entrySet().removeIf(entry -> entry.getValue() < 5);


        // In lại danh sách sau khi xóa
        System.out.println("\nDanh sách học sinh sau khi xóa những học sinh có điểm dưới 5:"+student);

    }
}
