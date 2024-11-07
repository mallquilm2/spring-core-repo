/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.capitulo1.beans;

/**
 *
 * @author Adminfoco
 */
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
