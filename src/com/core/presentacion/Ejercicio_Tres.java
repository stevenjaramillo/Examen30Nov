package com.core.presentacion;

public class Ejercicio_Tres {
    public static void main(String[] args) {


        int numero = 5;
        String nombreVehiculo = " ";

        switch (numero) {
            case 1:
                nombreVehiculo = "Microcoche";
                break;
            case 2:
                nombreVehiculo = "Automoviles compactos";
                break;
            case 3:
                nombreVehiculo = "Autoimoviles ultracompactos";
                break;
            case 4:
                nombreVehiculo = "Automovil familiar";
                break;
            case 5:
                nombreVehiculo = "Automovil de lujo";
                break;
            case 6:
                nombreVehiculo = "Automovil deportivo";
                break;
            case 7:
                nombreVehiculo = "Descapotable";
                break;
            case 8:
                nombreVehiculo = "Todoterreno";
                break;
            default:
                System.out.println( "El numero es erroneo");
                break;

        }
        System.out.println("El modelo " + numero + " es: " + nombreVehiculo );

    }

}
