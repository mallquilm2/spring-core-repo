/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.capitulo1.beans;

import org.springframework.stereotype.Controller;

@Controller
public class DocumentoTexto implements Imprimible{

    public void iniciar(){
        System.out.println("Iniciando la construccion del bean de TEXTO");
    }
    
    public void destruir(){
        System.out.println("Destruyendo el bean de TEXTO");
    }
    
    @Override
    public String imprimir() {
        String abc = null;
        abc.getBytes();
        return "Imprimiendo desde un archivo de texto.";
    }
    
}
