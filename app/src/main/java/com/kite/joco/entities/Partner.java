package com.kite.joco.entities;

import com.orm.SugarRecord;

/**
 * Created by Joco on 2015.03.29..
 */
public class Partner extends SugarRecord<Partner> {

    String pskod;
    String maganMobilTelefonszam,cegMobilTelefonszam,maganVezetekesTelefonszam,cegVezetekesTelefonszam;
    String kapcsolatnev;
    String cegnev;
    String falu;
    String irsz;
    String cim;

    public Partner() {

    }

    public String getPskod() {
        return pskod;
    }

    public void setPskod(String pskod) {
        this.pskod = pskod;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getMaganMobilTelefonszam() {
        return maganMobilTelefonszam;
    }

    public void setMaganMobilTelefonszam(String maganMobilTelefonszam) {
        this.maganMobilTelefonszam = maganMobilTelefonszam;
    }

    public String getCegMobilTelefonszam() {
        return cegMobilTelefonszam;
    }

    public void setCegMobilTelefonszam(String cegMobilTelefonszam) {
        this.cegMobilTelefonszam = cegMobilTelefonszam;
    }

    public String getMaganVezetekesTelefonszam() {
        return maganVezetekesTelefonszam;
    }

    public void setMaganVezetekesTelefonszam(String maganVezetekesTelefonszam) {
        this.maganVezetekesTelefonszam = maganVezetekesTelefonszam;
    }

    public String getCegVezetekesTelefonszam() {
        return cegVezetekesTelefonszam;
    }

    public void setCegVezetekesTelefonszam(String cegVezetekesTelefonszam) {
        this.cegVezetekesTelefonszam = cegVezetekesTelefonszam;
    }

    public String getKapcsolatnev() {
        return kapcsolatnev;
    }

    public void setKapcsolatnev(String kapcsolatnev) {
        this.kapcsolatnev = kapcsolatnev;
    }

    public String getCegnev() {
        return cegnev;
    }

    public void setCegnev(String cegnev) {
        this.cegnev = cegnev;
    }

    public String getFalu() {
        return falu;
    }

    public void setFalu(String falu) {
        this.falu = falu;
    }

    public String getIrsz() {
        return irsz;
    }

    public void setIrsz(String irsz) {
        this.irsz = irsz;
    }
}
