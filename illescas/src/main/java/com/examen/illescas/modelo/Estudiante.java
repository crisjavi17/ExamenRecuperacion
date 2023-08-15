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
@Document(collection = "Estudiante")
@Data
public class Estudiante {

    @Id
    private int idestudiante;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String direccion;
    private Periodo periodos;
    private List<Asignatura> aignaturas;

}
