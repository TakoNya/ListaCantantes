package listacantantesapp;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCantantesApp {

    public static void main(String[] args) {
        ArrayList<Cantante> cantantes = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Cantidad de cantantes: ");
        int cantidad = teclado.nextInt();

        for (int i = 1; i < cantidad; i++) {
            System.out.print("Nombre del cantante nº " + i + ": ");
            String nombre = teclado.nextLine();
            Cantante unCantante = new Cantante();
            unCantante.setNombre(nombre);
            cantantes.add(unCantante);
            System.out.print("Disco más vendido del cantante nº " + i + ": ");
            String disco = teclado.nextLine();
            unCantante.setDiscoMasVendido(disco);
            cantantes.add(unCantante);

        }
        for (Cantante cant : cantantes)
            System.out.println(cant);
            
        

    }
}