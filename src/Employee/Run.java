package Employee;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Tú Anh", "0886111111", "Quảng Ninh");
        employees[1] = new Employee("Thảo", "0886222222", "TP.Hồ Chí Minh");
        employees[2] = new Employee("Thắng", "0886333333", "Hà Nội");

        while (true) {
            System.out.println("1. Thêm nhân viên: ");
            System.out.println("2. Xóa nhân viên: ");
            System.out.println("3. Hiển thị nhân viên: ");
            System.out.println("4. Sửa nhân viên: ");
            System.out.println("Nhập lựa chọn:");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    employees = Control.addEmployee(employees);
                    break;
                case 2:
                    employees = Control.delEmployee(employees);
                    break;
                case 3:
                     Control.show(employees);
                     break;
                case 4:
                    Control.editEmployee(employees);
            }
        }
    }


}
