package cola;

import java.util.Scanner;

public class Cola {
    Scanner leer=new Scanner(System.in);
    int cima=-1; 
    String cola [];
   
 public Cola() {
        cola=new String[5];
    }
 
        public void insertar(String elemento){
        if(cima >=cola.length -1){
        System.out.println("No puede insertar mas datos, la cola esta llena. ");
        }
        else{
        cola[++cima]=elemento;
        System.out.println("Se inserto el elemento");}
    }
      
     public void eliminar(){
       String elimina;
        if(cima==-1){
            System.out.println("cola vacia");
        }
        else{
        elimina=cola[cima];
        cima--;
         System.out.println("Se elimino el elemento");
        }
	} 
     
     public void mostrar(){
         if(cima==-1){
             System.out.println("Cola vacia");
         }
        else{
        for(int i=0;i<=cima;i++) {
            System.out.println(cola[i]);
        }

   
}
     }
}
