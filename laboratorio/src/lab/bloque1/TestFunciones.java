package lab.bloque1;

import lab.bloque1.*;
import java.util.List;
import java.util.ArrayList;

public class TestFunciones {

   public static void main(String[] args) {
       testEsPrimo();
       testNumeroCombinatorio();
       testCalculoNumeroS();
       testDiferencias();
       testCadenaMasLarga();
   }

   // TEST EJERCICIO 1
   public static void testEsPrimo() {
       int numero = 16; // NUMERO A PROBAR PRIMO
       boolean resultado = Funciones.esPrimo(numero);
       if (resultado) {
           System.out.println("El numero " + numero + " es primo");
       } else {
           System.out.println("El numero " + numero + " no es primo");
       }
   }

// TEST EJERCICIO 2
   public static void testNumeroCombinatorio() {
       int n = 1; // VALOR N
       int k = 0; // VALOR K
       try {
           double resultado = Funciones.numeroCombinatorio(n, k);
           System.out.println("El numero combinatorio (" + n + ", " + k + ") es: " + resultado);
       } catch (IllegalArgumentException e) {
           System.out.println("Error: " + e.getMessage());
       }
   }

   // TEST EJERCICIO 3
   public static void testCalculoNumeroS() {
       int n = 5; // VALOR N
       int k = 7; // VALOR K
       try {
           double resultado = Funciones.calculoNumeroS(n, k);
           System.out.println("El resultado del calculo de S con n=" + n + " y k=" + k + " es: " + resultado);
       } catch (IllegalArgumentException e) {
           System.out.println("Error: " + e.getMessage());
       }
   }


   // TEST EJERCICIO 4
   public static void testDiferencias() {
       List<Integer> numeros = new ArrayList<>();
       numeros.add(5); // NUMERO AQUI
       numeros.add(11); // NUMERO AQUI
       numeros.add(17); // NUMERO AQUI
       List<Integer> diferencias = Funciones.diferencias(numeros);
       System.out.println("Diferencias entre numeros consecutivos: " + diferencias);
   }

   // TEST EJERCICIO 5
   public static void testCadenaMasLarga() {
       List<String> caracteres = new ArrayList<>();
       caracteres.add("toalla"); // CADENA AQUI
       caracteres.add("silla"); // CADENA AQUI
       caracteres.add("pelota de futbol"); // CADENA AQUI
       String masLarga = Funciones.cadenaMasLarga(caracteres);
       System.out.println("La cadena mas larga es: " + masLarga);
   }


//test defensa ejercicio B 

   public static Double NumeroCombinatorioDefensa(Integer n, Integer k) {
	    Preconditions.checkArgument(n >= k, String.format("El valor n (%d) debe ser mayor que k (%d)", n, k));
	    Double denominador = Funciones.factorial(n);
	    Double divisor = Funciones.factorial(k) * (Funciones.factorial(k + 1));
	    return denominador / divisor;
	}

	public static void main(String[] args) {
	    Integer n = 7;
	    Integer k = 2;
	    Double resultado = NumeroCombinatorioDefensa(n, (k+1));
	    System.out.println("Número combinatorio de " + n + " sobre " + (k +1)+ ": " + resultado);}
	

//test defensa ejercico C 

public static Double CalculoNumerosDefensa(Integer n, Integer k) {
    Preconditions.checkArgument(n>=k,String.format("El valor n (%d) debe ser mayor o igual que k (%d)",n,k));
    Double fueraSumatorio = Funciones.factorial(k)/(Funciones.factorial(k+2));
    Double sumatorio =0. ;
    for(Integer i=0;i<=k;i++) {
            Double primero = Math.pow(-1, i);
            Double segundo = Funciones.numeroCombinatorio(k, i);
            Double tercero = Math.pow((k-i), n);
            sumatorio += primero * segundo * tercero;
            }
    return fueraSumatorio*sumatorio;}

public static void CalculoNumerosDefensa() {
    int n = 8; 
    int k = 3; 
    try {
        double resultado = Funciones.calculoNumeroS(n, k);
        System.out.println("El resultado del calculo de S con n=" + n + " y k=" + k + " es: " + resultado);
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());}

    
  //test defensa ejercicio A
    public class ProductoNK {
        public static void main(String[] args) {
            int n = 10; 
            int k = 5;  

            int producto = 1;
            for (int i = 0; i < k - 1; i++) {
                producto *= (n - i);
            }

            System.out.println("El producto para i=0 hasta k-2 es: " + producto);}
        }
} 
}        
    
    

