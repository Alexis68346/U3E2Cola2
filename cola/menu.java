package cola;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);

      Cola lista = new Cola();  
     int opc, opc2=0;
       do{ 
         System.out.println("\nMenu"
                + "\nElija una opcion "
                + "\n1.- Insertar "
                + "\n2.- Mostrar lista "
                + "\n3.- Eliminar elementos "
                + "\n4.- Salir ");
         
        opc=leer.nextInt();
        switch(opc){
             case 1:
            Scanner Leer = new Scanner(System.in);
            System.out.println("inserte un numero: ");
            String dato=Leer.nextLine();
            lista.insertar(dato);
            break;
            case 2:
                lista.mostrar();
                break;
            case 3:
                lista.eliminar();
                break;
            case 4: 
                System.exit(0);
            break;
            default:System.out.println("Intente con un numero del menu: ");
        }
           System.out.println("Ingrese 1 para continuar"
                   + "\nIngrese 2 para salir");
       opc2=leer.nextInt();
       }
       while(opc2!=2); 
    }
}
    
