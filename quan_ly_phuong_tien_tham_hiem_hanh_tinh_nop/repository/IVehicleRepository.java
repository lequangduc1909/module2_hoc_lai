package repository;

import entity.PhuongTien;

import java.util.List;

public interface IVehicleRepository {
    void add(PhuongTien phuongTien);
    PhuongTien findByCode(String soHieu);
    List<PhuongTien> getAll();
    List<PhuongTien> search(String keyword);
    boolean deleteByCode(String soHieu);
}
