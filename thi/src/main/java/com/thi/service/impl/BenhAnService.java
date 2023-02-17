package com.thi.service.impl;

import com.thi.model.BenhAn;
import com.thi.repository.IBenhAnRepository;
import com.thi.service.IBenhAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenhAnService implements IBenhAnService {
    @Autowired
    private IBenhAnRepository iBenhAnRepository;

    @Override
    public List<BenhAn> getAll() {
        return iBenhAnRepository.getAll();
    }

    @Override
    public void delete(int id) {
        iBenhAnRepository.deleteById(id);
    }

    @Override
    public BenhAn findBenhAn(Integer id) {
        return iBenhAnRepository.findBenhAn(id);
    }

    @Override
    public void updateBenhAn(String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String phuongPhapDieuTri, String bacSiDieuTri, Integer id) {
         iBenhAnRepository.updateBenhAn(ngayNhapVien,ngayRaVien,lyDoNhapVien,phuongPhapDieuTri,bacSiDieuTri,id);
    }
}
