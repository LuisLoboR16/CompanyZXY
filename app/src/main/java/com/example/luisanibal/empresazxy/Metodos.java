package com.example.luisanibal.empresazxy;

public class Metodos {
    public static double ZapatillaHombre(String marca, int cantidad) {
        double precio=0;

        if (marca.equalsIgnoreCase("nike")) {
            precio = 120000;
        }
        if (marca.equalsIgnoreCase("adidas")) {
            precio = 140000;
        }
        if (marca.equalsIgnoreCase("puma")) {
            precio = 130000;
        }
       return cantidad * precio;
    }


    public static double ClasicoHombre(String marca, int cantidad) {
        double precio=0;

        if (marca.equalsIgnoreCase("nike")) {
            precio = 50000;
        }
        if (marca.equalsIgnoreCase("adidas")) {
            precio = 80000;
        }
        if (marca.equalsIgnoreCase("puma")) {
            precio = 100000;
        }
        return cantidad * precio;
    }

    public static double ZapatillaMujer(String marca, int cantidad) {
        double precio=0;

        if (marca.equalsIgnoreCase("nike")) {
            precio = 100000;
        }
        if (marca.equalsIgnoreCase("adidas")) {
            precio = 130000;
        }
        if (marca.equalsIgnoreCase("puma")) {
            precio = 110000;
        }
        return cantidad * precio;
    }


    public static double ClasicoMujer(String marca, int cantidad) {
        double precio=0;

        if (marca.equalsIgnoreCase("nike")) {
            precio = 60000;
        }
        if (marca.equalsIgnoreCase("adidas")) {
            precio = 70000;
        }
        if (marca.equalsIgnoreCase("puma")) {
            precio = 120000;
        }
        return cantidad * precio;
    }

}
