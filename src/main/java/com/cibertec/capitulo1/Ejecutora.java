/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cibertec.capitulo1;

import com.cibertec.capitulo1.beans.HolaMundo;
import com.cibertec.capitulo1.service.ImpresoraService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Adminfoco
 */
public class Ejecutora {

    public static void main(String[] args) {
        //ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);
        HolaMundo hm = (HolaMundo)contexto.getBean(HolaMundo.class);
        hm.saludar();
        
        HolaMundo hm2 = contexto.getBean(HolaMundo.class);
        System.out.println("compara posiciones de memoria: "+hm +"-"+ hm2);
        hm2.setNombre("Nuevo");
        System.out.println("Valor del primerBean "+hm.getNombre());
        
        ImpresoraService is = (ImpresoraService) contexto.getBean(ImpresoraService.class);
        is.imprimirDocumento();
        
        ((ConfigurableApplicationContext)contexto).close();
        
    }
}
