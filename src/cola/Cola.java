/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cola;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Cola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        
        int reg = 1;
        int elemento = 0; 
        
        Scanner n = new Scanner(System.in);
        ColaLineal k = new ColaLineal();
        
        do{
        System.out.println("escoga una de las obciones");
        System.out.println(" 1- ingresar");
        System.out.println(" 2- retirar");
        System.out.println(" 3- mostrar");
        System.out.println(" 0- salir");
        
        reg = n.nextInt();
        
           if(reg == 1){
           
             System.out.print("inserte el dato: ");  
             k.insertar(elemento = n.nextInt());
             
           }else if(reg == 2){
               k.quitar();
               
           }else if(reg == 3){
              
               k.mostrar();
           }else if(reg == 0){
              
               System.exit(0);
           }else{
               System.out.println("debes digitar alguna de las obciones");
           }
            
        
       
        
        }while(reg  !=0 );
        
    } 
    }
    
