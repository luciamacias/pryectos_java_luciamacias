package lab.bloque1;

import lab.bloque1.*;

public class TestFecha {

   public static void main(String[] args) {
       // Prueba del método of(año, mes, dia)
       Fecha fecha1 = Fecha.of(2023, 10, 6);
       System.out.println("Fecha 1: " + fecha1);

       // Prueba del método parse(cadenaFecha)
       Fecha fecha2 = Fecha.parse("2023-09-20");
       System.out.println("Fecha 2: " + fecha2);

       // Prueba del método nombreMes
       String nombreMes = fecha1.nombreMes();
       System.out.println("Nombre del mes de la Fecha 1: " + nombreMes);

       // Prueba del método diaSemana
       String diaSemana = fecha1.diaSemana();
       System.out.println("Dia de la semana de la Fecha 1: " + diaSemana);

       // Prueba del método sumarDias
       Fecha fecha3 = fecha1.sumarDias(5);
       System.out.println("Fecha 3 (sumando 5 dias a la Fecha 1): " + fecha3);

       // Prueba del método restarDias
       Fecha fecha4 = fecha1.restarDias(3);
       System.out.println("Fecha 4 (restando 3 dias a la Fecha 1): " + fecha4);

       // Prueba del método diferenciaEnDias
       int diferencia = fecha1.diferenciaEnDias(fecha2);
       System.out.println("Diferencia en dias entre Fecha 1 y Fecha 2: " + diferencia);

       // Prueba del método esAñoBisiesto
       boolean esBisiesto = Fecha.esAñoBisiesto(2024);
       System.out.println("2024 es bisiesto: " + esBisiesto);
   }
}