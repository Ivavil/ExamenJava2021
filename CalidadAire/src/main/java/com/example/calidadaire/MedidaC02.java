package com.example.calidadaire;

public class MedidaC02 {
    private long t_mili;
    private int conc_elec;
    private int conc_telem;
    private int conc_a9;

    public MedidaC02(long t_mili, int conc_elec, int conc_telem, int conc_a9) {
        this.t_mili = t_mili;
        this.conc_elec = conc_elec;
        this.conc_telem = conc_telem;
        this.conc_a9 = conc_a9;
    }

    public long getT_mili() {
        return t_mili;
    }

    public void setT_mili(long t_mili) {
        this.t_mili = t_mili;
    }

    public int getConc_elec() {
        return conc_elec;
    }

    public void setConc_elec(int conc_elec) {
        this.conc_elec = conc_elec;
    }

    public int getConc_telem() {
        return conc_telem;
    }

    public void setConc_telem(int conc_telem) {
        this.conc_telem = conc_telem;
    }

    public int getConc_a9() {
        return conc_a9;
    }

    public void setConc_a9(int conc_a9) {
        this.conc_a9 = conc_a9;
    }
}
