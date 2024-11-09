/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.capitulo1.service;

import org.springframework.stereotype.Service;

@Service
public class AuditoriaAOP {
    
    public void alertarAntes(){
        System.out.println("Auditoria ANTES del método");
    }
    
    public void alertarDespues(){
        System.out.println("Auditoria DESPUES del método");
    }
    
    public void alertarExcepcion(){
        System.out.println("Auditoria en la EXCEPCION");
    }
    
}
