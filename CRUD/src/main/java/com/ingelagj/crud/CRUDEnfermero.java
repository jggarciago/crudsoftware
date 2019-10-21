/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingelagj.crud;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "CRUDEnfermero")
public class CRUDEnfermero {
    
    private List<Enfermero> enfermeros;

   public CRUDEnfermero(){
       enfermeros = new ArrayList<>();
   }
    /**
     * Web service operation
     * @return enfermeros
     */
    @WebMethod(operationName = "read")
    public String read() {        
        return enfermeros.toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "create")
    public boolean create(@WebParam(name = "cedula") String cedula, @WebParam(name = "name") String name, @WebParam(name = "phone") String phone) {
        return enfermeros.add(new Enfermero(cedula,name, phone));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "update")
    public boolean update(@WebParam(name = "cedula") String cedula, @WebParam(name = "newCedula") String newCedula, @WebParam(name = "newName") String newName, @WebParam(name = "newPhone") String newPhone) {
        borrar(cedula);
        return enfermeros.add(new Enfermero(newCedula,newName, newPhone));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "delete")
    public boolean delete(@WebParam(name = "cedula") String cedula) {
        return borrar(cedula);
    }
    
    public boolean borrar(String cedula){
        return enfermeros.remove(buscar(cedula));
    }
    
    public Enfermero buscar(String cedula){
        for(Enfermero enfermero : enfermeros){
            if(enfermero.equals(cedula)){
                return enfermero;
            }
        }
        return null;
    }
    
    
}
