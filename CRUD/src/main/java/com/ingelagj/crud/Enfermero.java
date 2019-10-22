/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingelagj.crud;

/**
 *
 * @author Admin
 */
public class Enfermero {
    private String cedula;
    private String name;
    private String address;
    public Enfermero(String cedula, String name, String address){
        this.cedula = cedula;
        this.name = name;
        this.address = address;
    }
    
    public boolean equals(String cedula){
        return this.cedula.equals(cedula);
    }
    
    
}
