/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todocodejpa.controladoraDePersitencia;

import com.mycompany.todocodejpa.logica.Materia;
import com.mycompany.todocodejpa.persitencia.MateriaJpaController;
import com.mycompany.todocodejpa.persitencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brizu
 */
public class ControladoraPersistenciaMateria {
    MateriaJpaController materiaJpaController= new MateriaJpaController();
    public void crearMateria(Materia mate) {
     materiaJpaController.create(mate);   }

    public void eliminarMateria(int id) {
        try {
            materiaJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistenciaMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
 }

    public void editarMateria(Materia mate) {
        try {
            materiaJpaController.edit(mate);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistenciaMateria.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    

    public Materia traerMateria(int id) {
       return materiaJpaController.findMateria(id);
   }

    public LinkedList<Materia> traerListaMaterias() {
        List<Materia> listMaterias= materiaJpaController.findMateriaEntities();
        LinkedList<Materia>listaMaterias =new LinkedList<Materia>(listMaterias);
      return  listaMaterias;    }
    
}
