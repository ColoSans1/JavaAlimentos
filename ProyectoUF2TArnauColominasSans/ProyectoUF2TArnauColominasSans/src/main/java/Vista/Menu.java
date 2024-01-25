/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import static Controlador.ControladorEntidades.nuevoAlimento;
import static Controlador.ControladorEntidades.borrarEntidad;
import static Controlador.ControladorEntidades.buscarAlimento;
import static Controlador.ControladorEntidades.modificarAlimento;

import Modelo.Alimento;
import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author st2021061
 */
public class Menu {
    
    public static void packBienvenida() {
        System.out.println("---------------------");
        System.out.println("Bienvenido a StuComidas");
        System.out.println("---------------------\n");
    }
    
        public static void menu() {
        Scanner sc = new Scanner(System.in);
        Alimento[] listaAlimentos = new Alimento[100]; // Creación de Array [100 Alimentos máximo]

        // Lógica del menú
        int opcion = 0;
        do {
            System.out.println("[1]. Crear nuevo Alimento");
            System.out.println("[2]. Buscar alimento Existente");
            System.out.println("[3]. Modificar Alimento");
            System.out.println("[4]. Borrar entidad");
            System.out.println("[5]. Salir\n");
            System.out.println("Elige una de las siguientes opciones:");

            try {
                opcion = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer del scanner

                // Lógica para cada opción
                switch (opcion) {
                    case 1:
                        nuevoAlimento(listaAlimentos);
                        break;
                    case 2:
                        buscarAlimento(listaAlimentos);
                        break;
                    case 3:
                        modificarAlimento(listaAlimentos);
                        break;
                    case 4:
                        borrarEntidad(listaAlimentos);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error al leer la opción. Inténtalo de nuevo.\n");
                sc.nextLine(); // Limpiar el buffer del scanner
            }
        } while (opcion != 5);
    }
}

