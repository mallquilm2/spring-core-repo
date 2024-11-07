/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.capitulo1.service;

import com.cibertec.capitulo1.beans.Imprimible;

/**
 *
 * @author Adminfoco
 */
public class ImpresoraService {
    
    public ImpresoraService(){}

    public ImpresoraService(Imprimible documento) {
        this.documento = documento;
    }
    
    private Imprimible documento;
    
    
    
    public void imprimirDocumento(){
        System.out.println(documento.imprimir());
    }

    public Imprimible getDocumento() {
        return documento;
    }

    public void setDocumento(Imprimible documento) {
        this.documento = documento;
    }
    
    
            
}
