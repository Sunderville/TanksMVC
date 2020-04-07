package com.sunderville.tanksmvc.models;

import javax.persistence.Entity;

public class DetailedInfo {

    private String diameter;
    private String ring1;
    private String ring2;
    private String ring3;
    private String ring4;
    private String ring5;
    private String ring6;
    private String ring7;
    private String ring8;
    private String ring9;
    private String ring10;
    private String ring11;
    private String ring12;
    private String bottomCenter;
    private String bottomRim;
    private String roof;
    private String heater;
    private String insulation;
    private String otherWeight1name;
    private String otherWeight1;
    private String otherWeight2name;
    private String otherWeight2;
    private String st3;
    private String s09g2s;
    private String s12h18n10t;

    public DetailedInfo() {
    }

    public DetailedInfo(String diameter, String ring1, String ring2, String ring3, String ring4, String ring5, String ring6,
                        String ring7, String ring8, String ring9, String ring10, String ring11, String ring12,
                        String bottomCenter, String bottomRim, String roof, String heater, String insulation,
                        String otherWeight1name, String otherWeight1, String otherWeight2name, String otherWeight2,
                        String st3, String s09g2s, String s12h18n10t) {
        this.diameter = diameter;
        this.ring1 = ring1;
        this.ring2 = ring2;
        this.ring3 = ring3;
        this.ring4 = ring4;
        this.ring5 = ring5;
        this.ring6 = ring6;
        this.ring7 = ring7;
        this.ring8 = ring8;
        this.ring9 = ring9;
        this.ring10 = ring10;
        this.ring11 = ring11;
        this.ring12 = ring12;
        this.bottomCenter = bottomCenter;
        this.bottomRim = bottomRim;
        this.roof = roof;
        this.heater = heater;
        this.insulation = insulation;
        this.otherWeight1name = otherWeight1name;
        this.otherWeight1 = otherWeight1;
        this.otherWeight2name = otherWeight2name;
        this.otherWeight2 = otherWeight2;
        this.st3 = st3;
        this.s09g2s = s09g2s;
        this.s12h18n10t = s12h18n10t;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getRing1() {
        return ring1;
    }

    public void setRing1(String ring1) {
        this.ring1 = ring1;
    }

    public String getRing2() {
        return ring2;
    }

    public void setRing2(String ring2) {
        this.ring2 = ring2;
    }

    public String getRing3() {
        return ring3;
    }

    public void setRing3(String ring3) {
        this.ring3 = ring3;
    }

    public String getRing4() {
        return ring4;
    }

    public void setRing4(String ring4) {
        this.ring4 = ring4;
    }

    public String getRing5() {
        return ring5;
    }

    public void setRing5(String ring5) {
        this.ring5 = ring5;
    }

    public String getRing6() {
        return ring6;
    }

    public void setRing6(String ring6) {
        this.ring6 = ring6;
    }

    public String getRing7() {
        return ring7;
    }

    public void setRing7(String ring7) {
        this.ring7 = ring7;
    }

    public String getRing8() {
        return ring8;
    }

    public void setRing8(String ring8) {
        this.ring8 = ring8;
    }

    public String getRing9() {
        return ring9;
    }

    public void setRing9(String ring9) {
        this.ring9 = ring9;
    }

    public String getRing10() {
        return ring10;
    }

    public void setRing10(String ring10) {
        this.ring10 = ring10;
    }

    public String getRing11() {
        return ring11;
    }

    public void setRing11(String ring11) {
        this.ring11 = ring11;
    }

    public String getRing12() {
        return ring12;
    }

    public void setRing12(String ring12) {
        this.ring12 = ring12;
    }

    public String getBottomCenter() {
        return bottomCenter;
    }

    public void setBottomCenter(String bottomCenter) {
        this.bottomCenter = bottomCenter;
    }

    public String getBottomRim() {
        return bottomRim;
    }

    public void setBottomRim(String bottomRim) {
        this.bottomRim = bottomRim;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getHeater() {
        return heater;
    }

    public void setHeater(String heater) {
        this.heater = heater;
    }

    public String getInsulation() {
        return insulation;
    }

    public void setInsulation(String insulation) {
        this.insulation = insulation;
    }

    public String getOtherWeight1name() {
        return otherWeight1name;
    }

    public void setOtherWeight1name(String otherWeight1name) {
        this.otherWeight1name = otherWeight1name;
    }

    public String getOtherWeight1() {
        return otherWeight1;
    }

    public void setOtherWeight1(String otherWeight1) {
        this.otherWeight1 = otherWeight1;
    }

    public String getOtherWeight2name() {
        return otherWeight2name;
    }

    public void setOtherWeight2name(String otherWeight2name) {
        this.otherWeight2name = otherWeight2name;
    }

    public String getOtherWeight2() {
        return otherWeight2;
    }

    public void setOtherWeight2(String otherWeight2) {
        this.otherWeight2 = otherWeight2;
    }

    public String getSt3() {
        return st3;
    }

    public void setSt3(String st3) {
        this.st3 = st3;
    }

    public String getS09g2s() {
        return s09g2s;
    }

    public void setS09g2s(String s09g2s) {
        this.s09g2s = s09g2s;
    }

    public String getS12h18n10t() {
        return s12h18n10t;
    }

    public void setS12h18n10t(String s12h18n10t) {
        this.s12h18n10t = s12h18n10t;
    }
}
