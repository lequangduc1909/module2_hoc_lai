package service;
import entity.PhuongTien;

import java.util.List;

public interface IVehicleService {
    boolean add(PhuongTien phuongTien);
    List<PhuongTien> getAll();
    List<PhuongTien> search(String keyword);
    boolean deleteByCode(String soHieu);
}
