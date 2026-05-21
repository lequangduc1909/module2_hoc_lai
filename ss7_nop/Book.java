public abstract class Book {
    private String tenSach;
    private String nhaXuatBan;
    private int namXuatBan;

    public Book(String tenSach, String nhaXuatBan, int namXuatBan) {
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        if (tenSach == null || tenSach.isBlank()){
            throw new IllegalArgumentException("Tên sách không được bỏ trống");
        }
        this.tenSach = tenSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        if (nhaXuatBan == null || nhaXuatBan.isBlank()){
            throw new IllegalArgumentException("Nhà Xuất Bản không được để trống");
        }
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        if (namXuatBan >2026){
            throw new IllegalArgumentException("Năm xuất bản không hợp lệ");
        }
        this.namXuatBan = namXuatBan;
    }
}
