/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todocodejpa.controladoraMetodos;

import com.mycompany.todocodejpa.controladoraDePersitencia.ControladoraPersistenciaAlumno;
import com.mycompany.todocodejpa.logica.Alumno;
import java.util.ArrayList;

/**
 *
 * @author brizu
 */
public class ControladoraAlumno {
    ControladoraPersistenciaAlumno contrPerAlumno= new ControladoraPersistenciaAlumno();
    
    public void crearAlumno(Alumno alu){
    contrPerAlumno.crearAlumno(alu);}
    
    public  void eliminarAlumno(int id){
    contrPerAlumno.eliminarAlumno(id);}
    
    public void editarAlumno(Alumno alu){
    contrPerAlumno.editarAlumno(alu);}
    
    public Alumno traerAlumno(int id){
        return   contrPerAlumno.traerAlumno(id);
    }
    public ArrayList<Alumno> treaerListaAlumnos(){
    return contrPerAlumno.traerListaAlumnos();}
}
