package com.psiquelaboral.operadores.App;

public class App {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        //operadores
        //aritmeticos

        //- resta
        int resta =5-4;
        //+ suma
        int suma=5+7;
        // * multiplicaciones
        int mult= 5 * 6;
        //  / divición
        double div = 23.0/6.0;
        //  % modulo
        int mod= 5%2;

        //operadores relacionales
        // Igual a (==)
        boolean igual= 5==7;
        //Distinto de (!=)
        boolean distinto = 6!=7;
        //Menor que (<)
        boolean menorQue = 45<38;
        //Menor o igual que ... (<=)
        boolean menorOigualA= 45 <= 45;
        //Mayor que ... (>)
        boolean mayorQue= 45>67;
        //Mayor o igual que  .. (>=)
        boolean mayorOIgualA= 45>=453;

        //operadores logicos
        //AND (&&)
        45>-453 && 45<-45
                //Para que sea verdadero los dos tienen que ser true
        //con que eista un falso todo es falso.
                boolean and;
        and= true && true; //true
        and= true&&false;//false
        and= false && false;//false
        and= false && true;//false


        //OR (||)
        boolean or;
        or= true||true;//true
        or= true||false;//true
        or= false||false;//false
        or= false|| true;//true


        //Negacion (!)
        //Cambia el valor actual de un boolean
        boolean negacion;
        negacion= true;
        negacion= !negacion;//false
        negacion= !true;//false

        boolean resultado = ! (453 >67||6 != 7 &&
                System.out.println(resultado));
    }
}
