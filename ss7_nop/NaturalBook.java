public class NaturalBook extends Book implements IBook {
    private int soLuongXuatBan;

    public NaturalBook(String tenSach, String nhaXuatBan, int namXuatBan, int soLuongXuatBan) {
        super(tenSach, nhaXuatBan, namXuatBan);
        setSoLuongXuatBan(soLuongXuatBan);
    }

    public int getSoLuongXuatBan() {
        return soLuongXuatBan;
    }

    public void setSoLuongXuatBan(int soLuongXuatBan) {
        if (soLuongXuatBan <0){
            throw new IllegalArgumentException("Số lượng xuất bản không được nhỏ hơn 0");
        }
        this.soLuongXuatBan = soLuongXuatBan;
    }

    @Override
    public void display() {
        System.out.println("Tên sách: "+ this.getTenSach()+
                " | Nhà xuất bản: "+ this.getNhaXuatBan()+
                " | Năm xuất bản: "+ this.getNamXuatBan()+
                " | Số lượng xuất bản: "+ this.getSoLuongXuatBan());
    }
}
