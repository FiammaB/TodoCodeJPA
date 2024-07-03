
package com.mycompany.todocodejpa.controladoraDePersitencia;

import com.mycompany.todocodejpa.logica.Alumno;
import com.mycompany.todocodejpa.persitencia.AlumnoJpaController;
import com.mycompany.todocodejpa.persitencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistenciaAlumno {
    AlumnoJpaController alujpaAlumnoJpaController=new AlumnoJpaController();

    public void crearAlumno(Alumno alu) {
        alujpaAlumnoJpaController.create(alu);  }

    public void eliminarAlumno(int id) {
        try {
            alujpaAlumnoJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistenciaAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
 }

    public void editarAlumno(Alumno alu) {
        try {
            alujpaAlumnoJpaController. edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistenciaAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    public Alumno traerAlumno(int id) {
     return  alujpaAlumnoJpaController.findAlumno(id);   }

    public ArrayList<Alumno> traerListaAlumnos() {
        List<Alumno> listita = alujpaAlumnoJpaController.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos= new ArrayList<Alumno>(listita);
       return  listaAlumnos;  }
    

}
