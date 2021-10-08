package com.example.calidadaire;

public class MedidaC02 {
    private int t_mili;
    private double conc_elec;
    private double conc_telem;
    private double conc_a9;

    public MedidaC02(int t_mili, double conc_elec, double conc_telem, double conc_a9) {
        this.t_mili = t_mili;
        this.conc_elec = conc_elec;
        this.conc_telem = conc_telem;
        this.conc_a9 = conc_a9;
    }

    public int getT_mili() {
        return t_mili;
    }

    public void setT_mili(int t_mili) {
        this.t_mili = t_mili;
    }

    public double getConc_elec() {
        return conc_elec;
    }

    public void setConc_elec(double conc_elec) {
        this.conc_elec = conc_elec;
    }

    public double getConc_telem() {
        return conc_telem;
    }

    public void setConc_telem(double conc_telem) {
        this.conc_telem = conc_telem;
    }

    public double getConc_a9() {
        return conc_a9;
    }

    public void setConc_a9(double conc_a9) {
        this.conc_a9 = conc_a9;
    }
}
