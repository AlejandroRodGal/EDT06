/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.foc.fp.ed.tarea6;
import java.lang.System.Logger;
/**
 * Esta clase contiene métodos para aplicar descuentos a productos.
 * 
 * @author alesg
 */
public class Tarea6EDClase {
    
    private static final Logger logger = System.getLogger(Tarea6EDClase.class.getName());
    private static final int UMBRAL_DESCUENTO = 3;
    
    /**
     * Aplica descuentos al precio de un producto en función del número de productos.
     * El total a pagar después de aplicar los descuentos es mostrado en el registro de log.
     * 
     * @param precioProducto el precio del producto
     * @param numProductos el número de productos
     */
    public void aplicarDescuento(double precioProducto, int numProductos){     
        
        /**
        * Esta es la cantidad total que se debe pagar después de aplicar los descuentos.
        * El valor es calculado dependiendo del número de productos y su precio.
        */
        double total;

        if(aplicarDescuento(numProductos))
            precioProducto-=5;
                if (numProductos!=0){
                total = precioProducto*0.8;
                logger.log(System.Logger.Level.INFO, "El total a pagar es: " + total);
                logger.log(System.Logger.Level.INFO, "Enviado");
            }else {
                total = precioProducto*0.95;
                logger.log(System.Logger.Level.INFO, "El total a pagar es: " + total);
                logger.log(System.Logger.Level.INFO, "Enviado");
            }   

        }
    
    /**
     * Verifica si se debe aplicar un descuento basado en el número de productos.
     * Se aplica descuento si el número de productos es mayor que el umbral de descuento.
     * 
     * @param numProductos el número de productos
     * @return true si se debe aplicar descuento, false en caso contrario
     */
    private static boolean aplicarDescuento(int numProductos) {
        return numProductos > UMBRAL_DESCUENTO;
    }
}
