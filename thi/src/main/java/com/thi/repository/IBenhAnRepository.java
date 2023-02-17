package com.thi.repository;

import com.thi.model.BenhAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface IBenhAnRepository extends JpaRepository<BenhAn, Integer> {

    @Query(value = "select * from benh_an",nativeQuery = true)
    List<BenhAn> getAll();

    @Modifying
    @Transactional
    @Query(value = "delete from benh_an where id = :id", nativeQuery = true)
    void delete(@Param("id") Integer id);


    @Query(value = "select * from medical_record where id = :id", nativeQuery = true)
    BenhAn findBenhAn(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = "update medical_record set ngay_nhap_vien = :ngayNhapVien, ngay_ra_vien = :ngayRaVien, ly_do_nhap_vien = :lyDoNhapVien, phuong_phap_dieu_tri = :phuongPhapDieuTri, bac_si_dieu_tri = :bacSiDieuTri where id = :id", nativeQuery = true)
    void updateBenhAn(@Param("ngayNhapVien") String ngayNhapVien, @Param("ngayRaVien") String ngayRaVien, @Param("lyDoNhapVien") String lyDoNhapVien, @Param("phuongPhapDieuTri") String phuongPhapDieuTri, @Param("bacSiDieuTri") String bacSiDieuTri, @Param("id") Integer id);
}
