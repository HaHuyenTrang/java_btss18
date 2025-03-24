import java.util.Map;
import java.util.TreeMap;

public class bai4 {
    public static void main(String[] args) {
        Map<Integer, Integer> employee = new TreeMap<>();

        employee.put(1, 100000);
        employee.put(6, 9000000);
        employee.put(3, 700000);
        employee.put(2, 70000);
        employee.put(5, 80000);

        System.out.println("Danh sách nhân viên và mức lương:" +employee);


        employee.put(3, 50200);
        System.out.println("\nSau khi cập nhật lương:"+employee);


        employee.remove(5);
        System.out.println("\nSau khi xóa nhân viên:"+employee);

    }
}
