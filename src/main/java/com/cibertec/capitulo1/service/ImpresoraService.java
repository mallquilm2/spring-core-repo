/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.capitulo1.service;

import com.cibertec.capitulo1.beans.Imprimible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class ImpresoraService {
    
    @Autowired
    @Qualifier("documentoTexto")
    private Imprimible documento;
    
    public ImpresoraService(){}

    public ImpresoraService(Imprimible documento) {
        this.documento = documento;
    }
    
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
