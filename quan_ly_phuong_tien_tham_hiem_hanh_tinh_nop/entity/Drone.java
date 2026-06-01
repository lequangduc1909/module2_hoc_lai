package entity;

public class Drone extends PhuongTien {
    private double tamBayToiDa;

    public Drone(String soHieuDangKy, String tenHang, int namSanXuat, String tenNguoiDieuPhoi, double tamBayToiDa) {
        super(soHieuDangKy, tenHang, namSanXuat, tenNguoiDieuPhoi);
        setTamBayToiDa(tamBayToiDa);
    }

    @Override
    public void setSoHieuDangKy(String soHieuDangKy) {
        super.setSoHieuDangKy(soHieuDangKy);
        if (!(soHieuDangKy.matches("DRN-\\d{3}"))) {
            throw new IllegalArgumentException("Drone phải có số hiệu theo form: DRN-XXX (Với X là số nguyên từ 0 -> 9) ");
        }
    }

    public double getTamBayToiDa() {
        return tamBayToiDa;
    }

    public void setTamBayToiDa(double tamBayToiDa) {
        if (tamBayToiDa <= 0) {
            throw new IllegalArgumentException("Tầm bay tối đa không hợp lệ");
        }
        this.tamBayToiDa = tamBayToiDa;
    }

    @Override
    public String toString() {
        return super.toString() + "Tầm bay: " + getTamBayToiDa() + "| ";
    }
}
