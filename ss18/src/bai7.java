import java.util.*;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.print("Nhập số phần tử của mảng: ");
        N = scanner.nextInt();

        int[] arr = new int[N];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Đếm số lần xuất hiện của từng phần tử bằng TreeMap
        Map<Integer, Integer> count = new TreeMap<>();
        for (int num : arr) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
            //Nếu num đã tồn tại → Lấy giá trị hiện tại, tăng 1.
            //
            //Nếu num chưa tồn tại → Đặt giá trị ban đầu là 1.

        }

        System.out.println("\nCác phần tử sắp xếp theo số lần xuất hiện tăng dần:"+count);

    }
}
