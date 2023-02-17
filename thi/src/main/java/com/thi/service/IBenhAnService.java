package com.thi.service;

import com.thi.model.BenhAn;

import java.util.List;

public interface IBenhAnService {
    List<BenhAn> getAll();

    void delete(int id);

    BenhAn findBenhAn(Integer id);

    void updateBenhAn(String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String phuongPhapDieuTri, String bacSiDieuTri, Integer id);


}
