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
@WebService(serviceName = "CRUDMedico")
public class CRUDMedico {
    
    private List<Medico> medicos;

   public CRUDMedico(){
       medicos = new ArrayList<>();
   }
    /**
     * Web service operation
     * @return medicos
     */
    @WebMethod(operationName = "read")
    public String read() {        
        return medicos.toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "create")
    public boolean create(@WebParam(name = "cedula") String cedula, @WebParam(name = "name") String name, @WebParam(name = "phone") String phone) {
        return medicos.add(new Medico(cedula,name, phone));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "update")
    public boolean update(@WebParam(name = "cedula") String cedula, @WebParam(name = "newCedula") String newCedula, @WebParam(name = "newName") String newName, @WebParam(name = "newPhone") String newPhone) {
        borrar(cedula);
        return medicos.add(new Medico(newCedula,newName, newPhone));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "delete")
    public boolean delete(@WebParam(name = "cedula") String cedula) {
        return borrar(cedula);
    }
    
    public boolean borrar(String cedula){
        return medicos.remove(buscar(cedula));
    }
    
    public Medico buscar(String cedula){
        for(Medico medico : medicos){
            if(medico.equals(cedula)){
                return medico;
            }
        }
        return null;
    }
    
    
}
