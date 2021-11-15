package Worker;

import java.util.Arrays;
import java.util.Scanner;

public class MainNhanVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Quản lý nhân viên");
            System.out.println("1.Thêm nhân viên");
            System.out.println("2.Tìm kiếm nhân viên");
            System.out.println("3.Xóa nhân viên");
            System.out.println("4.Sửa nhân viên");
            System.out.println("5.Hiển thị nhân viên");
            System.out.println("6.Sắp xếp nhân viên");
            System.out.println("7.Exit");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Công nhân");
                    System.out.println("2. Kỹ sư");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            NhanVien congNhan = ControllerNhanVien.createNhanVien(false);
                            ControllerNhanVien.addNhanVien(congNhan);
                            break;
                        case 2:
                            NhanVien kySu = ControllerNhanVien.createNhanVien(true);
                            ControllerNhanVien.addNhanVien(kySu);
                            break;
                    }
                    break;
                case 2:
                    ControllerNhanVien.findNhanVien();
                    ControllerNhanVien.showNhanVien(true);
                    break;
                case 3:
                    ControllerNhanVien.deleteNhanvien();
                    break;
                case 4:
                    ControllerNhanVien.editNhanvien();
                    break;
                case 5:
                    System.out.println("1. Công nhân");
                    System.out.println("2. Kỹ sư");
                    System.out.println("3. Toàn bộ nhân viên");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            ControllerNhanVien.showNhanVien(false);
                            break;
                        case 2:
                            ControllerNhanVien.showNhanVien(true);
                            break;
                        case 3:
                            ControllerNhanVien.showAllNhanVien();
                    }
                case 6:
                    ControllerNhanVien.sortByName();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }

    }
}
