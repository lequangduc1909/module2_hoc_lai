package entity;

public class XeTuanTra extends PhuongTien{
    private int capDoChongBucXa;

    public XeTuanTra(String soHieuDangKy, String tenHang, int namSanXuat, String tenNguoiDieuPhoi, int capDoChongBucXa) {
        super(soHieuDangKy, tenHang, namSanXuat, tenNguoiDieuPhoi);
        setCapDoChongBucXa(capDoChongBucXa);
    }

    @Override
    public void setSoHieuDangKy(String soHieuDangKy) {
        super.setSoHieuDangKy(soHieuDangKy);
        if (!(soHieuDangKy.matches("XTT-\\d{3}"))){
            throw new IllegalArgumentException("Xe tuần tra phải có số hiệu theo form: XTT-XXX (Với X là số nguyên từ 0 -> 9) ");
        }
    }

    public int getCapDoChongBucXa() {
        return capDoChongBucXa;
    }

    public void setCapDoChongBucXa(int capDoChongBucXa) {
        if (capDoChongBucXa <1 || capDoChongBucXa >10){
            throw new IllegalArgumentException("Cấp độ chống bức xạ phải từ 1 đến 10");
        }
        this.capDoChongBucXa = capDoChongBucXa;
    }

    @Override
    public String toString() {
        return super.toString()+ "Cấp độ chống bức xạ: "+ getCapDoChongBucXa();
    }
}
