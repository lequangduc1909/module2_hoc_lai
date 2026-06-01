package entity;

import java.time.LocalDate;

public abstract class PhuongTien {
    private String soHieuDangKy;
    private String tenHang;
    private int namSanXuat;
    private String tenNguoiDieuPhoi;
    int namHienTai = LocalDate.now().getYear();

    public PhuongTien(String soHieuDangKy, String tenHang, int namSanXuat, String tenNguoiDieuPhoi) {
        setSoHieuDangKy(soHieuDangKy);
        setTenHang(tenHang);
        setNamSanXuat(namSanXuat);
        setTenNguoiDieuPhoi(tenNguoiDieuPhoi);
    }

    public String getSoHieuDangKy() {
        return soHieuDangKy;
    }

    public void setSoHieuDangKy(String soHieuDangKy) {
        if (soHieuDangKy == null || soHieuDangKy.trim().isBlank()){
            throw new IllegalArgumentException("Số hiệu không được bỏ trống");
        }
        this.soHieuDangKy = soHieuDangKy.trim();
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang == null || tenHang.trim().isBlank()){
            throw new IllegalArgumentException("Tên hãng không được bỏ trống");
        }
        this.tenHang = tenHang.trim();
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        if (namSanXuat <=1900 || namSanXuat > namHienTai){
            throw new IllegalArgumentException("Năm sản xuất không hợp lệ");
        }
        this.namSanXuat = namSanXuat;
    }

    public String getTenNguoiDieuPhoi() {
        return tenNguoiDieuPhoi;
    }

    public void setTenNguoiDieuPhoi(String tenNguoiDieuPhoi) {
        if (tenNguoiDieuPhoi == null || tenNguoiDieuPhoi.trim().isBlank()){
            throw new IllegalArgumentException("Tên người điều phối không được bỏ trống.");
        }
        this.tenNguoiDieuPhoi = tenNguoiDieuPhoi.trim();
    }

    @Override
    public String toString() {
        return "Số hiệu: " + getSoHieuDangKy() + "| Hãng: "+ getTenHang()
                + "| Năm sản xuất: "+ getNamSanXuat()+ "| Tên người điều phối: "+ getTenNguoiDieuPhoi()+ "| ";
    }
}
