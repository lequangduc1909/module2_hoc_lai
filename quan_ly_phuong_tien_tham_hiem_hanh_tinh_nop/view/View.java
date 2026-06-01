package view;

import controller.VehicleController;
import entity.Drone;
import entity.PhuongTien;
import entity.XeTuanTra;

import java.util.List;
import java.util.Scanner;

public class View {
    private final VehicleController controller = new VehicleController();

    Scanner scanner = new Scanner(System.in);

    public void menuChinh() {
        while (true) {
            System.out.println("           ");
            System.out.println("=====CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN THÁM HIỂM=====");
            System.out.println("1. Thêm phương tiện.");
            System.out.println("2. Hiển thị danh sách phương tiện.");
            System.out.println("3. Tìm kiếm phương tiện.");
            System.out.println("4. Xóa phương tiện.");
            System.out.println("5. Thoát.");
            int nhapVao = inputInt("Chọn chức năng bằng cách nhập số tương ứng:");

            switch (nhapVao) {
                case 1:
                    optionOne();
                    break;
                case 2:
                    optionTwo();
                    break;
                case 3:
                    optionThree();
                    break;
                case 4:
                    optionFour();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;

            }
        }
    }

    public void optionOne() {
        while (true) {
            System.out.println("===============");
            System.out.println("1. Thêm Drone.");
            System.out.println("2. Thêm Xe Tuần Tra.");
            System.out.println("#. Nhập số bất kì để về về Menu Chính.");
            int nhapVao = inputInt("Chọn chức năng bằng cách nhập số tương ứng:");

            switch (nhapVao) {
                case 1:
                    optionOneAddDrone();
                    break;

                case 2:
                    optionOneAddXeTT();
                    break;

                default:
                    return;
            }
        }
    }

    public void optionOneAddDrone() {
        System.out.println("----------");
        System.out.println("Nhập những thông tin sau để thêm Drone mới:");
        String soHieu = inputString("Số hiệu (Số hiệu phải theo form: DRN-XXX, với X là số nguyên từ 0 -> 9):");
        String tenHang = inputString("Tên hãng:");
        int namSanXuat = inputInt("Năm sản xuất (Không được lớn hơn năm hiện tại):");
        String tenNguoiDieuPhoi = inputString("Người điều phối:");
        double tamBayToiDa = inputDouble("Tầm bay tối đa (km):");

        if (controller.addDrone(soHieu, tenHang, namSanXuat, tenNguoiDieuPhoi, tamBayToiDa)) {
            System.out.println("Thêm thành công.");

        } else {
            System.out.println("Thêm thất bại.");
        }
    }

    public void optionOneAddXeTT() {
        System.out.println("----------");
        System.out.println("Nhập những thông tin sau để thêm Xe Tuần Tra mới:");
        String soHieu = inputString("Số hiệu (Số hiệu phải theo form: XTT-XXX, với X sau dấu (-) là số nguyên từ 0 -> 9):");
        String tenHang = inputString("Tên hãng:");
        int namSanXuat = inputInt("Năm sản xuất (Không được lớn hơn năm hiện tại):");
        String tenNguoiDieuPhoi = inputString("Người điều phối:");
        int khaNangChongBucXa = inputInt("Mức độ chống bức xạ (Từ 1-10):");

        if (controller.addXeTuanTra(soHieu, tenHang, namSanXuat, tenNguoiDieuPhoi, khaNangChongBucXa)) {
            System.out.println("Thêm thành công.");
        } else {
            System.out.println("Thêm thất bại.");
        }
    }

    public void optionTwo() {
        while (true) {
            System.out.println("===============");
            System.out.println("1. Xem danh sách Drone.");
            System.out.println("2. Xem danh sách Xe Tuần Tra.");
            System.out.println("3. Xem danh sách tổng.");
            System.out.println("#. Nhập số bất kì để trở về Menu Chính.");
            int nhapVao = inputInt("Chọn chức năng bằng cách nhập số tương ứng:");

            switch (nhapVao) {
                case 1:
                    optionTwoGetDrone();
                    break;
                case 2:
                    optionTwoGetXeTuanTra();
                    break;
                case 3:
                    optionTwoGetAll();
                    break;
                default:
                    return;
            }

        }
    }

    public void optionTwoGetDrone() {
        List<PhuongTien> pt = controller.getAll();

        if (pt.isEmpty()) {
            System.out.println("   ");
            System.out.println("Danh sách trống, vui lòng nhập thiết bị mới vào.");
            System.out.println("  ");
        } else {
            for (PhuongTien a : pt) {
                if (a instanceof Drone) {
                    System.out.println(a);
                }
            }
        }

    }

    public void optionTwoGetXeTuanTra() {
        List<PhuongTien> pt = controller.getAll();

        if (pt.isEmpty()) {
            System.out.println("   ");
            System.out.println("Danh sách trống, vui lòng nhập thiết bị mới vào.");
            System.out.println("  ");
        } else {
            for (PhuongTien a : pt) {
                if (a instanceof XeTuanTra) {
                    System.out.println(a);
                }
            }
        }
    }

    public void optionTwoGetAll() {
        List<PhuongTien> pt = controller.getAll();
        if (pt.isEmpty()) {
            System.out.println("   ");
            System.out.println("Danh sách trống, vui lòng nhập thiết bị mới vào.");
            System.out.println("  ");
        } else {
            for (PhuongTien a : pt) {
                System.out.println(a);
            }
        }

    }

    public void optionThree() {
        System.out.println("===============");
        String nhapVao = inputString("Mời nhập từ khóa để tìm thiết bị mong muốn " + "(Nhập số hiệu thiết bị hoặc tên người điều phối).");
        List<PhuongTien> searchList = controller.search(nhapVao);
        if (searchList.isEmpty()) {
            System.out.println("-------------");
            System.out.println("Không tìm thấy kết quả phù hợp");
        } else {
            System.out.println("-------------");
            for (PhuongTien phuongTien : searchList) {
                System.out.println(phuongTien);
            }
        }
    }

    public void optionFour() {
        System.out.println("===============");
        String soHieu = inputString("Nhập số hiệu phương tiện cần xóa:");
        boolean deleted = controller.deleteByCode(soHieu);

        if (deleted) {
            System.out.println("Xóa phương tiện thành công.");
        } else {
            System.out.println("Không tìm thấy phương tiện với số hiệu đã nhập.");
        }
    }

    //--------------------------------------------------------
    private int inputInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập số nguyên hợp lệ");
            }
        }
    }

    private double inputDouble(String message) {
        while (true) {
            try {
                System.out.println(message);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập số thực hợp lệ");
            }
        }
    }

    private String inputString(String message) {
        while (true) {
            System.out.println(message);
            String nhap = scanner.nextLine().trim();
            if (!(nhap.isBlank())) {
                return nhap;
            }
        }
    }
}


