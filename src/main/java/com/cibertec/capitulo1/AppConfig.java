/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.capitulo1;

import com.cibertec.capitulo1.beans.HolaMundo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean
    public HolaMundo HolaMundoBean(){
        return new HolaMundo();
    }
    
}
