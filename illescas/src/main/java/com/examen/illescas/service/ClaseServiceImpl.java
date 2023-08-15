/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.illescas.service;

import com.examen.illescas.modelo.Asignatura;
import com.examen.illescas.repositorio.ClaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class ClaseServiceImpl extends GenericServiceImpl<Asignatura, Long> implements GenericService<Asignatura, Long> {

    @Autowired
    ClaseRepository claseRep;
    
    @Override
    public CrudRepository<Asignatura, Long> getDao() {
        return claseRep;
    }
    
}
