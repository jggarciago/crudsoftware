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
    private String specialty;
    public Medico(String cedula, String name, String phone, String specialty){
        this.cedula = cedula;
        this.name = name;
        this.phone = phone;
        this.specialty = specialty;
    }
    
    public boolean equals(String cedula){
        return this.cedula.equals(cedula);
    }
    
    
}
