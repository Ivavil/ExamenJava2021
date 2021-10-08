package com.example.calidadaire;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CalidadAire {
    // Hora local Gandia Epoch del 7.10.2021 de las 8:00 am a las 17:00 pm
    static long FECHA[]={1633586400000L, 1633590000000L, 1633593600000L, 1633597200000L, 1633600800000L, 1633604400000L, 1633608000000L,1633611600000L, 1633615200000L, 1633618800000L};

    // Mediciones de la concentración de CO2 (calidad del aire en partículas por millón, ppm) en las aulas
    static int LELECTRONICA[] = {500, 650, 700, 850, 875, 600, 550, 650, 850, 600};
    static int LTELEMATICA[] = {450, 500, 675, 875, 850, 700, 750, 880, 700, 600};
    static int AULA9[] = {450, 500, 550, 650, 700, 800, 750, 600, 650, 600};

    public static void main(String args[]) {

        List<MedidaC02> lista_medidas = new ArrayList<MedidaC02>();

        for (int i = 0; i < FECHA.length; i++){
            lista_medidas.add(new MedidaC02(FECHA[i], LELECTRONICA[i], LTELEMATICA[i], AULA9[i]));
        }

        Set<Integer> conjunto_medidas = new HashSet<Integer>();

        for(int i = 0; i < lista_medidas.size(); i++){
            conjunto_medidas.add(lista_medidas.get(i).getConc_a9());
            conjunto_medidas.add(lista_medidas.get(i).getConc_elec());
            conjunto_medidas.add(lista_medidas.get(i).getConc_telem());
        }

        System.out.println("Las medidas almacenados son " + conjunto_medidas + " y la cantidad es de " + lista_medidas.size());
    }
}