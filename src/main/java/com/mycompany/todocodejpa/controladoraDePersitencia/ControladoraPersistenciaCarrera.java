/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todocodejpa.controladoraDePersitencia;

import com.mycompany.todocodejpa.logica.Alumno;
import com.mycompany.todocodejpa.logica.Carrera;
import com.mycompany.todocodejpa.persitencia.CarreraJpaController;
import com.mycompany.todocodejpa.persitencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brizu
 */
public class ControladoraPersistenciaCarrera {
        CarreraJpaController carreJpaController= new CarreraJpaController();
    public void crearCarrera(Carrera carre) {
        carreJpaController.create(carre);
      }

    public void eliminarCarrera(int id) {
            try {
                carreJpaController.destroy(id);
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(ControladoraPersistenciaCarrera.class.getName()).log(Level.SEVERE, null, ex);
            }
 }

    public void editarCarrera(Carrera carre) {
            try {
                carreJpaController.edit(carre);
            } catch (Exception ex) {
                Logger.getLogger(ControladoraPersistenciaCarrera.class.getName()).log(Level.SEVERE, null, ex);
            }
 }

    public Carrera traerCarrera(int id) {
       return carreJpaController.findCarrera(id) ;  }

    public ArrayList<Carrera> traerListaCarrera() {
        List<Carrera> listitacarre= carreJpaController.findCarreraEntities();
        ArrayList<Carrera> listaCarreras= new ArrayList<Carrera>(listitacarre);
       return  listaCarreras;    }
    
}
