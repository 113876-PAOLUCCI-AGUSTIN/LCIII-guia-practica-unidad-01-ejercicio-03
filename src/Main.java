/*
 * LC_III-guía-práctica-unidad-01-ejercicio-03
 * Hacer un programa que ingrese los datos de una factura en la cual haya tres
 * artículos vendidos. De cada artículo ingresar el precio unitario y la cantidad.
 * Finalmente, imprimir el total de la factura.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double precioUnitario;
        Integer cantidad;
        Double subTotal;
        Double total;
        Double totalIvaInc;

        System.out.println("Ingrese precio unitario y cantidad, en ese orden.");
        Scanner teclado = new Scanner((System.in));
        total = 0.0;

        for(int i = 0; i < 3; i++){
            precioUnitario = teclado.nextDouble();
            cantidad = teclado.nextInt();
            subTotal = precioUnitario*cantidad;
            //System.out.println("SubTotal articulo: " +subTotal);
            total = total + subTotal;
        }
    }
}