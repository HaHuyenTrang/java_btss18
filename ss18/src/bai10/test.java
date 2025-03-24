package bai10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Employee> employees = new HashMap<>();

        while (true) {
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Tính tổng lương");
            System.out.println("4. Tính lương trung bình");
            System.out.println("5. Tìm nhân viên có lương cao nhất");
            System.out.println("6. Tìm nhân viên có lương thấp nhất");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên nhân viên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập lương: ");
                    double salary = scanner.nextDouble();
                    Employee emp = new Employee(name, salary);
                    employees.put(emp.getId(), emp);
                    System.out.println("Thêm nhân viên thành công!"+employees);
                    break;

                case 2:
                    System.out.println("Danh sách nhân viên:"+employees);
                    break;

                case 3:
                    double totalSalary = 0;
                    for (Employee e : employees.values()) {
                        totalSalary += e.getSalary();
                    }
                    System.out.println("Tổng lương: " + totalSalary);
                    break;

                case 4:
                        double ttSalary = 0;
                        for (Employee e : employees.values()) {
                            ttSalary += e.getSalary();
                        }
                        double avgSalary = ttSalary / employees.size();
                        System.out.println("Lương trung bình: " + avgSalary);
                    break;
                case 5:
                    Employee maxSalaryEmp = null;//Biến maxSalaryEmp dùng để lưu nhân viên có lương cao nhất.
                    double maxSalary = 0;
                    for (Employee e : employees.values()) {
                        if (e.getSalary() > maxSalary) {
                            maxSalary = e.getSalary();
                            maxSalaryEmp = e;
                        }
                    }
                    System.out.println("Nhân viên có lương cao nhất: " + maxSalaryEmp);
                    break;

                case 6:
//                    Employee minSalaryEmp = null;
//                    double minSalary = 0;
//                    for (Employee e : employees.values()) {
//                        if (e.getSalary() < minSalary) {
//                            minSalary = e.getSalary();
//                            minSalaryEmp = e;
//                        }
//                    }
//                    System.out.println("Nhân viên có lương thấp nhất: " + minSalaryEmp);
//                    break;

                case 7:
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }
}
