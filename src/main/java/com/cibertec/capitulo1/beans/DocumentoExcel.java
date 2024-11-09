/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.capitulo1.beans;

import org.springframework.stereotype.Repository;

@Repository
public class DocumentoExcel implements Imprimible{
    
    public void iniciar(){
        System.out.println("Iniciando la construccion del bean.");
    }
    
    public void destruir(){
        System.out.println("Destruyendo el bean.");
    }
            

    @Override
    public String imprimir() {
        return "Imprimiendo desde un archivo excel.";
    }
    
}
