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
public class Medico {
    private String cedula;
    private String name;
    private String phone;
    public Medico(String cedula, String name, String phone){
        this.cedula = cedula;
        this.name = name;
        this.phone = phone;
    }
    
    public boolean equals(String cedula){
        return this.cedula.equals(cedula);
    }
    
    
}
