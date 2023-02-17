package com.thi.controller;

import com.thi.model.BenhAn;
import com.thi.service.IBenhAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("")
public class BenhAnRestController {
    @Autowired
    private IBenhAnService iBenhAnService;

    @GetMapping("/BenhAn")
    public ResponseEntity<List<BenhAn>> getAll() {
        List<BenhAn> benhAnList = iBenhAnService.getAll();
        if (benhAnList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(benhAnList, HttpStatus.OK);
    }
    @DeleteMapping("/BenhAn/{id}")
    private ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        try {
            iBenhAnService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/detail/{id}")
    private ResponseEntity<BenhAn> detail(@PathVariable("id") Integer id) {
        BenhAn benhAn = iBenhAnService.findBenhAn(id);
        return new ResponseEntity<>(benhAn, HttpStatus.OK);
    }

    @PutMapping("/update")
    private ResponseEntity<?> update(@RequestBody BenhAn benhAn) {
        iBenhAnService.updateBenhAn(benhAn.getNgayNhapVien(),benhAn.getNgayRaVien(),benhAn.getLyDoNhapVien() ,benhAn.getPhuongPhapDieuTri(),benhAn.getBacSiDieuTri(),benhAn.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
