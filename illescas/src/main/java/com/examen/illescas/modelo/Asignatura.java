/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.illescas.modelo;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author LENOVO
 */
@Document(collection = "Asignatura")
@Data
public class Asignatura {

    @Id
    private int idasignatura;
    private String nombre;
    private int n_horas;
    private int n_horas_practicas;
    private int n_horas_autonomas;

    private Ciclo ciclos;
    private Carrera carreras;
    private List<Estudiante> estudiantes;

}
