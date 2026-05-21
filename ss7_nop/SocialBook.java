public class SocialBook extends Book implements IBook{
    private String tacGia;

    public SocialBook(String tenSach, String nhaXuatBan, int namXuatBan, String tacGia) {
        super(tenSach, nhaXuatBan, namXuatBan);
        this.tacGia = tacGia;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        if (tacGia == null || tacGia.isBlank()){
            throw new IllegalArgumentException("Tác giả không được bỏ trống");
        }
        this.tacGia = tacGia;
    }

    @Override
    public void display() {
        System.out.println("Tên sách: "+ this.getTenSach()+
                " | Nhà xuất bản: "+ this.getNhaXuatBan()+
                " | Năm xuất bản: "+ this.getNamXuatBan()+
                " | Tác giả: "+ this.getTacGia());
    }
}
