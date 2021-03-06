/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Raul
 */
public class Utilidades {

    public static ArrayList<String> getMeses() {
        ArrayList<String> meses = new ArrayList<String>();
        for (int i = 0; i <= 11; i++) {
            meses.add(String.valueOf(i + 1));
        }
        return meses;
    }

    public static ArrayList<String> getDias() {
        ArrayList<String> dias = new ArrayList<String>();
        for (int i = 0; i <= 30; i++) {
            dias.add(String.valueOf(i + 1));
        }
        return dias;
    }

    public static String getHoroscopo(int dia, int mes) {
        String signo = "";
        switch (mes) {
            case 1:
                if (dia >= 20) {
                    signo = "Acuario";
                } else {
                    signo = "Capricornio";
                }
                break;
            case 2:
                if (dia >= 20) {
                    signo = "Piscis";
                } else {
                    signo = "Acuario";
                }
                break;
            case 3:
                if (dia >= 20) {
                    signo = "Aries";
                } else {
                    signo = "Piscis";
                }
                break;
            case 4:
                if (dia >= 20) {
                    signo = "Tauro";
                } else {
                    signo = "Aries";
                }
                break;
            case 5:
                if (dia >= 20) {
                    signo = "Géminis";
                } else {
                    signo = "Tauro";
                }
                break;
            case 6:
                if (dia >= 20) {
                    signo = "Cancer";
                } else {
                    signo = "Géminis";
                }
                break;
            case 7:
                if (dia >= 20) {
                    signo = "Leo";
                } else {
                    signo = "Cancer";
                }
                break;
            case 8:
                if (dia >= 20) {
                    signo = "Virgo";
                } else {
                    signo = "Leo";
                }
                break;
            case 9:
                if (dia >= 20) {
                    signo = "Libra";
                } else {
                    signo = "Virgo";
                }
                break;
            case 10:
                if (dia >= 20) {
                    signo = "Escorpio";
                } else {
                    signo = "Libra";
                }
                break;
            case 11:
                if (dia >= 20) {
                    signo = "Sagitario";
                } else {
                    signo = "Escorpio";
                }
                break;
            case 12:
                if (dia >= 20) {
                    signo = "Capricornio";
                } else {
                    signo = "Escorpio";
                }
                break;
        }
        return signo;
    }
}
