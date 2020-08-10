/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.claseprincipal;

/**
 *
 * @author Usuario
 */
public class Tiquete {
   
    private String nombrePasajero;
    private String nombredelaPlaca;
    private  String nombredelConductor; 
    private String Fecha;
    private int numeroVagon;
    private int numeroAsiento;
    private char estadoAsiento;

    public Tiquete(){
        Fecha = "";
        nombrePasajero = "";
        numeroVagon = 0;
        numeroAsiento = 0;
        estadoAsiento = 0;
        nombredelaPlaca = "";
        nombredelConductor = "";
    }
    public Tiquete(String nombrePasajero, String nombredelaPlaca, String nombredelConductor, String Fecha, int numeroVagon, int numeroAsiento, char estadoAsiento) {
        this.nombrePasajero = nombrePasajero;
        this.nombredelaPlaca = nombredelaPlaca;
        this.nombredelConductor = nombredelConductor;
        this.Fecha = Fecha;
        this.numeroVagon = numeroVagon;
        this.numeroAsiento = numeroAsiento;
        this.estadoAsiento = estadoAsiento;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public String getNombredelaPlaca() {
        return nombredelaPlaca;
    }

    public void setNombredelaPlaca(String nombredelaPlaca) {
        this.nombredelaPlaca = nombredelaPlaca;
    }

    public String getNombredelConductor() {
        return nombredelConductor;
    }

    public void setNombredelConductor(String nombredelConductor) {
        this.nombredelConductor = nombredelConductor;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getNumeroVagon() {
        return numeroVagon;
    }

    public void setNumeroVagon(int numeroVagon) {
        this.numeroVagon = numeroVagon;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public char getEstadoAsiento() {
        return estadoAsiento;
    }

    public void setEstadoAsiento(char estadoAsiento) {
        this.estadoAsiento = estadoAsiento;
    }
    
    
    
    
    
    
    
    
    
}//fin de la clase Tiquete
