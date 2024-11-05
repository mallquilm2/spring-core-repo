/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.cibertec.capitulo1;

import com.cibertec.capitulo1.beans.HolaMundo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Adminfoco
 */
public class Ejecutora {

    public static void main(String[] args) {
        ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
        HolaMundo hm = (HolaMundo)contexto.getBean("holaMundo");
        hm.saludar();
    }
}
