package com.core.presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ejercicio_Seis {
    public static void main(String[] args) {

        Period edadP = Period.between(LocalDate.of(1992,8,30),LocalDate.now());
        System.out.println("Edad"+edadP.getYears());

        System.out.println(LocalDate.now());

        System.out.println(LocalDate.of(2023,10,9).plusMonths(2));




    }
}
