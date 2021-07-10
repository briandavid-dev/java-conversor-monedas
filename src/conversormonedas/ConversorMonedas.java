
package conversormonedas;

import java.util.Scanner;

public class ConversorMonedas {

    public static void main(String[] args) {
        NOTACION_SALIR:
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("");
            System.out.println("Escribe el monto a convertir: ");
            double cantidad = scan.nextInt();
            
            System.out.println("");
            System.out.println("1. Quiero convertir "+cantidad+" peso(s) chileno a USD");
            System.out.println("2. Quiero convertir "+cantidad+" peso(s) colombianos a USD");
            System.out.println("3. Quiero convertir "+cantidad+" sol(es) peruanos a USD");
            System.out.println("4. Salir");
            System.out.println("Escoja una opción: ");
            
            char option = scan.next().charAt(0);
            
            switch(option) {
                case '1':
                    convertir(cantidad, "CHILE");
                    break;
                case '2':
                    convertir(cantidad, "COLOMBIA");
                    break;
                case '3':
                    convertir(cantidad, "PERU");
                    break;
                case '4':
                    System.out.println("Chao");
                    break NOTACION_SALIR;
                default: 
                    System.out.println("No existe opción");
                    break;
            }
        }
    }
    
    static void convertir(double cantidadMoneda, String moneda){
        double valorDolar = 0;
        if(moneda.equals("CHILE")) {
            valorDolar = 749;
        } else if(moneda.equals("COLOMBIA")) {
            valorDolar = 3787.60;
        } else if(moneda.equals("PERU")) {
            valorDolar = 3.96;
        } 
        
        if(valorDolar > 0){
            double dolares = cantidadMoneda / valorDolar;
            dolares = (double)Math.round(dolares * 100d) / 100;
            System.out.println(dolares);
        } else {
            System.out.println("Moneda no encontrada");
            
        }
    }
}
