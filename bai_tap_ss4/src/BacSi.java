public class BacSi {
    private String ten;
    private int tuoi;
    private String diaChi;
    private String email;
    private String soDienThoai;
    private String viTriLamViec;

    public BacSi(String ten, int tuoi, String diaChi, String email, String soDienThoai, String viTriLamViec) {
        setTen(ten);
        setTuoi(tuoi);
        setDiaChi(diaChi);
        setEmail(email);
        setSoDienThoai(soDienThoai);
        setViTriLamViec(viTriLamViec);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (ten == null || ten.isBlank()) {
            throw new IllegalArgumentException("Tên không được bỏ trống");
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi < 22) {
            throw new IllegalArgumentException("Tuổi không thể nhỏ hơn 22");
        }
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        if (diaChi == null || diaChi.isBlank()) {
            throw new IllegalArgumentException("Địa chỉ không được bỏ trống");
        }
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank()||!email.contains("@")) {
            throw new IllegalArgumentException("Email không hợp lệ");
        }
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        if (soDienThoai == null || soDienThoai.isBlank()|| soDienThoai.length() != 10){
            throw new IllegalArgumentException("Số điện thoại không được bỏ trống");
        }
        this.soDienThoai = soDienThoai;
    }

    public String getViTriLamViec() {
        return viTriLamViec;
    }

    public void setViTriLamViec(String viTriLamViec) {
        if (viTriLamViec == null || viTriLamViec.isBlank()) {
            throw new IllegalArgumentException("Vị trị làm việc không được bỏ trống");
        }
        this.viTriLamViec = viTriLamViec;
    }

    public void hienThiThongTinBacSi() {
        System.out.println("===== THÔNG TIN BÁC SĨ =====");
        System.out.println("Tên: " + getTen());
        System.out.println("Tuổi: " + getTuoi());
        System.out.println("Địa chỉ: " + getDiaChi());
        System.out.println("Email: " + getEmail());
        System.out.println("SĐT: " + getSoDienThoai());
        System.out.println("Vị trí làm việc: " + getViTriLamViec());
    }
}
