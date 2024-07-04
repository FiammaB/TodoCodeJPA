/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todocodejpa.controladoraMetodos;

import com.mycompany.todocodejpa.controladoraDePersitencia.ControladoraPersistenciaMateria;
import com.mycompany.todocodejpa.logica.Materia;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author brizu
 */
public class ControladoraMateria {
    ControladoraPersistenciaMateria contrPersiMateria = new ControladoraPersistenciaMateria();
    
    public void crearMateria(Materia mate){
    contrPersiMateria.crearMateria(mate);}
    
    public  void eliminarMateria (int id){
    contrPersiMateria.eliminarMateria (id);}
    
    public void editarMateria (Materia  mate){
    contrPersiMateria.editarMateria (mate);}
    
    public Materia  traerMateria (int id){
        return   contrPersiMateria.traerMateria (id);
    }
    public LinkedList<Materia > treaerListaMaterias(){
    return contrPersiMateria.traerListaMaterias();
    }
}
