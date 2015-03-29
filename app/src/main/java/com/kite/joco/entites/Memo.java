package com.kite.joco.entites;

import com.orm.SugarRecord;

/**
 * Created by Joco on 2015.03.23..
 */
public class Memo extends SugarRecord<Memo> {

    public String Tema;
    public String leiras;

    public Memo() {
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String tema) {
        Tema = tema;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }
}
