package Employee;

import Staff.Staff;
import Worker.NhanVien;
import com.sun.scenario.effect.impl.prism.ps.PPSBlend_ADDPeer;

import java.util.Scanner;

public class Control {


// Hiển thị nhân viên

    public static void show(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    // Thêm nhân viên
    public static Employee[] addEmployee(Employee[] employees) {
        Scanner scanner = new Scanner(System.in);
        Employee[] newEmployee = new Employee[employees.length + 1];
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập Phone number: ");
        String phone = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Employee newEmployee1 = new Employee(name, phone, address);
        for (int i = 0; i < employees.length; i++) {
            newEmployee[i] = employees[i];
        }
        newEmployee[employees.length] = newEmployee1;
        return newEmployee;
    }

    // Xóa nv
    public static Employee[] delEmployee(Employee[] employees) {
        int id = Control.findIndex(employees);
        Employee[] newEmployee = new Employee[employees.length - 1];
        for (int i = 0; i < employees.length - 1; i++) {
            if (i < id) {
                newEmployee[i] = employees[i];
            } else {
                newEmployee[i] = employees[i + 1];
            }
        }
        return newEmployee;
    }
// Find id
    public static int findIndex(Employee[] employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id:");
        int id = scanner.nextInt();
        for (int i = 0; i < employees.length; i++) {
            if (id == employees[i].getId()) {
                return i;
            }
        }
        return -1;
    }
    // Sua nhan vien
    public static Employee[] editEmployee(Employee[] employees) {
        Scanner scanner = new Scanner(System.in);
        int id = Control.findIndex(employees);
        System.out.println("Sửa tên");
        String name = scanner.nextLine();
        System.out.println("Sửa số đt");
        String phone = scanner.nextLine();
        System.out.println("Sửa address");
        String address = scanner.nextLine();
        for (int i = 0; i < employees.length; i++) {
            if(id == i) {
                employees[i].setName(name);
                employees[i].setPhoneNumber(phone);
                employees[i].setAddress(address);
            }
        }
        return employees;
    }
}
