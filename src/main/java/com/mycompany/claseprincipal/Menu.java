/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.claseprincipal;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Menu {
    Tiquete pasajero1=new Tiquete();
    Tiquete pasajero2=new Tiquete();
    
    public static void menu(){
        int opcion = 0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Almacenarinformacion del pasajero" + "\n2.Modificar informacion del pasajero" +"\n3.Visualizar informacion del pasajero\n4.Almacenar informacion de la placa\n5.Almacenar informacion del conductor\n0.Salir"));
        switch (opcion){
            case 1:{
                break;
            }
             case 2:{
                break;
            }
            case 3:{
                break;
            } 
            case 4:{
                break;
            } 
            case 5:{
                break;
            } 
        }
        
    }while (opcion != 0);
    
    }
    
    public void almacenarInformacion(){
     pasajero1.setFecha(JOptionPane.showInputDialog("Digite la fecha del tiquete que desea adquirir"));
     pasajero1.setNombrePasajero(JOptionPane.showInputDialog("Digite el nombre del pasajero"));   
     pasajero1.setNumeroVagon(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del vagon que desea digitar")));
     pasajero1.setNumeroAsiento(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del asiento que desea adquirir")));
     pasajero1.setEstadoAsiento('o');
     pasajero1.setNombredelConductor(JOptionPane.showInputDialog("Digite el nombre del conductor"));
     pasajero1.setNombredelaPlaca(JOptionPane.showInputDialog("Digite el nombre de la placa"));
  
    }//fin del metodo almacenar informacion
     public void modificarInformacion() {
         int opcionInfo = 0;
         do{
           opcionInfo = Integer.parseInt(JOptionPane.showInputDialog("1.Modificar fecha"+"\n2.Modificar nombre\n3.Modificar numero del vagon\n4.Modificar numero de asiento"+"\n5.Modificar estado del asiento\n6.Modificar nombre del conductor\n7.Modificar nombre de la placa\n0.Salir"));
             switch (opcionInfo) {
                 case 1:{
                    pasajero1.setFecha(JOptionPane.showInputDialog(""+"Digite la fecha del tiquete que desea adquirir"));break;
                 }
                 case 2:{
                    pasajero1.setNombrePasajero(JOptionPane.showInputDialog(""+"Digite el nombre del pasajero"));break;
                 }
                 
                 case 3:{
                    pasajero1.setNumeroVagon(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del vagon que desea adquirir")));break;
                 }
                 case 4:{
                    pasajero1.setNumeroAsiento(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del asiento que desea adquirir")));break;
                 }
                 case 5:{
                    if(pasajero1.getEstadoAsiento()=='o'){
                        
                    pasajero1.setEstadoAsiento('D');}break;
                 }
                 case 6:{
                    pasajero1.setNombredelConductor(JOptionPane.showInputDialog(""+"Digite el nombre del conductor"));break;
                 }
                 case 7:{
                    pasajero1.setNombredelaPlaca(JOptionPane.showInputDialog(""+"Digite el nombre de la placa"));break;
                 }
             }
         }while (opcionInfo != 0);
     }//fin del metodo modificar informacion
     
     public void reporteInfoPasajero() {
         JOptionPane.showMessageDialog(null, "********************TIQUETE DE COMPRA*************************\n\n\n"+ "Fecha:"+pasajero1.getFecha()+"\nNombre del pasajero:"+pasajero1.getNombrePasajero()+"\nNombre del asiento:"+pasajero1.getNumeroAsiento()+"\nEstado del asiento:"+pasajero1.getEstadoAsiento()+"\nNombre del conductor:"+pasajero1.getNombredelConductor()+"\nNombre de la placa:"+pasajero1.getNombredelaPlaca());
     }

 



}//fin de la clase menu
