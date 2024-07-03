
package com.mycompany.todocodejpa.controladoraMetodos;

import com.mycompany.todocodejpa.controladoraDePersitencia.ControladoraPersistenciaCarrera;
import com.mycompany.todocodejpa.logica.Carrera;
import java.util.ArrayList;


public class ControladoraCarrera {
        ControladoraPersistenciaCarrera contrPerAlumno= new ControladoraPersistenciaCarrera();
    
    public void crearCarrera(Carrera carre){
    contrPerAlumno.crearCarrera(carre);}
    
    public  void eliminarAlumno(int id){
    contrPerAlumno.eliminarCarrera(id);}
    
    public void editarAlumno(Carrera carre){
    contrPerAlumno.editarCarrera(carre);}
    
    public Carrera traerCarrera(int id){
        return   contrPerAlumno.traerCarrera(id);
    }
    public ArrayList<Carrera> treaerListaCarrera(){
    return contrPerAlumno.traerListaCarrera();
    }
}
