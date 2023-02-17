package com.thi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BenhNhan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maBenhNhan;
    private String tenBenhNhan;

    @OneToMany(mappedBy = "benhNhan")
    @JsonBackReference
    Set<BenhAn> benhAns;

    public BenhNhan() {
    }

    public int getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(int maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public Set<BenhAn> getBenhAns() {
        return benhAns;
    }

    public void setBenhAns(Set<BenhAn> benhAns) {
        this.benhAns = benhAns;
    }
}
