/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.illescas.controller;

import com.examen.illescas.modelo.Asignatura;
import com.examen.illescas.service.ClaseServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/api/Asignatura")
public class AsignaturaController {

    @Autowired
    ClaseServiceImpl servfabri;

    @GetMapping("/listar")
    public ResponseEntity<List<Asignatura>> listarAsignatura() {
        return new ResponseEntity<>( servfabri.findByAll(),HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Asignatura> crearAsignatura(@RequestBody Asignatura p) {
        return new ResponseEntity<>( servfabri.save(p),HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Asignatura> actualizarAsignatura(@PathVariable Long id, @RequestBody Asignatura f) {
        Asignatura ven = servfabri.findById(id);
        if (ven == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
               f.setIdasignatura(ven.getIdasignatura());
                return new ResponseEntity<>(servfabri.save(f), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Asignatura> eliminarAsignatura(@PathVariable Long id) {
        servfabri.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
