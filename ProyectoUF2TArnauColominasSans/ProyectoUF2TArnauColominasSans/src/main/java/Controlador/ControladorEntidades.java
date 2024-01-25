/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Alimento;
import java.util.Scanner;

/**
 *
 * @author st2021061
 */
public class ControladorEntidades {

public static void nuevoAlimento(Alimento[] listaAlimentos) {
    Scanner sc = new Scanner(System.in);

    // Pregunta sobre el tipo de alimento
    System.out.println("¿Qué tipo de alimento quieres añadir?");
    System.out.println("1. Carne");
    System.out.println("2. Pescado");
    System.out.println("3. Vegetal");
    int tipo = sc.nextInt();
    sc.nextLine(); // Limpiar el buffer del scanner

    String strTipo = "";
    // Establecer el tipo de alimento
    switch (tipo) {
        case 1:
            strTipo = "Carne";
            break;
        case 2:
            strTipo = "Pescado";
            break;
        case 3:
            strTipo = "Vegetal";
            break;
        default:
            System.out.println("Tipo de alimento no válido.");
            return;
    }
    // Preguntas adicionales dependiendo del tipo de alimento
    System.out.println("¿Nombre del producto?");
    String nombreProducto = sc.nextLine();

    System.out.println("¿Peso del producto?");
    double pesoProducto = sc.nextDouble();
    sc.nextLine(); // Limpiar el buffer del scanner

    System.out.println("¿Cantidad del producto?");
    int cantidadProducto = sc.nextInt();
    sc.nextLine(); // Limpiar el buffer del scanner

    System.out.println("¿Marca del producto?");
    String marcaProducto = sc.nextLine();

    System.out.println("¿Distribuido?");
    String distribuido = sc.nextLine();

    System.out.println("¿Descripción?");
    String descripcion = sc.nextLine();

    System.out.println("¿Precio?");
    int precio = sc.nextInt();
    sc.nextLine(); // Limpiar el buffer del scanner

    System.out.println("¿Caducado?");
    boolean caducado = sc.nextBoolean();
    sc.nextLine(); // Limpiar el buffer del scanner

    // Crear instancia de Alimento y agregarla al array
    Alimento nuevoAlimento = new Alimento(nombreProducto, Alimento.contEntidades, pesoProducto, precio, marcaProducto, distribuido, strTipo, cantidadProducto, descripcion, 0, 0, caducado);

    // Resto de la lógica
     listaAlimentos[Alimento.contEntidades] = nuevoAlimento;
    nuevoAlimento.intCont();
    
    System.out.println("¡Tu producto se ha creado correctamente!\n");
}


    public static void buscarAlimento(Alimento[] listaAlimentos) {

        
    }

    public static void modificarAlimento(Alimento[] listaAlimentos) {

        
    }

    public static void borrarEntidad(Alimento[] listaAlimentos) {
        
    }

}
