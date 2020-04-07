package com.sunderville.tanksmvc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class TankEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime date;
    private String company;
    private String tankType;
//    private DetailedInfo detailedInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTankType() {
        return tankType;
    }

    public void setTankType(String tankType) {
        this.tankType = tankType;
    }

//    public DetailedInfo getDetailedInfo() {
//        return detailedInfo;
//    }
//
//    public void setDetailedInfo(DetailedInfo detailedInfo) {
//        this.detailedInfo = detailedInfo;
//    }

    public TankEntry() {
    }

    public TankEntry(LocalDateTime date, String company, String tankType/*, DetailedInfo detailedInfo*/) {
        this.date = date;
        this.company = company;
        this.tankType = tankType;
//        this.detailedInfo = detailedInfo;
    }
}
