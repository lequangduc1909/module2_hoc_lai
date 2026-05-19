public class NhanVien {
    private String ten;
    private String soDienThoai;
    private String boPhanLamViec;
    // Thuộc tính private thể hiện tính bao đóng
    // Dữ liệu chỉ có thể truy cập thông qua getter/setter

    private final static String tenCongTy = "ABC";
    // static vì tên công ty dùng chung cho tất cả nhân viên
    // final vì tên công ty là hằng số, không thay đổi

    public NhanVien(String ten, String soDienThoai, String boPhanLamViec) {
        setTen(ten);
        setSoDienThoai(soDienThoai);
        setBoPhanLamViec(boPhanLamViec);
    }
    // Dữ liệu được gán thông qua setter để kiểm tra tính hợp lệ

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten == null || ten.isBlank()){
            throw new IllegalArgumentException("Tên không được bỏ trống"); // Kiểm tra dữ liệu trước khi gán
        }
        this.ten = ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        if (soDienThoai == null || soDienThoai.isBlank()){
            throw new IllegalArgumentException("Số điện thoại không hợp lệ");
        } else if ((soDienThoai.length() != 10)) {
            throw new IllegalArgumentException("Số điện thoại phải có đủ 10 số");
        }
        this.soDienThoai = soDienThoai;
    }

    public String getBoPhanLamViec() {
        return boPhanLamViec;
    }

    public void setBoPhanLamViec(String boPhanLamViec) {
        if (boPhanLamViec == null || boPhanLamViec.isBlank()){
            throw new IllegalArgumentException("Bộ phận làm việc không được bỏ trống");
        }
        this.boPhanLamViec = boPhanLamViec;
    }

    public static String getTenCongTy() {
        return tenCongTy;
    }

}
