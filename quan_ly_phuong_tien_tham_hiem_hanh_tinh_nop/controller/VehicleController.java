package controller;

import entity.Drone;
import entity.PhuongTien;
import entity.XeTuanTra;
import service.IVehicleService;
import service.VehicleService;
import utils.CommonUtils;

import java.util.List;

public class VehicleController {
    private final IVehicleService service = new VehicleService();

    public boolean addDrone(String soHieu, String tenHang, int namSanXuat, String nguoiDieuPhoi, double tamBayToiDa){
        try{
            String soHieuChuan = CommonUtils.normalizeVehicleId(soHieu);
            Drone drone = new Drone(soHieuChuan, tenHang, namSanXuat, nguoiDieuPhoi, tamBayToiDa);
            return service.add(drone);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean addXeTuanTra(String soHieu, String tenHang, int namSanXuat, String nguoiDieuPhoi, int khaNangChongBucXa){
        try{
            String soHieuChuan = CommonUtils.normalizeVehicleId(soHieu);
            XeTuanTra xeTuanTra = new XeTuanTra(soHieuChuan, tenHang, namSanXuat, nguoiDieuPhoi, khaNangChongBucXa);
            return service.add(xeTuanTra);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<PhuongTien> getAll(){
        return service.getAll();
    }

    public List<PhuongTien> search(String keyword){
        return service.search(keyword);
    }

    public boolean deleteByCode(String soHieu){
        String soHieuChuan = CommonUtils.normalizeVehicleId(soHieu);
        return service.deleteByCode(soHieuChuan);
    }
}
