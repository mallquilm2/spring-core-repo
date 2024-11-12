/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.capitulo1.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AuditoriaAOP {
    
    @Pointcut("execution(* com.cibertec.capitulo1.beans.*.*(..))")
    public void serviceMethod(){}
    
    @Before("serviceMethod()")
    public void alertarAntes(){
        System.out.println("Auditoria ANTES del método");
    }
    @After("serviceMethod()")
    public void alertarDespues(){
        System.out.println("Auditoria DESPUES del método");
    }
    @AfterThrowing("serviceMethod()")
    public void alertarExcepcion(){
        System.out.println("Auditoria en la EXCEPCION");
    }
    
}
