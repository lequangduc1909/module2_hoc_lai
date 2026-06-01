package service;

import entity.PhuongTien;
import repository.IVehicleRepository;
import repository.VehicleRepository;

import java.util.List;

public class VehicleService implements IVehicleService{

    private final IVehicleRepository repo = new VehicleRepository();

    @Override
    public boolean add(PhuongTien phuongTien) {
        if (phuongTien == null){
            return false;
        }

        if (repo.findByCode(phuongTien.getSoHieuDangKy()) != null ){
            System.out.println("Không thể thêm vì số hiệu đã tồn tại.");
            return false;
        }

        repo.add(phuongTien);
        return true;
    }

    @Override
    public List<PhuongTien> getAll() {
        return repo.getAll();
    }

    @Override
    public List<PhuongTien> search(String keyword) {
        return repo.search(keyword);
    }

    @Override
    public boolean deleteByCode(String soHieu) {
        if (soHieu == null || soHieu.trim().isBlank()) {
            return false;
        }
        return repo.deleteByCode(soHieu.trim());
    }
}
