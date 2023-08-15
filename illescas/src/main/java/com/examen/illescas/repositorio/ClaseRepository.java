/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examen.illescas.repositorio;

import com.examen.illescas.modelo.Asignatura;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author LENOVO
 */
public interface ClaseRepository extends MongoRepository<Asignatura, Long>{
 
 
    
}
