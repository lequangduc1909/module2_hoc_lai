package repository;

import entity.PhuongTien;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class VehicleRepository implements IVehicleRepository {
    private final ArrayList<PhuongTien> phuongTiens = new ArrayList<>();

    @Override
    public void add(PhuongTien phuongTien){
        phuongTiens.add(phuongTien);
    }

    @Override
    public PhuongTien findByCode(String soHieu){
        for (PhuongTien phuongTien : phuongTiens){
            if (phuongTien.getSoHieuDangKy().equalsIgnoreCase(soHieu)) {
                return phuongTien;
            }
        }
        return null;
    }

    @Override
    public List<PhuongTien> getAll(){
        return List.copyOf(phuongTiens);
    }

    @Override
    public List<PhuongTien> search(String keyword) {
        List<PhuongTien> searchList = new ArrayList<>();

        if (keyword == null || keyword.trim().isBlank()){
            return searchList;
        }

        String normalizedKeyword = normalize(keyword);
        for (PhuongTien phuongTien : phuongTiens){
            if (normalize(phuongTien.getSoHieuDangKy()).contains(normalizedKeyword) ||
                normalize(phuongTien.getTenNguoiDieuPhoi()).contains(normalizedKeyword)){
                searchList.add(phuongTien);
            }
        }

        return searchList;
    }

    @Override
    public boolean deleteByCode(String soHieu) {
        PhuongTien found = findByCode(soHieu);
        if (found == null) {
            return false;
        }
        return phuongTiens.remove(found);
    }

    private String normalize(String s) {
        if (s == null) return "";
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        temp = temp.replaceAll("\\p{M}", "");
        temp = temp.replace("đ", "d");
        return temp.toLowerCase().trim();
    }
}
